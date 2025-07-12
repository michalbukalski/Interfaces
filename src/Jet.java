public class Jet implements FlightEnabled, Trackable {

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is starting");
        System.out.println("Jet takes off into the sky");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
        System.out.println("Jet lands smoothly on the runway");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying at high speed in the sky");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates are being tracked");
    }

    @Override
    public FlightStages transition(FlightStages stage) {
        System.out.println(getClass().getSimpleName() + " transitioning");
        return FlightEnabled.super.transition(stage);
    }
}
