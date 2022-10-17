package org.example;

import java.util.ArrayList;

public class Composite extends Component {

    private ArrayList<Component> components;

    public Composite(String name) {
        super(name);
        this.components = new ArrayList<>();
    }

    @Override
    public void add(Component c) {
        c.setParent(this);
        this.components.add(c);
    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(String name) {
        return null;
    }

    @Override
    public void show(String ident) {
        System.out.println((ident == null ? "" : ident) + this.getName());
        for (Component c: this.components) {
            c.show("-" + (ident == null ? "" : ident));
        }
    }

}
