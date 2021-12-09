package designpatterns.behavioral.strategy;

public class Warrior {
    private HitStrategy hitStrategy;

    public Warrior(HitStrategy hitStrategy) {
        this.hitStrategy = hitStrategy;
    }

    public void hit(){
        hitStrategy.hit();
    }
}
