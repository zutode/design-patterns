package designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        House house = new House.Builder()
                .withGarage(true)
                .withAddress("kdjakd")
                .withRoomCount(5)
                .build();

        System.out.println(house);

    }
}
