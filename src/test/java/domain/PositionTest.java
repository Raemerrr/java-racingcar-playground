package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PositionTest {

    @Test
    @DisplayName("정상 범위 숫자 입력")
    void 정상_범위_숫자_입력() {
        assertDoesNotThrow(() -> new Position(0));
    }

    @Test
    @DisplayName("비정상 범위 숫자 입력")
    void 비정상_범위_숫자_입력() {
        assertThrows(IllegalArgumentException.class, () -> new Position(-1));
    }
}
