package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {

    public void testSimpleIfElseIfStatement() {
        /* 수업목표. if-else-if문 단독 사용에 대한 흐름 이해 및 적용 */

        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은토끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼에게 셋 중에 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");

        System.out.println("어느 도끼가 너의 도끼이냐? (1. 금도끼 2. 은도끼 3. 쇠도끼)");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if (answer==1) {
            System.out.println("이런 거짓말쟁이 !! 너에게는 아무런 도끼도 줄 수 없다 !!");
        } else if(answer==2) {
            System.out.println("욕심이 과하지는 않지만 그래도 거짓말을 하고 있구나 !!");
        } else {
            System.out.println("아주 정직하구나 여기 있는 모든 도끼들을 다 가져가거라 ~");
        }
        System.out.println("그렇게 산신령은 다시 연못 속으로 홀연히 사라지고 말았다 ,,");
    }
}
