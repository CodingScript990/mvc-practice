package org.example.calculator.tobe;

import org.example.calculator.domain.PositiveNumber;

// 나눗셈 연산자 -> NewArithmeticOperator Interface 를 상속 받음!(구현체)
public class DivisionOperator implements ArithmeticOperator {
    // Division Operator 에 해당되면 실행!

    // Override -> boolean supports method(operator 유효성 Test)
    @Override
    public boolean supports(String operator) {
        // "/" 가 operator 값과 비교할때 일치하면 True 값을 반환해줘라!
        return "/".equals(operator);
    }

    // Override -> int supports method(operand1,2 유효성 Test)
//    @Override
//    public int calculate(int operand1, int operand2) {

    // 양수인지 체크하기 위한 과정 -> 구현체 모두에 적용함! [+, -, *, /] 에 적용!
    // Override -> PositiveNumber supports method(operand1,2 유효성 Test -> 양수인지 아닌지)
    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {

        // operand1,2 가 addition operator 가 되도록 설정해주고 값을 반환해줌
        // 피연산자 반환 값 부분에서 에러사항이 있다는 것을 알게되어 수정작업함!
        // 조건문으로 에러사항을 케어해줌!
        // 피연산자2 가 0이면 에러메세지를 남겨주는 작업을 실행하라는 의미임!

        // PositiveNumber 에서 예외일때를 대처해주기 때문에 중복된 사항들은 제거해줌
//        if (operand2.toInt() == 0) {
//            // throw new 생성자를 이용하여 에러 메세지를 남겨줌
//            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
//        }
        return operand1.toInt() / operand2.toInt();
    }
}
