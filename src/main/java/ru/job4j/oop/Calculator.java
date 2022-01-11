package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + multiply(d) + minus(d) + divide(d);
    }

    public static void main(String[] args) {
        int rslSum = Calculator.sum(10);
        System.out.println(rslSum);
        Calculator calculator = new Calculator();
        int rslMult = calculator.multiply(5);
        System.out.println(rslMult);
        int rslMin = Calculator.minus(10);
        System.out.println(rslMin);
        Calculator cal = new Calculator();
        int rslDiv = cal.divide(5);
        System.out.println(rslDiv);
        Calculator calcul = new Calculator();
        int rslsumALL = calcul.sumAllOperation(2);
        System.out.println(rslsumALL);
    }
}
