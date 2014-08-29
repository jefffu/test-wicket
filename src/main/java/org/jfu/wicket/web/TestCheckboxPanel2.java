package org.jfu.wicket.web;

public class TestCheckboxPanel2 extends MyTemplate {

    private static final long serialVersionUID = 1L;

    public TestCheckboxPanel2() {
        super("Test Checkbox 2");

        replace(new CheckboxPanel2(CONTENT_ID));

    }

}
