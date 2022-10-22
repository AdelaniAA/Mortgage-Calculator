package com.MortgageCalculator;
import java.text.NumberFormat;
//THIS CLASS DEALS WITH PRESENTATIONS
public class MortgageReport {
    private final NumberFormat currencyInstance;
    final private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currencyInstance = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println("----------------");
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance : calculator.getRemainingBalances())
            System.out.println(currencyInstance.format(balance));
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currencyInstance.format(mortgage);
        System.out.println("--------");
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly payments: " + mortgageFormatted);
    }
}
