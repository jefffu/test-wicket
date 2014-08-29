package org.jfu.wicket.web;

public class TestSingleCheckboxPanel extends MyTemplate {

    private static final long serialVersionUID = 1L;

    public TestSingleCheckboxPanel() {
        super("Test Single Checkbox");

        replace(new SingleCheckboxPanel(CONTENT_ID));

    }

}
