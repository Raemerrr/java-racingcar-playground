package model;

public class Positive {

    private Number value;

    public Positive() {
        this.value = 0;
    }

    public Positive(StringAsInteger value) {
        this.value = value;
        validatePositive();
    }

    public void plus() {
        this.value = this.value.intValue() + 1;
    }

    public int intValue() {
        return value.intValue();
    }

    private void validatePositive() {
        if (this.value.intValue() < 0) {
            throw new IllegalArgumentException("0 보다 작은 수를 입력 할 수 없습니다.");
        }
    }
}
