package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Set;

public class Application01 {
    public static void main(String[] args) {
        
        /* 수업목표. Set 자료구조 특성 이해 및 hashSet 이용 */
//        HashSet<String> hset = new HashSet<>();
        Set<String> hset = new HashSet<>();
        hset.add(new String("java"));
        hset.add(new String("mariaDB"));
        hset.add(new String("servlet"));
        hset.add(new String("spring"));
        hset.add(new String("html"));

        System.out.println("hset: " + hset);

        hset.add(new String("mariaDB"));
        System.out.println("hset: " + hset);
    }
}
