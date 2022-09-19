package domain;

public class CarName {
    private static final int CAR_NAME_LENGTH_LIMIT = 5;

    private final String name;

    public CarName(final String input) {
        validateCarNameLength(input);
        this.name = input;
    }

    public String getName() {
        return this.name;
    }

    private void validateCarNameLength(final String input) {
        if (CAR_NAME_LENGTH_LIMIT < input.length()) {
            throw new IllegalArgumentException("자동차 이름은 " + CAR_NAME_LENGTH_LIMIT + "자를 초과할 수 없습니다.");
        }
    }
}
