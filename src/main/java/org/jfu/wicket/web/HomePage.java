package org.jfu.wicket.web;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.StatelessLink;

public class HomePage extends WebPage {

    private static final long serialVersionUID = -9140186315994594376L;

    public HomePage() {
        super();

        // Test Panel Link
        add(new StatelessLink<String>("testPanel") {
            private static final long serialVersionUID = 1L;
            @Override
            public void onClick() {
                setResponsePage(TestPanel.class);
            }

        });

        // Test Form link
        add(new StatelessLink<String>("testForm") {
            private static final long serialVersionUID = 1L;
            @Override
            public void onClick() {
                setResponsePage(TestForm.class);
            }

        });

    }

}
