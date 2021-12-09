package designpatterns.creational.builder;

public class House {

    private int area;
    private int stories;
    private int roomCount;
    private boolean garage;
    private String address;

    private House(int area, int stories, int roomCount, boolean garage, String address) {
        this.area = area;
        this.stories = stories;
        this.roomCount = roomCount;
        this.garage = garage;
        this.address = address;
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", stories=" + stories +
                ", roomCount=" + roomCount +
                ", garage=" + garage +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder{
        private int area;
        private int stories;
        private int roomCount;
        private boolean garage;
        private String address;

        public Builder withArea(int area){
            this.area = area;
            return this;
        }

        public Builder withStories(int stories){
            this.stories = stories;
            return this;
        }
        public Builder withRoomCount(int roomCount){
            this.roomCount = roomCount;
            return this;
        }

        public Builder withGarage(boolean garage){
            this.garage = garage;
            return this;
        }

        public Builder withAddress(String address){
            this.address = address;
            return this;
        }

        public House build(){
            return new
                    House(area, stories, roomCount, garage, address);
        }
    }
}
