package model;

public class Car {
    private final CarName name;
    private final Positive distance;

    public Car(String name) {
        this.name = new CarName(name);
        this.distance = new Positive();
    }

    public String getName() {
        return name.getCarName();
    }

    public int getDistance() {
        return distance.intValue();
    }
}
