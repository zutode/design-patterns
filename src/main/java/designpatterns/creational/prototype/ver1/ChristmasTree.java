package designpatterns.creational.prototype.ver1;

public class ChristmasTree implements Cloneable{
    private int height;
    private String species;
    private boolean decorated;

    public ChristmasTree(int height, String species, boolean decorated) {
        this.height = height;
        this.species = species;
        this.decorated = decorated;
    }

    @Override
    public String toString() {
        return "ChristmasTree{" +
                "height=" + height +
                ", species='" + species + '\'' +
                ", decorated=" + decorated +
                '}';
    }

    public ChristmasTree clone() throws CloneNotSupportedException{
        return (ChristmasTree) super.clone();
    }
}
