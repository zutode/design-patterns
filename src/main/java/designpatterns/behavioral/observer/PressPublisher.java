package designpatterns.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class PressPublisher {
    private final String name;
    private final Set<PressObserver> observers = new HashSet<>();

    public PressPublisher(String name) {
        this.name = name;
    }
    public void publish(String newspaper){
        System.out.println("Wydawca " + name + " wydaje gazee: " + newspaper);
        observers.forEach(observer -> observer.update(newspaper));
    }

    public void addObserver(PressObserver observer){
        observers.add(observer);
    }

}
