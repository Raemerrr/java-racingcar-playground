package model;

public class StringAsInteger extends Number {

    private final String text;

    public StringAsInteger(String text) {
        this.text = text;
    }

    @Override
    public int intValue() {
        int result;
        try {
            result = Integer.parseInt(text);
        } catch (Exception e) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
        return result;
    }

    @Override
    public long longValue() {
        long result;
        try {
            result = Long.parseLong(text);
        } catch (Exception e) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
        return result;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
