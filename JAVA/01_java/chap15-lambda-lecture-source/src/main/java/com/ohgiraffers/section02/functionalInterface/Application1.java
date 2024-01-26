package com.ohgiraffers.section02.functionalInterface;

import java.time.LocalTime;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class Application1 {
    public static void main(String[] args) {
        
        /* 수업목표. 표준 함수적 인터페이스 중 Consumer 이해 및 사용 */ 
        /* 설명. 반환형 없는 메소드 관련 람다식 */
        Consumer<String> consumer = str -> System.out.println(str + "이(가) 입력됨");
        consumer.accept("Hello?");

        BiConsumer<String, LocalTime> biConsumer =
                (str, time) -> System.out.println(str + "이(가) " + time + "에 입력됨");
        biConsumer.accept("Hello?", LocalTime.now());

        ObjIntConsumer<Random> objIntConsumer =
                (random, bound) -> System.out.println
                        ("0부터 " + bound + " 전까지의 난수 발생: " + random.nextInt(bound));
        objIntConsumer.accept(new Random(), 10);

    }
}
