package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {

    @ParameterizedTest
    @ValueSource(strings = {"pobi", "crong", "honux"})
    @DisplayName("정상_입력")
    void 정상_입력(String input) {
        assertDoesNotThrow(() -> new Car(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"123456", "", "  "})
    @DisplayName("비정상_입력")
    void 비정상_입력(String input) {
        assertThrows(IllegalArgumentException.class, () -> new Car(input));
    }
}
