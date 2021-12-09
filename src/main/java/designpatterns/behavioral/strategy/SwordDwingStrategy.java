package designpatterns.behavioral.strategy;

public class SwordDwingStrategy implements HitStrategy {
    @Override
    public void hit() {
        System.out.println("Zamachnięcie mieczem");
    }
}
