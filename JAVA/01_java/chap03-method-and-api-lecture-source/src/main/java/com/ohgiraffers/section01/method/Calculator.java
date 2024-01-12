package com.ohgiraffers.section01.method;

public class Calculator {

    public int plusTwoNumbers(int first, int second) {
        return first+second;
    }
    public int subTwoNumbers(int first, int second) {
        return first-second;
    }
    public int multiTwoNumbers(int first, int second) {
        return first*second;
    }
    public int divideTwoNumbers(int first, int second) {
        return first/second;
    }
    public int minTwoNumbers(int first, int second) {
        return (first > second) ? second : first;
    }
    public int maxTwoNumbers(int first, int second) {
        return (first < second) ? second : first;
    }

}
