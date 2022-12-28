package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PositionTest {
    @Test
    @DisplayName("Position이 이동할 때")
    void compareTest() {
        Position position1 = new Position(0);
        Position position2 = new Position(0);
        position1.move();
        Assertions.assertThat(position1.compareTo(position2)).isEqualTo(1);
    }
}