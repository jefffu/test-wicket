package org.jfu.wicket.web;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.StatelessLink;

public class TestForm extends WebPage {

    private static final long serialVersionUID = 1L;

    public TestForm() {
        super();
        add(new LoginForm("loginForm"));

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
