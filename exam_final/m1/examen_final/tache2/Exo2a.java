package m1.examen_final.tache2;
import m1.examen_final.rendu.tache1.Basket;
import m1.examen_final.rendu.tache1.Orange;
public class Exo2a {
    public static void main(String[] args) throws Exception {
        Orange a = new Orange("France",80,3);
        Orange b = new Orange("Espagne",90);
        Orange c = new Orange("Espagne",90);
        Orange d = a;

        System.out.println(a.getValue());
        System.out.println(a.toString());

        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(a==d);
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(a.equals(d));
    }
}
