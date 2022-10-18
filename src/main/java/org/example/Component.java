package org.example;

public abstract class Component {
    private final String name;
    private Component parent;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
       return this.name;
    }

    public abstract void show(String ident);

    protected void setParent(Component c) {
        this.parent = c;
    }

    public String getParentName() {
        return this.parent.getName();
    }

    public Component getRootParent() {
        if (this.getParent() == null) return this;
        return this.getParent().getRootParent();
    }

    public String getRootParentName() {
        if (this.getParent() == null) return this.name;
        return this.getParent().getRootParent().name;
    }

    public Component getParent() {
        return this.parent;
    }

    public Boolean checkParent(Component c) {
        if (this.getParent() == null) return false;

        if (this.getParent().getName() == c.getName()) return true;

        return this.getParent().checkParent(c);
    }
}
