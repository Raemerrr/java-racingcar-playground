package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarNameTest {

    @Test
    @DisplayName("자동차 이름 5자리 이하 성공")
    void 자동차_이름_5자리_이하_성공() {
        assertDoesNotThrow(() -> new CarName("pobi"));
    }

    @Test
    @DisplayName("자동차 이름 5자리 초과 실패")
    void 자동차_이름_5자리_초과_실패() {
        assertThrows(IllegalArgumentException.class, () -> new CarName("123456"));
    }
}
