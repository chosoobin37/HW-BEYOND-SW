package com.ohgiraffers.section02.set.run;

import java.util.Set;
import java.util.TreeSet;

public class Application03 {
    public static void main(String[] args) {

        /* 수업목표. TreeSet 이해 및 활용 */
        Set<String> tSet = new TreeSet<>();

        tSet.add("ramen");
        tSet.add("pork");
        tSet.add("kimchi");
        tSet.add("firedEgg");
        tSet.add("soup");

        System.out.println("tSet = " + tSet);

    }
}
