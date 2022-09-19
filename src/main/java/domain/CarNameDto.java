package domain;

public class CarNameDto {

    private final String name;

    public CarNameDto(final CarName carName) {
        this.name = carName.getName();
    }

    public String getName() {
        return this.name;
    }
}
