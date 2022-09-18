package model;

public class Positive {

    private Number value;

    public Positive(StringAsInteger value) {
        this.value = value;
    }

    public void plus() {
        this.value = this.value.intValue() + 1;
    }

    public void minus() {
        this.value = this.value.intValue() - 1;
        if (this.isLessThanOrEqualToZero()) {
            this.value = 0;
        }
    }

    public int intValue() {
        if (value.intValue() < 0) {
            throw new IllegalArgumentException("0 보다 작은 수를 입력 할 수 없습니다.");
        }
        return value.intValue();
    }

    private boolean isLessThanOrEqualToZero() {
        return this.value.intValue() <= 0;
    }
}
