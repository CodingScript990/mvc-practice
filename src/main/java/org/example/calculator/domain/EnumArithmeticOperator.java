package org.example.calculator.domain;

import java.util.Arrays;

/**
 * enum
 * 1. 상수들의 집합임
 * 2. final 로 String 과 같은 문자열이나 숫자들을 나타내는 기본 자료형의 값을 고정 할 수 있음
 * 3. 상수만으로 작성되어 있으면 Class 로 선언할 필요 없음
 * 4. Class 로 선언된 부분에 enum 이라고 선언하면 Object 는 상수의 집합을 뜻함 -> 명시적 역할
 * 5. enumeration 이라는 셈, 계산, 열거, 목록 이라는 영어단어의 앞 부분만 따서 만든 예약어임

 * 예약어
 *  - 미리 정해둔 명령어를 말함
 *  - 등록되어 있어 의미가 약속되어 있는 명령어라는 뜻임
 *  - 불필요한 시행착오를 줄이기 위해 사용됨
 *  - 속성의 변수명, 메소드명으로 사용할 수 없으며, 프로그래밍 과정에서 특정 의미가 있는 단어를 프로그래머가 식별자로 사용하     게 되면 에러나 버그가 발생 할 수 있음

 * 예약어 종류
 *  - 기본 데이터 타입 : boolean, byte, char, short, int, logn, float, double
 *  - 접근 지정자 : private, protected, public
 *  - 클래스 관련 : class, abstract, interface, extends, implements, enum
 *  - 메서드 관련 : void, return
 *  - 제어문 관련 : if, else, switch, case, default, for, do, while, break, continue
 *  - 논리 리터럴 : true, false
 *  - 예외처리 관련 : try, catch, finally, throw, throws
 *  - 기타 : transient, volatile, package, import, synchronized, native, final, static, strictfp, assert

 * 예약어 특징
 *  - abstract : 추상클래스 or 추상메소드에 사용됨
 *  - boolean : 논리형 참(true)와 거짓(false) 디폴트값은 false
 *  - break : 반복문 or Switch 문을 벗어나거나 멈출 때 사용함
 *  - byte : 데이터 정수형 타입 1 byte = 8 bit 정수형 : byte < short < int < long
 *  - case : switch 조건문에서 사용함. case 문에서는 리터럴과 상수만 허용함
 *  - catch : try~catch~finally 문에서 사용, 예외처리 할 때 사용함
 *  - char : 데이터 문자형 타입 2byte
 *  - continue : 반복문, 루프를 돌 때 현재 루프를 끝낸 뒤에 내용을 무시하고 다시 앞으로 돌아감
 *  - default : 접근제어자 및 switch 문에서 쓰임. 접근제어자는 클래스, 메소드, 멤버변수 앞에 아무것도 선언을 안하면                   default. switch 문에서 default 는 case 문을 돌다가 해당하는 case 가 없으면 default 로 실행 됨
 *  - do : do~while 문에서 쓰임
 *  - double : 데이터 실수형(변수) 타입 8byte
 *  - else : if~else 문에서 쓰임
 *  - extends : 클래스 상속에 쓰임
 *  - false : 거짓이라는 뜻으로 쓰이며 0과 같음
 *  - finally : try~catch~finally 예외처리에 쓰임
 *  - float : 데이터 실수형 타입 4byte
 *  - for : 반복문 중 하나로 초기값과 조건식 증가값이 들어감
 *  - if : 일반적으로 사용되는 조건문
 *  - implements : 인터페이스를 구현 할 때 사용
 *  - import : 패키지 내의 클래스를 불러올 때 사용
 *  - instanceof : 객체타입 검사시 사용됨
 *  - int : 데이터 정수형 4byte
 *  - interface : 일종의 추상클래스로 상속을 목적으로 만들어짐
 *  - long : 데이터 정수형 8byte
 *  - native : 자바 외 다른 프로그래밍 언어로 구현되었음을 알려주는 예약어
 *  - new : 인스턴스, 객체를 만들 때 사용
 *  - null : 메모리에 할당 되지 않은 상태
 *  - package : 클래스를 모아둔 단위
 *  - private : 접근제어자로 같은 클래스 내에서만 접근 가능
 *  - protected : 접근제어자로 같은 패키지와 상속받은 클래스에서 접근 가능
 *  - public : 접근제어자 중 가장 제한이 없는 것
 *  - return : 메소드를 종료하거나 값을 반환
 *  - short : 데이터 정수형 타입 2byte
 *  - static : 정적변수 혹은 클래스 변수
 *  - super : 상위 클래스의 생성자를 호출
 *  - switch : 조건문 중 하나
 *  - synchronized : 쓰레드 동기화를 위해 사용
 *  - this : 인스턴스가 본인을 가리킬 때 사용함
 *  - throw/throws : 예외처리에 사용
 *  - true : 참이라는 뜻으로 1과 같음
 *  - try : try~catch~finally 문에서 사용
 *  - void : 리턴값이 없음
 *  - while : 반복문 중 하나임

 * 상수(constant)
 *  - 고정된 값을 상수라고 말함
 */
