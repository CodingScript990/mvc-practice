package org.example.calculator.tobe;

import org.example.calculator.domain.PositiveNumber;

// 다른 방식의 OOP 해결과정
public interface ArithmeticOperator {

    // boolean Type Variable (operator 유효성 검사)
    boolean supports(String operator);

    // int Type Variable (operand1, operand2 유형성 검사)
//    int calculate(int operand1, int operand2);

    // int Type -> PositiveNumber Type 으로 변경해줌!(양수 체크를 위한 작업)
    int calculate(PositiveNumber operand1, PositiveNumber operand2);
}
