package model;

public class CarName {
    private static final int CAR_NAME_LENGTH_LIMIT = 5;
    private final String carName;

    public CarName(String input) {
        this.carName = input;
        validateCarNameLength();
    }

    public String getCarName() {
        return carName;
    }

    private void validateCarNameLength() {
        if (this.carName == null || this.carName.trim().isEmpty() || CAR_NAME_LENGTH_LIMIT < this.carName.length()) {
            throw new IllegalArgumentException(CAR_NAME_LENGTH_LIMIT + "자를 초과할 수 없습니다.");
        }
    }
}
