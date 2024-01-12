package com.ohgiraffers.section01.method;

public class Application06 {
    public static void main(String[] args) {
        /* 수업목표. 반환값이 있는 메소드 테스트 */
        System.out.println("main() method run");
        Application06 app6 = new Application06();
        
        String returnText = app6.testMethod();
        System.out.println("returnText = " + returnText);
        /* 설명. 변수에 굳이 담을 필요없이 메소드의 반환값을 한 번만 사용하는 경우 -> 바로 호출해서 반환값 활용 */
        System.out.println("returnText = " +app6.testMethod()); // 표현식 -> 하나의 리터럴로 치환

        System.out.println("main() method out");
    }

    private String testMethod() {

        System.out.println("test() method run");
        return "test";                  // 반환값이 있을 경우 무조건 작성

        // private byte, short, int, long -> return 0;
        // private float -> 0.0f
        // private double -> 0.0
        // private char -> '\u0000'
        // private boolean -> false
        // private String, Date, Calendar -> null
    }
}
