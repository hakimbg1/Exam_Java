package m1.examen_final.rendu.tache1;

/**
 *
 * Pas encore fait
 *
 * **/

public abstract class Fruit {
    protected int value;

    public Fruit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public abstract String getOrigin();
}