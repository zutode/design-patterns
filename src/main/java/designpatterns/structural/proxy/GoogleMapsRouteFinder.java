package designpatterns.structural.proxy;

import java.util.Arrays;
import java.util.List;

public class GoogleMapsRouteFinder implements RouteFinder {
    @Override
    public List<String> findRoute(String origin, String destination) {
        System.out.println("Pytamy serwis google'owy o trasę z " + origin + " do " + destination);
        return Arrays.asList("Wyrusz z " + origin, "Sskręć w prawo, jedź 5 km prosto", "na rondzie drugi zjazd.", "Dotarłeś do celu " + destination);
    }
}
