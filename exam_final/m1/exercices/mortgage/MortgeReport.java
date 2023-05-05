package m1.exercices.mortgage;

import java.text.NumberFormat;

public class MortgeReport {
    private MortgageCalculator calculator;

    public MortgeReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
       for (double balance: calculator.getRemainingBalances()){
           System.out.println(NumberFormat.getCurrencyInstance().format(balance));
       }
    }
}
