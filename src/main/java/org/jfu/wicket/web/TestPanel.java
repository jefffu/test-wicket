package org.jfu.wicket.web;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.StatelessLink;
import org.apache.wicket.markup.html.panel.Fragment;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.string.StringValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestPanel extends WebPage{
    private static Logger logger = LoggerFactory.getLogger(TestPanel.class);

    private static final long serialVersionUID = 5397830602565069767L;

    public TestPanel(final PageParameters pageParameters) {
        super(pageParameters);
        // Creating in-line panels with WebMarkupContainer
        WebMarkupContainer informationBox = new WebMarkupContainer("informationBox");
        informationBox.add(new Label("messagesNumber", "10"));
        add(informationBox);

        // Working with markup fragments
        final StringValue fragment = pageParameters.get("fragment");
        logger.debug("======== fragment: " + fragment.toString());
        if (fragment.isNull()) {
            add(new Fragment("contentArea", "fragment1", this));
        } else {
            add(new Fragment("contentArea", "fragment" + fragment.toString(), this));
        }
        add(new StatelessLink<String>("switcher") {
            private static final long serialVersionUID = 1L;
            @Override
            public void onClick() {
                if (fragment.isNull() || fragment.isEmpty() || fragment.toInt() == 1) {
                    pageParameters.set("fragment", "2");
                } else {
                    pageParameters.set("fragment", "1");
                }
                setResponsePage(TestPanel.class, pageParameters);
            }
        });

        // Hiding decorating elements with the wicket:enclosure tag
        Label labelTotalAmount = new Label("totalAmount", "100");
        Label labelDelivDate = new Label("delivDate", "2014-08-14");
        add(labelTotalAmount);
        add(labelDelivDate);

        if (fragment.isNull() || fragment.isEmpty() || fragment.toInt() == 1) {
            labelTotalAmount.setVisible(false);
        }

        // Surrounding existing markup with Border
        MyBorder border1 = new MyBorder("myBorder1", "My Border 1 Title");
        border1.setRenderBodyOnly(true);
        add(border1);
        add(new MyBorder("myBorder2", "My Border 2 Title"));

        // Go Back Home Page Link
        add(new StatelessLink<String>("goBackHome") {
            private static final long serialVersionUID = 1L;
            @Override
            public void onClick() {
                setResponsePage(HomePage.class);
            }
        });
    }


}
