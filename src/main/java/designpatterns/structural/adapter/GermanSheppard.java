package designpatterns.structural.adapter;

public class GermanSheppard implements Dog {
    @Override
    public void run() {
        System.out.println("Owczarek niemiecki biegnie");
    }

    @Override
    public void bark() {
        System.out.println("Owczarek niemiecki szczeka");
    }
}
