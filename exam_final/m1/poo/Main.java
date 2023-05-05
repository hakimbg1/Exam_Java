package m1.poo;

public class Main {
    public static void main(String[] args){
    var calculator = new TaxCalculator2018(100_000);
    var report = new TaxReport(calculator);
    report.show();

    var calculatorNew = new TaxCalculator2023(200_000);
    var reportNew = new TaxReport(calculatorNew);
    reportNew.show();
    }
}