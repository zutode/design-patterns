package designpatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        PressPublisher pressPublisher = new PressPublisher("Wydawca 1");
        pressPublisher.publish("Gazeta ABC");

        PressReader pressReader1 = new PressReader("Jan Kowalski");
        pressPublisher.addObserver(pressReader1);
        pressPublisher.publish("Gazeta XYZ");

        PressReader pressReader2 = new PressReader("Jan Nowak");
        pressPublisher.addObserver(pressReader2);
        Billboard billboard = new Billboard();
        pressPublisher.addObserver(billboard);
        pressPublisher.publish("Gazeta GSF");


    }
}
