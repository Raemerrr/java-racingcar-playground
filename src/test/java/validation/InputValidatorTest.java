package validation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InputValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"pobi", "crong", "honux"})
    void 자동차_이름_5자리_정상_입력_검증(String input) {
        assertDoesNotThrow(() -> InputValidator.isBlankOrMoreThanFiveCharacters(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"123456", "", "    "})
    void 자동차_이름_5자리_비정상_입력_검증(String input) {
        assertThrows(IllegalArgumentException.class, () -> InputValidator.isBlankOrMoreThanFiveCharacters(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "123", "5", "9"})
    void 시도할_횟수_숫자가_아닌_정상_입력_검증(String input) {
        assertDoesNotThrow(() -> InputValidator.isOneDigitNumber(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"r", "-", ",", "실패", "-4"})
    void 시도할_횟수_숫자가_아닌_비정상_입력_검증(String input) {
        assertThrows(IllegalArgumentException.class, () -> InputValidator.isOneDigitNumber(input));
    }
}
