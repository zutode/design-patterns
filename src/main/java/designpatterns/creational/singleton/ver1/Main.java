package designpatterns.creational.singleton.ver1;

public class Main {

    public static void main(String[] args) {
        //Earth earth = Earth.getInstance();
        //System.out.println(earth == Earth.getInstance());

        new Thread(() -> Earth.getInstance()).start();
        new Thread(() -> Earth.getInstance()).start();
    }


}
