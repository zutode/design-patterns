package designpatterns.creational.singleton.ver2;

public class Earth {

    private static Earth INSTANCE;

    ////1 sposób
    /*public synchronized static Earth getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Earth();
        }
        return INSTANCE;
    }*/

    //2 sposób
    public static Earth getInstance() {
        if (INSTANCE == null) {
            synchronized (Earth.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Earth();
                }
            }
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
