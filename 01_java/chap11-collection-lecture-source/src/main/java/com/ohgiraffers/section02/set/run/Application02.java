package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;
import java.util.Set;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. LinkedHashSet 이해 및 활용 */
        /* 필기.
         *  LinkedHashSet -> 저장 당시 순서 유지 특징
        * */

        Set<String> lSet = new LinkedHashSet<>();

        lSet.add("ramen");
        lSet.add("pork");
        lSet.add("kimchi");
        lSet.add("firedEgg");
        lSet.add("soup");
        System.out.println("lSet = " + lSet);

    }
}
