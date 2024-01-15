package com.ohgiraffers.section01.array;

public class Application05 {
    public static void main(String[] args) {
        /* 수업목표. 배열을 사용하는 예시를 통한 카드게임 */

        String[] shape = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        int randomShapeIndex = (int)(Math.random()*3);               // 0~3
        int randomCardNumberIndex=(int)(Math.random()*12);          // 0~12

        System.out.println("당신이 뽑은 카드는 <" +shape[randomShapeIndex]+" "
                +cardNumber[randomCardNumberIndex]+"> 카드입니다.");

    }
}
