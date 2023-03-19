package org.example.calculator.domain;

// operand1,2 들이 양수인지를 체크하는 작업
// -> 음수 or 0이면 에러메세지 과정을 실행해주고, 양수이면 Object 가 생성되어짐!
public class PositiveNumber {
    // 1. value variable 초기화 작업!
    private final int value;
    
    // 2. PositiveNumber method 는 value 가 validate method 에서 값이 해당되는지 아닌지 체크해주고 해당되면 value 에게 값을 반환해주는 작업을 해줌
    public PositiveNumber(int value) {
        // validate method 를 이용하여 value 값을
        validate(value);
        // int type parameter 의 값을 받아서 value variable 에 값을 적용해줌
        this.value = value;
    }

    // 3. validate method 는 value 값이 0과 같은지, 음수인지 체크 후 해당되면 에러메세지를 남겨주는 작업을 해줌
    // calculateExceptionTest 역할을 이미 해주기 때문에 calculateExceptionTest 는 없어도 됨!
    public void validate(int value) {
        // 조건문을 사용하여, isNegativeNumber method 를 가지고 value 값이 0과 같은지, 음수인지 체크 해주는데?
        if(isNegativeNumber(value)) {
            // 예외 발생시에 에러 메세지를 보여줌
            throw new IllegalArgumentException("0 or 음수를 전달할 수 없습니다.");
        }
    }

    // 4. 0 보다 적거나 0과 같다면 반환해주는 boolean type method 생성
    private boolean isNegativeNumber(int value) {
        // value 값이 0보다 작거나 0과 같다면 값을 반환해줘라!
        return value <= 0;
    }

    // 5. int type 으로 계산이 되야하기에 int type 으로 변환해주는 toInt method 생성 작업을 해줌
    public int toInt() {
        // return 값 -> int type value
        return value;
    }
}
