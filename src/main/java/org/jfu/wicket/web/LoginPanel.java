package org.jfu.wicket.web;

import org.apache.wicket.markup.html.panel.Panel;

public class LoginPanel extends Panel {

    public LoginPanel(String id) {
        super(id);
        add(new LoginForm("loginForm"));
    }

}
