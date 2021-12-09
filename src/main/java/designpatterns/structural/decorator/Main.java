package designpatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Product product = new Bread();
        System.out.println(product.getPrice());

        DiscountedProduct discountedProduct = new DiscountedProduct(product, 2);
        System.out.println(discountedProduct.getPrice());
        System.out.println(discountedProduct.getDiscountedPrice());
    }
}
