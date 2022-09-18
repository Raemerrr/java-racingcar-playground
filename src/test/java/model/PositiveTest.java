package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PositiveTest {

    @Test
    void 음수가_아닌_수_입력() {
        String input = "123";
        Positive positive = new Positive(new StringAsInteger(input));
        Assertions.assertDoesNotThrow(positive::intValue);
    }

    @Test
    void 음수_입력() {
        String input = "-123";
        Positive positive = new Positive(new StringAsInteger(input));
        assertThrows(IllegalArgumentException.class, positive::intValue);
    }

    @Test
    void 숫자가_아닌_입력() {
        String input = "ㄱㄴㄷㄹㅁ";
        Positive positive = new Positive(new StringAsInteger(input));
        assertThrows(IllegalArgumentException.class, positive::intValue);
    }
}
