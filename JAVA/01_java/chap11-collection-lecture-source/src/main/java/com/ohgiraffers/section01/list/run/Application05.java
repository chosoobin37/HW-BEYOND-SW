package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application05 {
    public static void main(String[] args) {
        
        /* 수업목표. Queue 이해 및 사용 */ 
        /* 필기. 
         *  Queue ->  선형 메모리 공간에 데이터를 저장하여 순서를 유지하기 위한 선입선출 방식의 자료구조
         *  주로 LinkedList 사용
        * */

//        Queue<String> que=new LinkedList<>();
        PriorityQueue<String> que = new PriorityQueue<>();
        // Que면서 정렬을 위한 최우선 가치에 있는 요소의 순서를 최앞단으로 바꿔주는 기능이 있는 자료구조

        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que: " + que);

        System.out.println("peek(): " + que.peek());
        System.out.println("peek(): " + que.peek());

        System.out.println("poll(): " + que.poll());
        System.out.println("que: " + que);
        System.out.println("poll(): " + que.poll());
        System.out.println("que: " + que);
        System.out.println("poll(): " + que.poll());
        System.out.println("que: " + que);
        System.out.println("poll(): " + que.poll());
        System.out.println("que: " + que);
        System.out.println("poll(): " + que.poll());
        System.out.println("que: " + que);
    }
}
