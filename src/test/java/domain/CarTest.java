package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {

    @Test
    @DisplayName("자동차 이름 5자리 이하 성공")
    void 자동차_이름_5자리_이하_성공() {
        assertDoesNotThrow(() -> new Car("pobi"));
    }

    @Test
    @DisplayName("자동차 이름 5자리 초과 실패")
    void 자동차_이름_5자리_초과_실패() {
        assertThrows(IllegalArgumentException.class, () -> new Car("123456"));
    }

    @Test
    @DisplayName("자동차 전진 조건 참")
    void 자동차_전진_조건_참() {
        Car car = new Car("pobi");
        car.move(() -> true);
        assertThat(car.getPosition()).isEqualTo(new Position(1));
    }

    @Test
    @DisplayName("자동차 전진 조건 거짓")
    void 자동차_전진_조건_거짓() {
        Car car = new Car("pobi");
        car.move(() -> false);
        assertThat(car.getPosition()).isEqualTo(new Position(0));
    }
}
