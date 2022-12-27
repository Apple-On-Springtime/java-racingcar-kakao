# java-racingcar-kakao

## 기능 요구사항
- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
- 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.

1. 빈 문자열 또는 null 값을 입력할 경우 0을 반환해야 한다.(예 : “” => 0, null => 0)
2. 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.(예 : “1”)
3. 숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환한다.(예 : “1,2”)
4. 숫자 두개를 콜론(:) 구분자로 입력할 경우 두 숫자의 합을 반환한다.(예 : “1:2”)
5. 구분자를 컴마(,)와 콜론(:)을 같이 사용할 수 있다. (예 : “1,2:3” => 6)
6. “//”와 “\n” 문자 사이에 커스텀 구분자를 지정할 수 있다. (예 : “//;\n1;2;3” => 6)
7. 커스텀 구분자와 컴마(,), 콜론(:)을 모두 사용할 수 있다. (예 : “//;\n1;2:3,4” => 10)
8. 정수가 아닌 값을 전달할 경우 RuntimeException 예외가 발생해야 한다. (예 : “-1,2,3.0”)
9. 음수를 전달할 경우 RuntimeException 예외가 발생해야 한다. (예 : “-1,2,3”)
10. 예외가 발생한 경우 에러메시지를 출력하고 다시 입력을 받는다.

## 프로그래밍 요구사항
- 규칙 1: 한 메서드에 오직 한 단계의 들여쓰기(indent)만 한다.
  - depth의 경우 if문을 사용하는 경우 1단계의 depth가 증가한다. if문 안에 while문을 사용한다면 depth가 2단계가 된다.
- 규칙 2: else 예약어를 쓰지 않는다.
- 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다. 
  - method가 한 가지 일만 하도록 최대한 작게 만들어라.