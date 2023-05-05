package m1.examen_final.rendu.tache1;

public class Orange {
    private long value;
    private String origin;
    private int seedsLevel;

    public Orange(String origin, long value) throws Exception {
        if (value < 0) {
            throw new Exception("veillez rentrer une valeur positif !!");
        }
        this.origin = origin;
        this.value = value;
        this.seedsLevel = 0;
    }

    public Orange(String origin, long value, int seedsLevel) throws Exception {
        if (value < 0) {
            throw new Exception("veillez rentrer une valeur positif !!");
        }
        if (seedsLevel < 0 || seedsLevel > 10 || (seedsLevel < 0 && value / seedsLevel < 2 * 0.05)) {
            throw new Exception("niveau de pépins incorrect !!");
        }
        this.origin = origin;
        this.value = value - (seedsLevel * 5);
        this.seedsLevel = seedsLevel;
    }

    public long getValue() {
        return this.value;
    }

    public String getOrigin() {
        return this.origin;
    }

    /*Cette annotation est un marqueur utilisé par le compilateur pour vérifier la réécriture de méthodes héritées.
    * Dans notre cas, c'est pour override la fonction toString qui existe deja dans supertype. pour qu'il nous fait un affichage
    * personalise au lieu d'un affichage typique.
    * */
    @Override
    public String toString() {
        return "Orange " + this.origin + " " + (this.value + (this.seedsLevel * 5)) / 100.0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Orange)) {
            return false;
        }
        Orange orange = (Orange) o;
        return this.value == orange.value && this.origin.equals(orange.origin) && this.seedsLevel == orange.seedsLevel;
    }
}