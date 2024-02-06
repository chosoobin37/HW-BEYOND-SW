package com.ohgiraffers.section03.branching;

public class B_continue {
    public void testSimpleContinueStatement() {

        /*  수업목표. continue문 사용에 데힌 흐름 이해 및 적용 */
        /*  필기. continue문 또한 반복문 안에서 사용 -> continue 구문 이후 반복할 내용 건너뛰로 다음 스텝으로 이동 */

        /* 설명. 1~100 사이 중에 4의 배수이며 5의 배수인 값 출력 (4와 5의 공배수) */
        for (int i = 0; i <= 100 ; i++) {

            if(!(i%4==0&&i%5==0)) {
                continue;               // 조건문 또는 반복문의 실행 구문이 하나일 때는 중괄호 생략 가능
            }
            System.out.println("i = " + i);
        }
    }
}
