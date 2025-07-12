public class Bird extends Animal implements FlightEnabled, Trackable {

    @Override
    public void move() {
        System.out.println("Flaps wings to fly");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is starting");
        System.out.println("Bird takes off into the sky");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
        System.out.println("Bird lands gracefully on the ground");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying high in the sky");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates are being tracked");

    }
}
