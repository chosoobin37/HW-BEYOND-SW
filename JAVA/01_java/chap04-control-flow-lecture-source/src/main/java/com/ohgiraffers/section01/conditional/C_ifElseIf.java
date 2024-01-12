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
    public void testNestedIfElseIfStatement() {

        /* 수업목표. 중첩된 if-else-if문에 대한 흐름 이해 및 적용 */
        /* 필기.
         *  ohgiraffers 대학의 김XX 교수님은 학생들의 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있다.
         *  90점 이상 'A', 80점 이상 'B', 70점 이상 'C', 60점 이상 'D'
         *  60점 미만인 경우 'F' 학점을 주게 된다.
         *  따라서, 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
         *  (추가로, 각 등급의 중간점수(95, 85, 75, ...) 이상인 경우 '+'를 붙여 등급 세분화)
         *  출력 예시: XXX 학생의 점수는 86점이고, 등급인 'B+'입니다.
         *           프로그램을 종료합니다.
        * */

        /* 수업목표. 중첩된 if-else문 단독 사용에 대한 흐름 이해 및 적용 */

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하시오: ");
        String name = sc.nextLine();
        System.out.print("점수를 입력하시오: ");
        int score = sc.nextInt();

        /* 설명. 정수를 하나 입력 받아서 양수와 음수 구분 뒤 양숭리 때만 짝수, 홀수 판별 (각 상태 모두 출력) */
        if (score >= 95) {
            System.out.println(name+" 학생의 점수는 "+score+"점이고, 등급은 A+입니다.");
        } else if (score >= 90) {
            System.out.println(name+" 학생의 점수는 "+score+"점이고, 등급은 A입니다.");
        } else if (score >= 85) {
            System.out.println(name + " 학생의 점수는 " + score + "점이고, 등급은 B+입니다.");
        } else if (score >= 80) {
            System.out.println(name + " 학생의 점수는 " + score + "점이고, 등급은 B입니다.");
        } else if (score >= 75) {
            System.out.println(name + " 학생의 점수는 " + score + "점이고, 등급은 C+입니다.");
        } else if (score >= 70) {
            System.out.println(name + " 학생의 점수는 " + score + "점이고, 등급은 C입니다.");
        } else if (score >= 65) {
            System.out.println(name + " 학생의 점수는 " + score + "점이고, 등급은 D+입니다.");
        } else if (score >= 60) {
            System.out.println(name + " 학생의 점수는 " + score + "점이고, 등급은 D입니다.");
        } else {
            System.out.println(name + " 학생의 점수는 " + score + "점이고, 등급은 F입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}

