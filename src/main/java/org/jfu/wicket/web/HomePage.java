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

        // Test Form 2 link
        add(new StatelessLink<String>("testForm2") {
            private static final long serialVersionUID = 1L;

            @Override
            public void onClick() {
                setResponsePage(TestForm2.class);
            }

        });

        // Test Link link
        add(new StatelessLink<String>("testLink") {
            private static final long serialVersionUID = 1L;

            @Override
            public void onClick() {
                setResponsePage(TestLink.class);
            }

        });

        // Test Single Checkbox
        add(new StatelessLink<String>("testSingleCheckbox") {
            private static final long serialVersionUID = 1L;

            @Override
            public void onClick() {
                setResponsePage(TestSingleCheckboxPanel.class);
            }

        });

        // Test Checkbox 1
        add(new StatelessLink<String>("testCheckbox1") {
            private static final long serialVersionUID = 1L;

            @Override
            public void onClick() {
                setResponsePage(TestCheckboxPanel1.class);
            }

        });

        // Test Checkbox 2
        add(new StatelessLink<String>("testCheckbox2") {
            private static final long serialVersionUID = 1L;

            @Override
            public void onClick() {
                setResponsePage(TestCheckboxPanel2.class);
            }

        });
    }

}
