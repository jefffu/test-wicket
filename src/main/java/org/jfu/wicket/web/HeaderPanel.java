package org.jfu.wicket.web;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

public class HeaderPanel extends Panel {

    private static final long serialVersionUID = 1L;

    public HeaderPanel(String id, String title) {
        super(id);
        add(new Label("headerTitle", title));
    }

}
