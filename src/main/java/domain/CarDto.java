package domain;

public class CarDto {
    private final String name;
    private final int position;

    public CarDto(final Car car) {
        this.name = car.getName().getName();
        this.position = car.getPosition().getValue();
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
