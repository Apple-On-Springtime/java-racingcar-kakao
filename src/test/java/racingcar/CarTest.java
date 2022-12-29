package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarTest {

    private final Car car =  new Car("pobi");

    @ParameterizedTest
    @ValueSource(strings = {"pobi", "jaws", "jayde"})
    public void 자동차_생성_성공(String input) {
        org.junit.jupiter.api.Assertions.assertDoesNotThrow(() -> {
            new Car(input);
        });
    }

    @ParameterizedTest
    @ValueSource(strings = {"   ", "jayden"})
    public void 잘못된_이름의_자동차_생성시_실패(String input) {
        Assertions.assertThatExceptionOfType(RuntimeException.class)
                .isThrownBy(() -> new Car(input)).withMessage("잘못된 자동차 이름입니다.");
    }

    @Test
    public void 랜덤값이_4이상이면_전진() {
        car.moveWithPower(4);
        Assertions.assertThat(car.getCurrentStatus()).isEqualTo("pobi : --");
    }

    @Test
    public void 랜덤값이_3이하면_정지() {
        car.moveWithPower(3);
        Assertions.assertThat(car.getCurrentStatus()).isEqualTo("pobi : -");
    }
}
