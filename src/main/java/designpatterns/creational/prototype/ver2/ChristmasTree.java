package designpatterns.creational.prototype.ver2;

public class ChristmasTree{
    private int height;
    private String species;
    private boolean decorated;

    public ChristmasTree(int height, String species, boolean decorated) {
        this.height = height;
        this.species = species;
        this.decorated = decorated;
    }

    public ChristmasTree(ChristmasTree christmasTree){
        height = christmasTree.height;
        species = christmasTree.species;
        decorated = christmasTree.decorated;
    }

    @Override
    public String toString() {
        return "ChristmasTree{" +
                "height=" + height +
                ", species='" + species + '\'' +
                ", decorated=" + decorated +
                '}';
    }

}
