package designpatterns.structural.composite;

import java.nio.file.Watchable;

public class Main {
    public static void main(String[] args) {

        Product bread = new Bread();
        Product water = new BottledWater();
        System.out.println(bread.getPrice());

        CompositeProduct compositeProduct1 = new CompositeProduct(bread, water);
        CompositeProduct compositeProduct2 = new CompositeProduct(new Bread(), new Bread(), new BottledWater(), compositeProduct1);
        System.out.println(compositeProduct2.getPrice());
    }
}
