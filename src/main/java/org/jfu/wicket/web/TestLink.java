package org.jfu.wicket.web;

public class TestLink extends MyTemplate {
    private static final long serialVersionUID = 1L;

    public TestLink() {
        super("Test Link");

        replace(new TestLinkPanel(CONTENT_ID));
    }

}
