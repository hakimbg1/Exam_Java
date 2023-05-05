package m1.poo;

public class Employee {
    private int baseSalary;
    private int extraHours;
    private int hourlyRate;
    final static int MONTHS_IN_YEAR = 12;

    public Employee(int baseSalary, int extraHours, int hourlyRate) {
        if(baseSalary < 0)
            throw new IllegalArgumentException("Valeurs negatives non supportées");
        this.baseSalary = baseSalary;
        this.extraHours = extraHours;
        this.hourlyRate = hourlyRate;
    }

    public int calculateWage(){
        return baseSalary + (extraHours * hourlyRate);
    }

    public void setBaseSalary(int baseSalary) {
        if(baseSalary <0)
            throw new IllegalArgumentException("Valeurs negatives non supportées");
        this.baseSalary = baseSalary;
    }

    //    public void setExtraHours(int extraHours) {
//        this.extraHours = extraHours;
//    }
}
