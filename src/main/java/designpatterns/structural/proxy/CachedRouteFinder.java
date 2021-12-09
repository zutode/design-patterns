package designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CachedRouteFinder implements RouteFinder {
    private RouteFinder routeFinder;
    private Map<Waypoints, List<String>> cache = new HashMap<>();

    public CachedRouteFinder(RouteFinder routeFinder) {
        this.routeFinder = routeFinder;
    }

    @Override
    public List<String> findRoute(String origin, String destination) {
        Waypoints waypoints = new Waypoints(origin, destination);
        if(cache.containsKey(waypoints)) {
            return cache.get(waypoints);
        } else {
            List<String> route = routeFinder.findRoute(origin, destination);
            cache.put(waypoints, new ArrayList<>());
            return route;
        }
    }
}
