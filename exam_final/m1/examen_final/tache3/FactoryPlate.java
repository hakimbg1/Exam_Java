package m1.examen_final.tache3;

public class FactoryPlate {
    public static NumberPlate createNumberPlate(boolean isNewType, String plate) {
        if (isNewType) {
            return new EuropeanNumberPlate(plate);
        } else {

            return new OldNumberPlate(plate);
        }
    }
}