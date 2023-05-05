package m1.examen_final.rendu.tache1;
import java.util.ArrayList;

public class Basket {
    private static int CountBasket = 0;
    private int id;
    private ArrayList<Orange> oranges;

    public Basket() {
        CountBasket++;
        this.id = CountBasket;
        this.oranges = new ArrayList<>();
    }

    public void addOrange(Orange orange) {
        this.oranges.add(orange);
    }

    public long getValue() {
        long value = 0;
        for (Orange orange : this.oranges) {
            value += orange.getValue();
        }
        return value;
    }

    public void boycottOrigin(String country) {
        ArrayList<Orange> orangesToRemove = new ArrayList<>();
        for (Orange orange : this.oranges) {
            if (orange.getOrigin().equals(country)) {
                orangesToRemove.add(orange);
            }
        }
        this.oranges.removeAll(orangesToRemove);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Basket id - ").append(this.id).append(" - [\n");
        for (Orange orange : this.oranges) {
            sb.append(orange.toString()).append("\n");
        }
        sb.append("]");
        return sb.toString();
    }
}