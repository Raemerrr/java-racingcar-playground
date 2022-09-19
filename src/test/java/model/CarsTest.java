package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarsTest {

    @Test
    @DisplayName("자동차_생성_정상")
    void 자동차_생성_정상() {
        assertDoesNotThrow(() -> new Cars("pobi,crong,honux"));
    }

    @ParameterizedTest
    @ValueSource(strings = {",crong,honux", "pobi,,honux", "123456"})
    @DisplayName("자동차_생성_비정상")
    void 자동차_생성_비정상(String input) {
        assertThrows(IllegalArgumentException.class, () -> new Cars(input));
    }
}
