package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        
        /* 수업목표.  스트림의 중계연산 중 하나인 flatMap 이해 및 사용 */
        /* 필기.
         *  Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R?>> mapper);
         *  flatMap() -> 중첩 구조 한 단계 제거 후 단일 컬렉션 반환
         *  flattening(플래트닝)
        * */
        List<List<String>> list = Arrays.asList(
                                Arrays.asList("JAVA", "SPRING", "SPRINGBOOT"),
                                Arrays.asList("java", "spring", "springboot")
                                );
        System.out.println("list: " + list);

        List<String> flatList=list.stream().flatMap(Collection::stream)
                                            .collect(Collectors.toList());

        System.out.println("flatlist: " + flatList);
    }
}
