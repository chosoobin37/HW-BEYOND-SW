package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. Map의 자료구제 이해 및 HashMap 이용 */
        Map<Object, Object> hmap = new HashMap<>();
        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        System.out.println("키가 \"one\"인 value 값: " + hmap.get("one"));
        System.out.println("Map의 toSring(): " + hmap);

        /* 설명. 키 값은 중복되면 이후 put 되는 key와 value가 덮어씌워짐 (주의) */
        hmap.put(12, "purple banana");
        System.out.println(hmap.get(12));

        /* 설명. value는 중복이어도 무관 */
        hmap.put(77, "purple banana");
        System.out.println(hmap);

        System.out.println("Map이 지는 entry의 수: " + hmap.size());

        System.out.println("77번 키와 관련된 entry 삭제: " + hmap.remove(77));
        System.out.println("삭제 후 entry 수: " + hmap.size());

        /* 필기. Map을 반복하여 각 entry들(key와 value) 활용 */
        HashMap<String>

        hmap2.put("one", "java 17");
        hmap2.put("two", "mariaDB 10");
        hmap2.put("three", "servlet/jsp");
        hmap2.put("four", "springboot 3.0");
        hmap2.put("five", "vue.js");

        /* 목차. 1) keySet() 활용한 iterator 활용*/
        Set<String> keys = hmap.keySet();
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        /* 목차. 1) entrySet() 활용한 iterator 활용*/
    }
}
