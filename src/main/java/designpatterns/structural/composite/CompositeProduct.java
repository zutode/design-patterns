package designpatterns.structural.composite;

import java.util.Arrays;

public class CompositeProduct implements Product {

    private Product[] products;

    public CompositeProduct(Product... products) {
        this.products = products;
    }

    @Override
    public int getPrice() {
        return Arrays.stream(products)
                .mapToInt(Product::getPrice)
                .sum();
    }
}
