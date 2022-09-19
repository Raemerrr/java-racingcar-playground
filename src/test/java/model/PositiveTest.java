package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PositiveTest {

    @Test
    void 음수가_아닌_수_입력() {
        String input = "123";
        Assertions.assertDoesNotThrow(() -> new Positive(input));
    }

    @Test
    void 음수_입력() {
        String input = "-123";
        assertThrows(IllegalArgumentException.class, () -> new Positive(input));
    }

    @Test
    void 숫자가_아닌_입력() {
        String input = "ㄱㄴㄷㄹㅁ";
        assertThrows(IllegalArgumentException.class, () -> new Positive(input));
    }
}
