package designpatterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        Dog dog = new GermanSheppard();
        Cat cat = new DogToCatAdapter(dog);
        cat.run();
        cat.meow();
    }
}
