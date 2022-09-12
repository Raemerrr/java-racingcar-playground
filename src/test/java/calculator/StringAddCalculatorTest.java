package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringAddCalculatorTest {

    @Test
    @DisplayName("빈 값 입력")
    void 빈값입력() {
        int result = StringAddCalculator.splitAndSum(null);
        assertThat(result).isEqualTo(0);
        result = StringAddCalculator.splitAndSum("");
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("숫자 하나 입력")
    void 숫자_하나_입력() {
        int result = StringAddCalculator.splitAndSum("1");
        assertThat(result).isEqualTo(1);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2@3", "1,2,3@6", "1,2:3@6"}, delimiter = '@')
    @DisplayName("정상 입력")
    void 정상입력(String input, Integer expected) {
        int result = StringAddCalculator.splitAndSum(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("커스텀입력")
    void 커스텀입력() {
        String input = "//;\n1;2;3";
        int result = StringAddCalculator.splitAndSum(input);
        assertThat(result).isEqualTo(6);
        input = "//-\n1-2-3";
        result = StringAddCalculator.splitAndSum(input);
        assertThat(result).isEqualTo(6);
    }

    @Test
    @DisplayName("음수 입력")
    void 음수입력() {
        String input = "1,-2,3";
        assertThrows(RuntimeException.class, () -> StringAddCalculator.splitAndSum(input));
    }
}
