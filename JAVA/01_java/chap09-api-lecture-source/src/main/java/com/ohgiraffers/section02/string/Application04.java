package com.ohgiraffers.section02.string;

public class Application04 {
    public static void main(String[] args) {
        
        /* 수업목표. escape 문자 이해 및 적용 */
        /* 필기.
         *  escape 문자 -> 문자열 내에서 사용하는 특수기능 위한 문자
         *  -
         *  \n: 개행
         *  \t: 탭
         *  \': 작은 따옴표
         *  \": 큰 따옴표
         *  \\: 역슬래쉬 표시
        * */

        System.out.println("안녕하세요.\n 저는 홍길동입니다.");
        System.out.println("안녕하세요.\t 저는 홍길동입니다.");

        System.out.println("안녕하세요. 저는 '홍길동'입니다.");
        System.out.println("\'");
        System.out.println("안녕하세요. 저는 \"홍길동\"입니다.");

        System.out.println("역슬래쉬(\\)입니다.");

        /* 설명. escape 문자 이외도 printf 관련 문법 */ 
        System.out.printf("원주율은 %.2f입니다. " +
                "우린 %d로 하죠. ", 3.141592, 3);

    }
}
