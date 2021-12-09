package designpatterns.structural.proxy;

import java.util.Objects;

public class Waypoints {
    private String origin;
    private String destination;

    public Waypoints(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Waypoints waypoints = (Waypoints) o;
        return Objects.equals(origin, waypoints.origin) && Objects.equals(destination, waypoints.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(origin, destination);
    }
}
