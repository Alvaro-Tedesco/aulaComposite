package org.example;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void show(String ident) {
        System.out.println(ident + this.getName());
    }
}
