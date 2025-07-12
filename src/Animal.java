
enum FlightStages implements Trackable {GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION, LANDING, LANDED;

    @Override
    public void track() {

        if (this == GROUNDED) {
            System.out.println(this + " is grounded and not in flight.");
        } else if (this == LAUNCH) {
            System.out.println(this + " is in the launch phase.");
        } else if (this == CRUISE) {
            System.out.println(this + " is cruising at altitude.");
        } else if (this == DATA_COLLECTION) {
            System.out.println(this + " is collecting data during flight.");
        } else if (this == LANDING) {
            System.out.println(this + " is preparing to land.");
        } else if (this == LANDED) {
            System.out.println(this + " has landed successfully.");
        }
    }
}



record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void takeOff() {
        System.out.println(name + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(name + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }
}

class Satellite implements OrbitEarth {

    public void achieveOrbit() {
        System.out.println("Orbit achieved around the Earth");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface OrbitEarth extends FlightEnabled {

    void achieveOrbit();
}

interface FlightEnabled {

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
    void takeOff();
    void land();
    void fly();

}

interface Trackable {
    void track();

}

public abstract class Animal {

    public abstract void move();
}
