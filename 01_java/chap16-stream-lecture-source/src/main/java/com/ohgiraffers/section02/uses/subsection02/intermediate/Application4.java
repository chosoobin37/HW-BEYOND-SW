package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application4 {
    public static void main(String[] args) {
        
        /* 수업목표. 스트림의 중계연산 중 하나인 sorted 이해 및 사용 */
        List<Integer> integerList = IntStream.of(5, 10, 99, 2, 1, 35)
                                            .boxed()
                                            .sorted()
                                            .collect(Collectors.toList());

        System.out.println("정렬된 Integer List: " + integerList);

    }
}
