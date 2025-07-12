public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move();
        flier.takeOff();
        flier.fly();
        tracked.track();
        flier.land();

        System.out.println("-----------------------");
        inFlight(flier);
        inFlight(new Jet());
        Trackable truck = new Truck();
        truck.track();
        System.out.println("-----------------------");
        inTheRoad(new Truck());
    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void inTheRoad(Trackable tracked) {
        if (tracked instanceof Truck truck) {
            truck.loadCargo();
            truck.unloadCargo();
        }
        tracked.track();
    }
}
