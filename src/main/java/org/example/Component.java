package org.example;

import java.util.ArrayList;

public abstract class Component {
    private String name;
    private Component parent;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract Component getChild(String name);

    public abstract void show(String ident);

    public String getName() {
        return name;
    }

    protected void setParent(Component component) {
        this.parent = component;
    }

    public String getParentName() {
        if (this.parent == null) return "Nulo";
        return this.parent.getName();
    }

    public Component getParent() {
        return parent;
    }

    public Component getParentRoot() {
        if (this.parent == null) return this;
        return this.parent.getParentRoot();
    }

    public String getParentRootName() {
        if (this.parent == null) return this.name;
        return this.getParent().getParentRoot().name;
    }
}
