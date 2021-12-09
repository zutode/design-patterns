package designpatterns.creational.singleton.ver3;

public class Main {

    public static void main(String[] args) {
        //Earth earth = Earth.INSTANCE;
        //System.out.println(earth == Earth.getInstance());

        new Thread(() -> {
            Earth instance1 = Earth.INSTANCE;
        }).start();
        new Thread(() -> {
           Earth instance2 =  Earth.INSTANCE;
        }).start();
    }


}
