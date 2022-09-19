package model;

public class PlayResult {
    private final CarName carName;
    private final Positive distance;

    public PlayResult(CarName carName, Positive distance) {
        this.carName = carName;
        this.distance = distance;
    }

    public CarName getCarName() {
        return carName;
    }

    public Positive getDistance() {
        return distance;
    }
}
