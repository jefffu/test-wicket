package org.jfu.wicket.web;

import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingleCheckboxPanel extends Panel {
    private static final long serialVersionUID = 1L;

    private static Logger logger = LoggerFactory.getLogger(SingleCheckboxPanel.class);

    public SingleCheckboxPanel(String id) {
        super(id);
        TestForm form = new TestForm("form");
        add(form);

        FeedbackPanel feedbackPanel = new FeedbackPanel("feedback");
        add(feedbackPanel);
    }

    public static class TestForm extends Form<TestForm> {

        private static final long serialVersionUID = 1L;

        private boolean check = false;

        public TestForm(String id) {
            super(id);

            setDefaultModel(new CompoundPropertyModel<TestForm>(this));

            add(new CheckBox("check"));

        }

        public boolean isCheck() {
            return check;
        }

        public void setCheck(boolean check) {
            this.check = check;
        }

        @Override
        protected void onSubmit() {
            logger.debug("======== onSubmit(), check: " + check);
            info("checked: " + check);
        }

    }

}
