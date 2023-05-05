package m1.poo;

public class TaxCalculator2023 implements TaxCalculator{
    private double taxableIncome;

    public TaxCalculator2023(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTax(){
        return taxableIncome * 0.1;
    }
}
