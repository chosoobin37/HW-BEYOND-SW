package com.ohgiraffers.section02.string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Application03 {
    public static void main(String[] args) {

        /* 수업목표. 문자열 분리 이해 및 적용 */
        /* 필기.
         *  문자열을 특정 구분자로 하여 분리한 문자열을 반환하는 기능
         *  split(): 정규표현식을 이용해 비정형화된 문자열 분리
         *           String 파싱하여 String[]로 만들어줌
         *  StringTokenizer: 문자열의 모든 문자들을 구분자를 활용하여 문자열 분리
         * */

        String emp1 = "100/홍길동/서울/영업부";
        String emp2 = "200/유관순//총무부";
        String emp3 = "300/이순신/경기도/";

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");

        System.out.println(Arrays.toString(empArr1));
        System.out.println(Arrays.toString(empArr2));
        System.out.println(Arrays.toString(empArr3));
        System.out.println();

        String colors = "red, yellow, green, purple, blue";
        StringTokenizer colorStringTokenizer = new StringTokenizer(colors, ",");
        while(colorStringTokenizer.hasMoreElements()) {
            System.out.println(colorStringTokenizer.nextToken());
        }
    }
}
