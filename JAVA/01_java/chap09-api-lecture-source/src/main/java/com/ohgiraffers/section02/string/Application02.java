package com.ohgiraffers.section02.string;

public class Application02 {
    public static void main(String[] args) {
        
        /* 수업목표. 문자열 객체를 생성하는 다양한 방법 숙지 및 인스턴스 생성 방식 이해 */
        /* 필기.
         *  문자열 객체 생성 방법
         *  "" 리터럴 형태: 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리 (singleton 개념)
         *  new String(""): 매번 새로운 인스턴스 생성 (주소값이 다름)
        * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1==str2: " + (str1 == str2));        // true
        System.out.println("str2==str3: " + (str2 == str3));        // false
        System.out.println("str3==str4: " + (str3 == str4));        // false

        /* 필기.
         *  String 객체 -> 리터럴로 생성될 때는 heap 영역의 상수풀(costant pool)에 생성
         *  상수풀 -> 동등한 String 객체를 하나만 저장하는 공간 (중복 제거),
         *  동일한 String 변수 효율적 사용 가능하도록 제공 (String의 equals()와 hashCode() 통해 적용)
        * */

        /* 설명. 위의 4가지 경우 모두 동등한 String 객체 -> equals는 true, hashCode는 같은 값 나옴 */
        System.out.println("str1.equals(str3): " + str1.equals(str3));   // true
        System.out.println("str1.hashCode() == str3.hashCode():  " + (str1.hashCode() == str3.hashCode()));

        /* 필기.
         *  String -> 불변객체 (immutable class)
        * */

        String str = "apple";
        str += ", banana";
        System.out.println("fruit: " + str);

    }
}