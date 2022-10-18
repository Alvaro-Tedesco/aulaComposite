package org.example;

import java.util.ArrayList;

public class Composite extends Component {
    private final ArrayList<Component> components;

    public Composite(String name) {
        super(name);
        this.components = new ArrayList<>();
    }

    public void add(Component c) {
        if (this.checkParent(c)) {
            System.out.println("O Component " + c.getName() + " já está na arvore");
            return;
        }
        this.components.add(c);
        c.setParent(this);
    }

    public void show(String ident) {
        System.out.println(ident + this.getName());
        for (Component c : this.components) {
            c.show(ident + "-");
        }
    }
}
