package org.jfu.wicket.web;

public class TestForm2 extends MyTemplate {

    private static final long serialVersionUID = 1L;

    public TestForm2() {
        super("Test Form 2");

        replace(new LoginPanel(CONTENT_ID));

    }

}
