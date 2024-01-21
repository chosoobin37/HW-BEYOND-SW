package com.ohgiraffers.section03.stringbuilder;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. String과 StringBuilder의 차이 이해 및 사용 */
        /* 필기.
         *  StringBuilder: StringBuffer보다 성능 우수
         *  StringBuffer: thread safe 기능 추가적으로 동작
        * */

        StringBuilder sb = new StringBuilder("java");
//        StringBuilder sb2 ="java";        // Builder -> 리터럴 취급X
        System.out.println(sb);

        /* 설명. String과 StringBuilder로 수정 시 객체 주소값 변화 확인 */
        String testStr = "java";
        StringBuilder testSb = new StringBuilder("Kotlin");

        for (int i = 0; i < 9; i++) {
            testStr += i;
            testSb.append(i);

            /* 필기. 
                 *  String은 hashCode() 메소드가 동등 비교를 위해 오버라이딩이 되어 있어 주소값 확인 어려움
                 *  -> System.identifyHashCode() 메소드를 통해  String.으로 관리되는 문자열과
                 *  StringBuilder로 관리되는 문자열이 각각 변화를 줄 때 새로운 객체를 생성하는지 확인
            * */
            System.out.println("String의 경우: " + System.identityHashCode(testStr));
            System.out.println("StringBuilder의 경우: " + System.identityHashCode(testSb));
        }

        System.out.println("String의 결과: " + testStr);
        System.out.println("StringBuilder의 결과: " + testSb);
    }
}
