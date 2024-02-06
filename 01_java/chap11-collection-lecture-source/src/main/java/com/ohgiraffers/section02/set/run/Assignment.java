package com.ohgiraffers.section02.set.run;

import java.util.Arrays;

public class Assignment {
    public static void main(String[] args) {

        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45 + 1);
            for (int j = 0; j < i; j++) {
                if (lotto[j] == lotto[i]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < lotto.length - 1; j++) {
                if (lotto[j] > lotto[j+1]) {
                    int temp = lotto[j];
                    lotto[j] = lotto[j + 1];
                    lotto[j + 1] = temp;
                }
            }
        }
        System.out.println("Lotto 번호는 " + Arrays.toString(lotto));
    }
}



