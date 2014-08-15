package org.jfu.wicket.web;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;

public class LoginForm extends Form<LoginForm> {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private String loginStatus;

    public LoginForm(String id) {
        super(id);
        setDefaultModel(new CompoundPropertyModel<LoginForm>(this));
        add(new TextField<String>("username"));
        add(new PasswordTextField("password"));
        add(new Label("loginStatus"));
    }

    @Override
    protected void onSubmit() {
        if(username.equals("test") && password.equals("test"))
            loginStatus = "Congratulations!";
        else
            loginStatus = "Wrong username or password !";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

}
