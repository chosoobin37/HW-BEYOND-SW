package com.ohgiraffers.section01.intro;

public interface OuterCalculator {
    @FunctionalInterface
    public interface Sum {
        int sumTwoNumber(int a, int b);
    }
    @FunctionalInterface
    public interface Minus {
        int sumTwoNumber(int a, int b);
    }
    @FunctionalInterface
    public interface Multiply {
        int sumTwoNumber(int a, int b);
    }
    @FunctionalInterface
    public interface Divide {
        int sumTwoNumber(int a, int b);
    }
}
