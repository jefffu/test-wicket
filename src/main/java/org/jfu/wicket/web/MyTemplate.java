package org.jfu.wicket.web;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class MyTemplate extends WebPage {
    private static final long serialVersionUID = 1L;

    public static final String CONTENT_ID = "contentComponent";

    private Component headerPanel;
    private Component menuPanel;
    private Component footerPanel;

    public MyTemplate(String headerTitle) {
        add(headerPanel = new HeaderPanel("headerPanel", headerTitle));
        add(menuPanel = new MenuPanel("menuPanel"));
        add(footerPanel = new FooterPanel("footerPanel"));
        add(new Label(CONTENT_ID, "Put your content here"));
    }

}
