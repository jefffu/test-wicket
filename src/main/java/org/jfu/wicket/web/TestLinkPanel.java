package org.jfu.wicket.web;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;

public class TestLinkPanel extends Panel {

    private static final long serialVersionUID = 1L;

    private Label firstLabel;
    private Label secondLabel;

    public TestLinkPanel(String id) {
        super(id);

        firstLabel = new Label("label", "First label");
        secondLabel = new Label("label", "Second label");

        setVersioned(true);

        // Change Label link
        add(firstLabel);

        add(new Link<String>("changeLabel") {
            private static final long serialVersionUID = 1L;

            @Override
            public void onClick() {

                if (TestLinkPanel.this.contains(firstLabel, true)) {
                    TestLinkPanel.this.replace(secondLabel);
                }
                else {
                    TestLinkPanel.this.replace(firstLabel);
                }
            }

        });

    }

}
