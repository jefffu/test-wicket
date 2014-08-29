package org.jfu.wicket.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Check;
import org.apache.wicket.markup.html.form.CheckGroup;
import org.apache.wicket.markup.html.form.CheckGroupSelector;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.PropertyModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckboxPanel2 extends Panel {
    private static final long serialVersionUID = 1L;

    private static Logger logger = LoggerFactory.getLogger(CheckboxPanel2.class);

    public CheckboxPanel2(String id) {
        super(id);

        TestForm form = new TestForm("form");
        add(form);
    }

    public static class TestForm extends Form<TestForm> {

        private static final long serialVersionUID = 1L;

        private List<Fruit> fruits = new LinkedList<CheckboxPanel2.Fruit>();

        public TestForm(String id) {
            super(id);

            setDefaultModel(new CompoundPropertyModel<TestForm>(this));

            List<Fruit> fruitList = new LinkedList<CheckboxPanel2.Fruit>();
            fruitList.add(new Fruit(1, "Apple"));
            fruitList.add(new Fruit(2, "Orange"));
            fruitList.add(new Fruit(3, "Banana"));

            fruits.add(fruitList.get(0));

            CheckGroup<Fruit> group=new CheckGroup<Fruit>("fruits");

            add(group);

            group.add(new CheckGroupSelector("allFruits"));

            ListView<Fruit> fruitsView = new ListView<CheckboxPanel2.Fruit>("fruitsView", fruitList) {
                private static final long serialVersionUID = 1L;

                @Override
                protected void populateItem(ListItem<Fruit> item) {
                    item.add(new Check<Fruit>("checkbox", item.getModel()));
                    item.add(new Label("name", new PropertyModel<String>(item.getModel(), "name")));
                }
            };
            fruitsView.setReuseItems(true);
            group.add(fruitsView);

            Label labelSelectAll = new Label("selectAll", "Select All");
            labelSelectAll.setRenderBodyOnly(true);
            group.add(labelSelectAll);
        }

        public List<Fruit> getFruits() {
            return fruits;
        }

        public void setFruits(List<Fruit> fruits) {
            this.fruits = fruits;
        }

        @Override
        protected void onSubmit() {
            logger.debug("======== onSubmit(), fruits: " + fruits);
        }

    }

    public static class Fruit implements Serializable {
        private static final long serialVersionUID = -6610796997674925587L;
        private int id;
        private String name;
        public Fruit(int id, String name) {
            super();
            this.id = id;
            this.name = name;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return "Fruit [id=" + id + ", name=" + name + "]";
        }
    }
}
