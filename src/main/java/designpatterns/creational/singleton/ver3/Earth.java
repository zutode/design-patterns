package designpatterns.creational.singleton.ver3;

public enum Earth {

    INSTANCE;



    Earth() {
        System.out.println("Tworze instancję klasy Earth");
    }


    ///////////////////////////////////////
    private double masa = 123456;

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }


}
