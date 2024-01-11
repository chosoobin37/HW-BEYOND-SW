package com.ohgiraffers.section02.variable;

public class Application03 {
    public static void main(String[] args) {
        /* 수업목표. 변수의 명명 규칙에 대해 이해 */
        /* 필기.
         *  변수의 명명 규칙
         *  변수의 이름 지을 때 규칙 준수 -> 실무적으로 매우 중요
         *  슈칙에 맞게 올바른 변수명을 짓는 것이 좋은 프로그래밍을 위한 첫 단계
         * */

        /* 목차. 1) compile error 발생 규칙 (문법 오류) */

        /* 목차. 1-1) 동일 범위(중괄호) 내에 동일 변수명 X */
        int age = 20;
        // int age 30; -> compile error
        age = 30;       // -> 기존 age 덮어쓸 경우 자료형 제외

        /* 목차. 1-2) 예약어 사용 X */
        // true, for 등 -> 정말 필요한 경우는 대문자 활용
        int True = 1;
        int tRue = 1;

        /* 목차. 1-3) 변수명 대소문자 구분 */
        int aGe = 20;           // -> 선언 가능 (위에 있는 age와 다른 변수)

        /* 목차. 1-4) 변수명 숫자로 시작 X */
        int age1 = 20;

        /* 목차. 1-4) 특수기호로는 '_'와 '$'만 사용가능 */
        int _age = 20;          // 변수명 가장 앞에 _ 가능은 하지만 권장 X
        int $harp = 20;

        /* 목차. 2) compile error는 없지만 관례상 규칙 위반 (암묵적 규칙 위반) */

        /* 목차. 2-1) 변수명 길이제한X -> 적당한 길이 권장 */
        int gdskfkss = 0;

        /* 목차. 2-2) 변수명이 합성어인 경우 -> 첫번째 단어 시작 소문자, 두번째 단어 시작 대문자 */
        int minCount = 5;
        int maxCount = 5;
        // int max_age = 5; -> 권장X

        /* 목차. 2-3) 한글로 변수명 -> 가능은 하지만 권장X */
        int 나이 = 20;

        /* 목차. 2-4) 명확하고 유의미한 변수명 권장 */
        int gift;

        /* 목차. 2-5) 명수형 */
        String gohome;
        String home;

        /* 목차. 2-6) boolean 자료형 -> 긍정의문문 형태 */
        boolean isTrue;

        final int ABC;

    }
}


