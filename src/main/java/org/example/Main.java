package org.example;

public class Main {
    public static void main(String[] args) {

        Composite c1 = new Composite("caixa");
        Composite c2 = new Composite("bau");
        Leaf l1 = new Leaf("obj1");
        Leaf l2 = new Leaf("obj2");
        Leaf l3 = new Leaf("obj3");

        c1.add(l1);
        c1.add(c2);
        c2.add(l3);
        c2.add(l2);

        l1.show("");
        System.out.println("--------------------------------");
        c1.show("");
        System.out.println("--------------------------------");
        c2.show("");
        System.out.println("--------------------------------");

        System.out.println(c2.getParentName());
        System.out.println(c2.getRootParentName());
        System.out.println(l3.getRootParentName());
    }
}