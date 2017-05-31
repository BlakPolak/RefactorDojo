package com.gettingstarted;


public class Main {
    public static void main(String[] args) {
        Discount discount = Discount.PROC10;
        Calculator calculator = new Calculator(discount);
        System.out.println(calculator.calculate(10.0, 5));
    }
}
