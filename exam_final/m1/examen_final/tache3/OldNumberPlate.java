package m1.examen_final.tache3;

public class OldNumberPlate extends NumberPlate {
    public OldNumberPlate(String plate) {
        super(plate);
    }

    @Override
    public int getCost(int costPerChar) {
        //espace non inclus
        int numberOfChar = plate.length() - (int) plate.chars().filter(ch -> ch == ' ').count();
        return numberOfChar * costPerChar;
    }
}
