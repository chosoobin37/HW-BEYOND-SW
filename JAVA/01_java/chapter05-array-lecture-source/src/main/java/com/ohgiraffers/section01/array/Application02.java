package com.ohgiraffers.section01.array;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 배열의 사용 방법 익히기 */
        /* 필기.
         *  배열의 사용 방법
         *  1. 선언 2. 할당 3. 인덱스 공간에 값 대입
        * */

        int [] iArr;
//        char cArr[];  -> 권장X

//        iArr = new int[]; -> 배열은 크기 반드시 할당
        iArr = new int[10];

        char[] cArr = new char[5];

        /* 필기. 참조자료형 변수 출력 결과 = 자료형@8진수주소값 */
        System.out.println("iArr = " +iArr);
        System.out.println("cArr = " +cArr);

        /* 필기. hashCode()를 통해 10진수 주소값 확인 가능 */
        System.out.println("iArr = " +iArr.hashCode());
        System.out.println("cArr = " +cArr.hashCode());

        /* 필기. null 값을 지닌 참자 자료형 변수(아무것도 참조하지 않을 때)를 접근할 때 발생하는 에러 */
        cArr = null;
        System.out.println("null을 참조할 시: "+cArr.hashCode());
    }
}
