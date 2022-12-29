package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class InputParserTest {

    private final InputParser inputParser = new InputParser();

    @Test
    public void 입력값_콤마_파싱() {
        String[] carNames = inputParser.splitByComma("pobi,jaws,jayde");
        Assertions.assertThat(carNames).containsExactly("pobi", "jaws", "jayde");
    }

    @ParameterizedTest
    @CsvSource(value = {"1:1", "12:12", "500:500"}, delimiter = ':')
    public void 실행횟수_입력_파싱(String input, int expected) {
        int answer = inputParser.parseToInt(input);
        Assertions.assertThat(answer).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(strings = {"asd", "0", "-12", "", "   "})
    public void 실행횟수_입력_검증(String input) {
        Assertions.assertThatExceptionOfType(RuntimeException.class)
                .isThrownBy(() -> inputParser.parseToInt(input)).withMessage("1 이상의 숫자만 입력해야합니다.");
    }
}