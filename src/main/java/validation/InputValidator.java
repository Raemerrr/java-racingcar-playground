package validation;

public class InputValidator {

    private static final int CAR_NAME_LENGTH_LIMIT = 5;
    private static final String ONLY_NUMBER_REGEX = "[\\d]+";

    public static void isBlankOrMoreThanFiveCharacters(String input) {
        if (input == null || input.trim().isEmpty() || CAR_NAME_LENGTH_LIMIT < input.length()) {
            throw new IllegalArgumentException("자동차 이름은 빈값이거나 5자 보다 길게 입력할 수 없습니다.");
        }
    }

    public static void isOneDigitNumber(String input) {
        if (!input.matches(ONLY_NUMBER_REGEX)) {
            throw new IllegalArgumentException("숫자만 입력 가능합니다.");
        }
    }
}
