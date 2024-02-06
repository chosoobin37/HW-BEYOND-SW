package com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {
    
    /* 필기.
     *  메소드를 오버라이딩 하기 위해서는 부모 메소드에서 발생하는 예외와 같거나 하위 타입은 가능
     *  아예 예외가 발생하지 않더라도 오버라이딩은 오류 없이 가능
     *  반면, 부모의 메소드보다 더 상위 타입의 예외를 발생시키는 오버라이딩 메소드는 컴파일 에러 발생
     *  이유 -> 부모의 메소드를 고려하여 예외처리한 구문에 문제가 발생하지 않도록 하기 위한 문법
     * 
    * */

    /* 설명. 부모 메소드와 같은 예외 발생 X -> pass */
//    @Override
//    public void method() throws IOException {
//
    /* 설명. 부모 메소드와 달리 예외 발생 X -> pass */
//    }
//    @Override
//    public void method() {
//    }

    /* 설명. 부모 메소드보다 하위 타입 예외 발생 -> pass */
//    @Override
//    public void method() throws FileNotFoundException {
//
//    }

    /* 설명. 부모 메소드보다 상위 타입의 예외 발생 -> compile error */
//    @Override
//    public void method() throws Exception {
//
//    }
}
