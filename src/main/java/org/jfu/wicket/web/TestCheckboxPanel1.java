package org.jfu.wicket.web;

public class TestCheckboxPanel1 extends MyTemplate {

    private static final long serialVersionUID = 1L;

    public TestCheckboxPanel1() {
        super("Test Checkbox 1");

        replace(new CheckboxPanel1(CONTENT_ID));

    }

}
