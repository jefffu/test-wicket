package org.jfu.wicket.web;

import org.apache.wicket.markup.html.link.StatelessLink;
import org.apache.wicket.markup.html.panel.Panel;

public class FooterPanel extends Panel {

    private static final long serialVersionUID = 1L;

    public FooterPanel(String id) {
        super(id);
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
