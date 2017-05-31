package com.gettingstarted;

/**
 * Created by ppolak on 31.05.17.
 */
public class Calculator {
    Discount discount;
    final Integer YEAR_POINT = 5;

    public Calculator(Discount discount) {
        this.discount = discount;
    }

    public double calculate(Double amount, Integer years) {
        Double discount;
        Double rate;

        if (years > YEAR_POINT) {
            discount = (double) YEAR_POINT / 100;
        } else {
            discount = ((double) years / 100);
        }

        switch (this.discount) {
            case PROC0:
                return amount;
            case PROC10:
                rate = 0.9;
                break;
            case PROC30:
                rate = 0.7;
                break;
            case PROC50:
                rate = 0.5;
                break;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
        return calculateDiscount(rate, amount, discount);
    }

    private Double calculateDiscount(Double rate, Double amount, Double discount) {
        return (rate * amount) * (1 - discount);
    }
}
