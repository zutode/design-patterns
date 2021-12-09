package designpatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        GoogleMapsRouteFinder googleMapsRouteFinder = new GoogleMapsRouteFinder();
        //System.out.println(googleMapsRouteFinder.findRoute("Katowice", "Warszawa"));
        CachedRouteFinder cachedRouteFinder = new CachedRouteFinder(googleMapsRouteFinder);
        System.out.println(cachedRouteFinder.findRoute("Katowice", "Warszawa"));
        System.out.println(cachedRouteFinder.findRoute("Katowice", "Warszawa"));

    }
}
