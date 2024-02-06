package com.ohgiraffers.section03.math;

public class Application01 {
    public static void main(String[] args) {
        /* 수업목표. Math class에서 제공하는 static method 호출 가능 */

        /* 목차. 1) 절대값 출력 */
        System.out.println("-32.1의 절대값: "+Math.abs(-32.1));

        /* 목차. 2) 최대값, 최소값 출력 */
        System.out.println("10과 20 중 더 작은 것은: "+Math.min(10,20));
        System.out.println("10과 20 중 더 큰 것은: "+Math.max(10,20));

        /* 목차. 3) 난수 생성 */
        System.out.println("난수 생성: "+Math.random());
    }
}
