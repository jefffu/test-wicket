package org.jfu.wicket.web;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class MyWebApplication extends WebApplication {

    @Override
    protected void init() {
        super.init();
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }

}
