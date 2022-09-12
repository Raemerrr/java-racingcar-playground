package calculator;

public class StringAsInteger extends Number {

    private final String text;

    public StringAsInteger(String text) {
        this.text = text;
    }

    @Override
    public int intValue() {
        int result;
        try {
            result = Integer.parseInt(this.text);
            validatePositiveNumber(result);
        } catch (Exception e) {
            throw new RuntimeException("옳바른 입력이 아닙니다.");
        }
        return result;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    private void validatePositiveNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("음수 입력 불가");
        }
    }
}
