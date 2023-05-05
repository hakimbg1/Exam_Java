package m1.examen_final.tache3;

public abstract class NumberPlate {
    protected String plate;

    public NumberPlate(String plate) {
        this.plate = plate;
    }

    public abstract int getCost(int costPerChar);

    @Override
    public String toString() {
        return plate;
    }
}

