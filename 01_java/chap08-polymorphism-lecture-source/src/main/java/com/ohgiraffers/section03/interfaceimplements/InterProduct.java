package com.ohgiraffers.section03.interfaceimplements;

    /* 설명. 인터페이스 간에는 다중 상속 가능 (implements 대신 extends 사용) */
public interface InterProduct extends ParentInterProduct, AnotherParentInterProduct {

    //    public static final int MAX_NUM = 100;

    /* 설명. 상수 필드만 가질 수 있기 때문에 모든 필드는 묵시적으로 public static final
         ex) 상품 최대 100개만 저장 가능하고 이 값을 활용해 조건식 작성
    *   요구사항 바탕으로 제약 설정 (프로젝트 설정값) */
    int MAX_NUM = 100;

    /* 설명. 인터페이스 -> 생성자 가질 수 X */
//    public InterProduct() {}

    /* 설명. 추상 메소드만 작성 가능 -> 반드시 public abstract만 가능 */
//    public abstract void nonStaticMethod();

    void nonStaticMethod();

    /* 설명. static 메소드는 바디부까지 작성 허용 */
    public static void staticMethod() {
        System.out.println("InterProduct 클래스의 staticMethod 호출 ...");
    }

    /* 설명. default 키워드를 사용하면 non-static 메소드로 작성 가능   */
    public default void defaultMethod() {
        System.out.println("InterProduct 클래스의 defaultMethod 호출 ...");
    }
    
    /* 설명. private도 abstract가 아닌 온전한 메소드로 사용은 가능 (default도 없이) */ 
        private void privateMethod( ) {
            /* 설명. 다른 public default 메소드에서 활용할 수만 있는 메소드 */ 
        }

}
