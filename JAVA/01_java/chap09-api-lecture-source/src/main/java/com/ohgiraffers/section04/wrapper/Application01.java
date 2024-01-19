package com.ohgiraffers.section04.wrapper;

public class Application01 {
    public static void main(String[] args) {
        
        /* 수업목표. wrapper 클래서 이해 */
        int intValue = 20;

        /* 설명. 기본 자료형을 Wrapper 클래스 자료형으로 변환 가능 (박싱, boxing) */
        Integer boxingInt = (Integer) 20;
        Integer boxingInt2 = Integer.valueOf(intValue);

        /* 설명. Wrapper클래스 자료형을 기본자료형으로 변환 가능 (언박싱, unboxing) */
        int unboxingValue = boxingInt.intValue();

        /* 설명. 기본자료형과 Wrapper 클래스 -> 자동으로 박싱 및 언박싱 발생 (auto-boxing, auto-unboxing) */
        Integer autoBoxingInt = intValue;
        int autoboxingValue = autoBoxingInt;

        anythingMethod(10);
        
        /* 설명. Wrapper 클래스 값 비교 */
        /* 설명. Wrapper 클래스들도 literal 값으로 오토박싱 할 경우 -> 동일한 객체 하나만 관리 */ 
        Integer integerTest = (Integer) 30;
        Integer integerTest2 = (Integer) 30;
        System.out.println("== 비교: " + (integerTest == integerTest2));
        System.out.println("equals() 비교: " + (integerTest.equals(integerTest2)));
        System.out.println("integerTest 주소: "+System.identityHashCode(integerTest));
        System.out.println("integerTest2 주소: "+System.identityHashCode(integerTest2));

    }

    /* 설명. 매개변수가 Object인 메소드 (어떤 자료형의 전달인자이든 받아낼 수 있는 메소드) */
    public static void anythingMethod(Object obj) { // 10 -> Integer (auto-boxing) -> Object (다형성)
        System.out.println("obj: "+obj);
        // Object의 toString()이 아닌 Integer의 toString()이 실행됨 (동적 바인딩)
    }
}
