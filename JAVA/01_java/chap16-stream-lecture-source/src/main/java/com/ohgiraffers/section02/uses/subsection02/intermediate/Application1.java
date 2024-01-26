package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 스트림의 중계연산 중 하나인 filter 이해 및 사용 */
        /* 설명. filter -> 스트림에서 특정 데이터만 걸러내는 메솓 */
        IntStream intStream = IntStream.range(0, 10);
        intStream.filter(i -> (i % 2) == 0)
                .forEach(i -> System.out.print(i + " "));
    }
}
