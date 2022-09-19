package domain;

public class Car {
    private final CarName name;

    public Car(final String input) {
        this.name = new CarName(input);
    }
}
