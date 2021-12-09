package designpatterns.structural.proxy;

import java.util.List;

public interface RouteFinder {
    List<String> findRoute(String origin, String destination);
}
