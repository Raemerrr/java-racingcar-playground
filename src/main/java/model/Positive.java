package model;

public class Positive {

    private Number value;

    public Positive() {
        this.value = 0;
    }

    public Positive(String text){
        this.value = new StringAsInteger(text);
        validatePositive();
    }

    public void plus() {
        this.value = this.value.intValue() + 1;
    }

    public Integer intValue() {
        return value.intValue();
    }

    private void validatePositive() {
        if (this.value.intValue() < 0) {
            throw new IllegalArgumentException("0 보다 작은 수를 입력 할 수 없습니다.");
        }
    }
}
