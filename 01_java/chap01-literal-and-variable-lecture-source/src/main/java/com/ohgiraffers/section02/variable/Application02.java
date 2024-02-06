package com.ohgiraffers.section02.variable;

public class Application02 {
    public static void main(String[] args) {
        /* 수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다. (자료형 type) */

        /* 필기. 변수를 사용하는 방법
            1. 변수 준비
            2. 변수에 값 대입 (값 대입 및 초기화)
            3. 변수 사용
        */

        /* 목차. 1) 변수 선언 */
        /* 설명. 자료형이란?
          * 다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 compiler와 약속한 키워드
          * 이러한 자료형은 기본자료형(Primitive Type)과 참조자료형(Reference Type)으로 나뉨.
          * 2) 기본자료형 8가지
        * */

        /* 설명. 정수를 취급하는 자료형 */
        byte bnum;          // 1 byte
        short snum;         // 2 byte
        int inum;           // 4 byte
        long lnum;          // 8 byte

        /* 설명. 실수를 취급하는 자료형 */
        float fnum;         // 4 byte
        double dnum;        // 8 byte

        /* 설명. 문자를 취급하는 자료형 */
        char ch;            // 2 byte

        /* 설명. 논리형을 취급하는 자료형 */
        boolean isTrue;     // 1 byte

        /* 설명. 문자열은 참조 자료형 (대문자로 시작) */
        String str;         // 4 byte

        /* 목차. 2) 변수에 값 대입 (초기화) */
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L;

        fnum = 4.0f;
        dnum = 8.0;

        ch = 'a';           // char 자료형은 문자 -> 숫자 취급
        ch = 97;            // ch = 'a'; <-> ch = 97; 동일, char형은 0부터 양수만 취급
        isTrue = true;      // isTrue -> 관례상 변수명 긍정의문문 형태로 생성

        /* 목차. 3) 변수 활용 */

        System.out.println("isTrue = " + isTrue);
        System.out.println("long과 int의 합 = " + (lnum+inum));

        /* 설명. 변수의 선언 및 초기화 -> 한 번에 가능 */
        int kor = 90;
        int math = 80;
        int eng = 75;

        int sum = kor + math + eng;
        double avg = sum/3;         // 소숫점 버림한 상태로 값 출력
        double avg2 = sum/3.0;      // 나눗셈 -> 소수점 고려 주의 (하나라도 float or double type)

        System.out.println("종합: " + sum);
        System.out.println("평균: " + avg);
        System.out.println("평균: " + avg2);




















    }
}