public enum EnumArithmeticOperator {
    // 열거형 상수's -> 사칙연산자들(+, -, *, /)
    // 1 > 2 > 3 > 4 순서대로 상수들을 실행함
    // 추상 메소드를 사용하기 위해서 구현체를 형성해줘야 함! 즉, 추상메소드를 사용하기 위해서 환경을 맞춰준다고 생각하면 됨
    ADDITION("+") {
        /**
         * Override
            - 기존의 것을 무시하고 덮어쓰인다는 의미임
            - 상속의 관계에 있는 Class 간에 하위 Class 가 상위 Class 와 완전 동일한 Method 를 덮어쓴다는 의미임
            - 완전동일한 Method 의 의미는 반환형이 같으면서 매개변수의 개수와 타입까지 모두 같은 메소드라는 의미임
            - Overload 되지 않는 메소드라는 의미임

         * Overload
            - 상위 Class 에 정의된 메소드의 이름, 반환형, 매개변수 선언까지 완전 동일한 메소드를 하위 Class 에서 다시 정의하면, 하위 Class 의 해당 메소드가 상위 Class 의 메소드를 덮어버리는(가려벼리는, 지워지는) 것을 말함
         */
        @Override
        // public 러턴자료형 메소드명(입력 자료형1, 입력변수1, 입력 자료형2, 입력 변수2)
        // 메소드 사용법 -> 리턴값을 받을 변수 = 객체.메소드명(입력인수1, 입력인수2, ...);
        public int arithmeticCalculate(int operand1, int operand2) {
            // 값을 반환해준다! operand1 + operand2 으로!
            return operand1 + operand2; // 리턴값; or 리턴자료형이 void 인 경우는 return 문 필요 없음!
        }
    }, // 추상 메소드를 사용하기 위해서 구현체를 형성해줘야 함! 즉, 추상메소드를 사용하기 위해서 환경을 맞춰준다고 생각하면 됨
    SUBTRACTION("-") {
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 - operand2;
        }
    }, // 추상 메소드를 사용하기 위해서 구현체를 형성해줘야 함! 즉, 추상메소드를 사용하기 위해서 환경을 맞춰준다고 생각하면 됨
    MULTIPLICATION("*") {
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 * operand2;
        }
    }, // 추상 메소드를 사용하기 위해서 구현체를 형성해줘야 함! 즉, 추상메소드를 사용하기 위해서 환경을 맞춰준다고 생각하면 됨
    DIVISION("/") {
        // 1-2. EnumArithmeticOperator enum 에서 작업함
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 / operand2;
        }
    };
    // operator 를 선언하는 동시에 초기화 작업을 해줌
    private final String operator;

    /** 
     * EnumArithmeticOperator(산술연산자)
        - 사칙연산을 다루는 연산자로, 기본적이며 가장 많이 사용되는 연산자임
        - 모두 두개의 피연산자를 가지는 이항 연산자이며, 피연산자들의 결합 방향은 왼쪽에서 오른쪽임
     
     * 항
        - 해당 연산의 실행이 가능하기 위해 필요한 값이나 Variable 을 의미함
        - 해당 연산의 실행을 위해 두 개의 값이나 Variable 가 필요한 연산자라고 생각하면 됨
     */
    EnumArithmeticOperator(String operator) {
        /**
         * this
            - Instance 자기 자신을 가리키는 키워드라 생각하면됨
            - Class Method 및 생성자에서 자기 자신의 Data 를 Update 하거나 조작할 수 있음
            - Class 를 기반으로 생성된 Instance 를 가리키는 참조라는 것임
            - Instance 를 가리키는 참조와 Instance 자체는 다르다는 점 유의!

         * Instance
            - Class 가 메모리 공간에 생성된 상태를 말함
            - Class 의 생성자 호출 => Instance 가 생성됨
            - Class 는 하나지만, 여러 개의 각각 다른 Instance 를 생성 할 수 있음

         * 참조변수
            - 참조변수를 사용하여 Instance 의 멤버 변수와 메서드 참조하여 사용이 가능함
            - 참조변수에는 Instance 의 메모리 주소가 저장되어 있고, 참조변수를 통해 Instance 의 속성, 기능을 수정, 실행할 수 있음
            - 드트(.) 연산자를 사용함
            - ex) 참조변수.멤버변수 or 참조변수.메서드 
         */
        this.operator = operator;
    }

    /**
     * 용어정리

     * Class(클래스) : 설계도, 코드로 만든 상태를 말함
     * Instance(인스턴스) : Class 가 메모리에 생성됨을 말함
     * Object(객체) : Object, 생성된 Instance 를 말함
     * Member Variable(멤버변수) : Class 의 속성(Variable)을 말함
     * Method(메소드) : Class 의 기능을 구현함을 말함
     * Reference Variable(참조변수) : 메모리의 instance 주소를 말함
     */

    // Abstract Method 를 활용하여 사칙연산을 사용하기 위한 작업
    public abstract int arithmeticCalculate(final int operand1, final int operand2);

    // 외부에도 Interface 가 활용될 수 있게 작업!
    public static int calculate(int operand1, String operator, int operand2) {
        // 지역변수를 사용하여 Arrays.stream method 를 이용하여 values Data 를 변환 해주는데
        // filter 작업을 통해서 variable 값이 설정한 operator 와 Reference Variable 이 True 인지 아닌지 판단 및 걸러줌
        // findFirst 는 조건에 일치하는 요소들 중에 Stream 에서 순서가 가장 앞에 있는 요소를 먼저 return 해 줌
        // orElseThrow 는 optional 의 인자가 null 일 경우 예외처리를 시킨다는 소리인데, 즉 operator 값이 null 일 경우 IllegalArgumentException("message") 으로 output 해줘라! null 값이 아니라면? optional 의 인자 값을 출력하라!
         EnumArithmeticOperator enumArithmeticOperator = Arrays.stream(values())
                .filter(v -> v.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));

         // 선택 받은 지역변수를 이용하는데, arithmeticCalculate 를 이용하여 피연산자 1,2 값을 전달해주는 작업!
        return enumArithmeticOperator.arithmeticCalculate(operand1, operand2);
    }
}
