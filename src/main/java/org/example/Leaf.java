package org.example;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {

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
    }
}
