package org.jfu.wicket.web;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.border.Border;

public class MyBorder extends Border {

    private static final long serialVersionUID = -7184039996551256849L;

    public MyBorder(String id, String title) {
        super(id);
        addToBorder(new Label("myBorderTitle", title));
    }

}
