package org.example.calculator.tobe;

import org.example.calculator.domain.PositiveNumber;

// 덧셈 연산자 -> EnumArithmeticOperator Interface 를 상속 받음!(구현체)
public class AdditionOperator implements ArithmeticOperator {
    // Addition Operator 에 해당되면 실행!

    // Override -> boolean supports method(operator 유효성 Test)
    @Override
    public boolean supports(String operator) {
        // "+" 가 operator 값과 비교할때 일치하면 True 값을 반환해줘라!
        return "+".equals(operator);
    }

    // Override -> int supports method(operand1,2 유효성 Test)
//    @Override
//    public int calculate(int operand1, int operand2) {

    // 양수인지 체크하기 위한 과정 -> 구현체 모두에 적용함! [+, -, *, /] 에 적용!
    // Override -> PositiveNumber supports method(operand1,2 유효성 Test -> 양수인지 아닌지)
    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
        // operand1,2 가 addition operator 가 되도록 설정해주고 값을 반환해줌
        // PositiveNumber 에서 int type 으로 value 값이 바뀌도록 작업한 것을 설정해줌!
        // 각 구현체 별로 toInt() 를 활용하여 제대로 반환 값을 받도록 작업 해줌!
        return operand1.toInt() + operand2.toInt();
    }
}
