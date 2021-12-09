package designpatterns.creational.prototype.ver2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ChristmasTree christmasTree = new ChristmasTree(170, "Jodła Kaukaska", true);
        System.out.println(christmasTree);
        ChristmasTree clone = new ChristmasTree(christmasTree);
        System.out.println(clone);
    }
}
