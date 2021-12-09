package designpatterns.behavioral.observer;

public class Billboard implements PressObserver {

    @Override
    public void update(String newspaper) {
        System.out.println("Bilbord wyswietla reklame gazety: " + newspaper);
    }
}
