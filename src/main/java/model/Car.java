package model;

import java.util.function.Predicate;

public class Car {
    private final CarName name;
    private final Positive distance;

    public Car(String name) {
        this.name = new CarName(name);
        this.distance = new Positive();
    }

    public CarName getName() {
        return this.name;
    }

    public Positive getDistance() {
        return this.distance;
    }

    public PlayResult play(Predicate<Integer> predicate) {
        Integer randomNumber = RandomGenerator.generate();
        if (predicate.test(randomNumber)) {
            this.distance.plus();
        }
        return new PlayResult(name, distance);
    }
}
