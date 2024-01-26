package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 스트림 병렬처리 이해 */
        List<String> stringList =
                new ArrayList<>(Arrays.asList("java", "oracle", "jdbc", "html", "css"));

        /* 설명. main 스레드에서 ㅅ트림을 사용하지 않고 확인*/
        System.out.println(" ===== forEach");
        for (String s : stringList) {
            System.out.println(s + " :  " + Thread.currentThread().getName());
        }
        /* 설명. main 스레드에서 스트림을 사용하고 확인 */
        System.out.println(" ===== normal stream");
        stringList.stream().forEach(Application2::print);

        /* 설명. 병렬 스트림 사용 시 스레드 확인
        *   속도가 상대적으로 빠르고 기본 main 스레드 외에 다른 스레드 활용*/
        System.out.println(" ===== parallel stream");
        stringList.parallelStream().forEach(Application2::print);
    }
    private static void print(String s) {
        System.out.println(s + " : " + Thread.currentThread().getName());
    }
}
