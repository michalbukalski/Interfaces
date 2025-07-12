public class Truck implements Trackable{
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates are being tracked");
    }

    public void loadCargo() {
        System.out.println(getClass().getSimpleName() + " is loading cargo");
    }

    public void unloadCargo() {
        System.out.println(getClass().getSimpleName() + " is unloading cargo");
    }
}
