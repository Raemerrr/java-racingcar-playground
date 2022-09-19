package domain;

import java.util.Objects;

public class Position {
    private int value;

    public Position() {
        this(0);
    }

    public Position(final int input) {
        validateBoundaries(input);
        this.value = input;
    }

    public int getValue() {
        return this.value;
    }

    public void forward() {
        this.value++;
    }

    private void validateBoundaries(final int input) {
        if (input < 0) {
            throw new IllegalArgumentException("0 보다 작을 수 없습니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return value == position.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
