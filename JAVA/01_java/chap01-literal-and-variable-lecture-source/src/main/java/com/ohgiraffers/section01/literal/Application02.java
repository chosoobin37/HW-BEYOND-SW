package com.ohgiraffers.section01.literal;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 값을 직접 연산하여 출력할 수 있다. */

        /* 목차 1. 숫자와 숫자의 연산 */
        System.out.println("======= 정수와 정수의 연산 =======");
        System.out.println(123+456);
        System.out.println(123-23);
        System.out.println(123*10);
        System.out.println(123/10);
        System.out.println(123%10);

        System.out.println("======= 실수와 실수의 연산 =======");
        System.out.println(1.23+4.56);
        System.out.println(1.23-0.23);
        System.out.println(1.23*10);
        System.out.println(1.23/10);
        System.out.println(1.23%1.0);       // 실수는 용랑 때문에 근사값

        /*필기. 정수와 실수의 연산 결과는 실수가 나온다. (정수를 실수로 바꿔 연산) */
        System.out.println("======= 정수와 실수의 연산 =======");
        System.out.println(123+0.5);        // 123 -> 123.0
        System.out.println(123-0.5);
        System.out.println(123*0.5);
        System.out.println(123/0.5);
        System.out.println(123%0.5);

        /* 목차 2. 문자의 연산 */
        /* 필기. 문자와 정수의 연산은 정수와 정수의 연산과 같다.
            -> 유니코드 기반의 숫자로 변환 */
        System.out.println("======= 문자와 정수의 연산 =======");
        System.out.println('a'+1);      // 98
        System.out.println('a'-1);      // 96
        System.out.println('a'*1);      // 97
        System.out.println('a'/1);      // 97
        System.out.println('a'%1);      // 0

        System.out.println("======= 문자와 실수의 연산 =======");
        /* 필기. 문자와 실수의 연산 = 정수와 실수의 연산 */

        /* 목차 3. 문자열의 연산 */
        /* 필기. 문자열간의 연산은 덧셈만 가능 -> 산술적 연산x 문자열 이어 붙이기o */
        System.out.println("======= 문자열과 문자열의 연산 =======");
        System.out.println("hello"+"world");

        System.out.println("======= 문자열과 다른 형태의 값 연산 =======");
        /* 설명. 문자열과 정수의 연산 */
        System.out.println("hello world"+123);

        /* 설명. 문자열과 실수의 연산 */
        System.out.println("hello world"+123.456);

        /* 설명. 문자열과 문자의 연산 */
        System.out.println("hello world"+'a');

        /* 설명. 문자열과 논리값의 연산 */
        System.out.println("hello world"+true);

        /* 설명. 이항연산자들의 묶음에서 좌측에서붵 이항씩 연산 */
        System.out.println(123+3+"hello world"+123+4);      // "126hello world 1234

        /* 설명. 문자열 뒤에 숫자를 활용한 연산을 쓰게 되면 소괄호를 써서 우선순위 높인 뒤 연산 */
        System.out.println("합계:" + (123+3));

        /* 목차 4. 논리값의 연산 */
        /* 설명. 대부분의 연산 적용x 논리와 문자열의 연산만 가능 */
        System.out.println("======= 논리값과 문자열 형태의 값 연산 =======");
        System.out.println(true+"문자열");






















    }
}
