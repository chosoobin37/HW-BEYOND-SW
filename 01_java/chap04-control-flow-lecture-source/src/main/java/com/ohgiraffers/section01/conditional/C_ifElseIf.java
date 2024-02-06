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

        if (answer == 1) {
            System.out.println("이런 거짓말쟁이 !! 너에게는 아무런 도끼도 줄 수 없다 !!");
        } else if (answer == 2) {
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

        /* 학생의 이름과 점수 입력 */
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();

        /* 학생의 등급을 저장하기 위한 변수 초기화 */
        String grade = "";

        /* 학점등급을 매기기 위해 점수를 확인 하기 위한 조건문 */
        if (point >= 90) {
            /* 점수가 90점 이상인 경우 */
            grade = "A";
        } else if (point >= 80) {
            /* 점수가 90점 미만, 80점 이상인 경우 */
            grade = "B";
        } else if (point >= 70) {
            /* 점수가 80점 미만, 70점 이상인 경우 */
            grade = "C";
        } else if (point >= 60) {
            /* 점수가 70점 미만, 60점 이상인 경우 */
            grade = "D";
        } else {
            /* 위 조건을 다 만족하지 못하는 점수가 60점 미만인 경우 */
            grade = "F";
        }
        /* 각 등급의 중간 점수 이상이면서 60점 이상인 경우인지 확인(즉, +를 붙이는 조건에 맞는지 확인) */
        if (point % 10 >= 5 && point >= 60 || point == 100) {
            /* 60점 이상이면서 10으로 나눈 나머지가 5보다 큰 경우 */
            grade += "+";
        }
        /* 위에서 결정된 등급을 점수와 함께 출력한다. */
        System.out.println(name + " 학생의 점수는 " + point + "이고, 등급은 " + grade + "입니다.");
        System.out.println("프로그램을 종료합니다.");
    }
}



