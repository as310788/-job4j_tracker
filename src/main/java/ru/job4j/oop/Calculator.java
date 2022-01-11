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
        return x - b;
    }

    public int divide(int c) {
        return x / c;
    }

    public int sumAllOperation(int d) {
        return sum(d) + multiply(d) + minus(d) + divide(d);
    }

    public static void main(String[] args) {
        int resSum = Calculator.sum(10);
        System.out.println(resSum);
        Calculator calculator = new Calculator();
        int rslMult = calculator.multiply(5);
        System.out.println(rslMult);
        int resMin = Calculator.minus(10);
        System.out.println(resMin);
        Calculator cal = new Calculator();
        int resDiv = cal.divide(5);
        System.out.println(resDiv);
        Calculator calcul = new Calculator();
        int ressumALL = calcul.sumAllOperation(2);
        System.out.println(ressumALL);
    }
}
