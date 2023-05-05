package m1.examen_final.tache3;

public class EuropeanNumberPlate extends NumberPlate {
    public EuropeanNumberPlate(String plate) {
        super(plate);
    }

    @Override
    public int getCost(int costPerChar) {

        //espace nclus
        return plate.length() * costPerChar;
    }
}
