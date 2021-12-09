package designpatterns.creational.singleton.ver1;

public class Earth {

    private static Earth INSTANCE;

    public static Earth getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Earth();
        }
        return INSTANCE;
    }

    private Earth() {
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
