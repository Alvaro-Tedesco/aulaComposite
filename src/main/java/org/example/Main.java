package org.example;

public class Main {

    public static void main(String[] args) {


        Composite c1 = new Composite("caixa");
        Composite c2 = new Composite("saco");

        Leaf l1 = new Leaf("objeto 1");
        Leaf l2 = new Leaf("objeto 2");
        Leaf l3 = new Leaf("objeto 3");

        c1.add(l1);
        c1.add(c2);
        c2.add(l3);
        c2.add(l2);

        l1.add(l2);

        l1.show(null);
        c1.show(null);
        c2.show(null);

        System.out.println(c2.getParentRootName());
        System.out.println(l3.getParentRootName());

    }
}
