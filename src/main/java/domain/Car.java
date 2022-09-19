package domain;

public class Car {
    private final CarName name;
    private final Position position;

    public Car(final String input) {
        this.name = new CarName(input);
        this.position = new Position();
    }

    public void move(final MovementStrategy strategy) {
        if (strategy.isMovable()) {
            position.forward();
        }
    }

    public CarName getName() {
        return this.name;
    }

    public Position getPosition() {
        return new Position(this.position.getValue());
    }
}
