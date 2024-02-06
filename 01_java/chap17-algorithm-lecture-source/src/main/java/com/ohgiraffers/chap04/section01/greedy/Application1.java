package com.ohgiraffers.chap04.section01.greedy;

/* 수업목표. greedy 알고리즘 이해 */
/* 필기.
 *  현재 상태에서 최적의 해답(최대 이익)을 찾기 위해 적용하는 알고리즘
 *  -> 앞의 선택이 이후에 영향을 주지 않을 때 적용 가능
* */

public class Application1 {
    public static int solution(int n) {

        int count = 0;          // 들고 갈 최소 봉지 개수

        while (true) {

            /* 설명. 5kg 봉지로 바로 나눌 수 있는 경우 -> n/5 반환 */
            if (n % 5 == 0) {
                return n / 5 + count;           // (+count) 개념 -> 이전 반복에서 가져간 3kg 봉지의 수
            } else if (n < 0) {
                return -1;
            }

            /* 설명.  3kg 봉지로 한 봉지 들고감 */
            n = n - 3;
            count++;
        }
    }
}
