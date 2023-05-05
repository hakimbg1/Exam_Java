package m1.examen_final.tache3;

public class MainCar {
    public static void main(String[] args) {
        NumberPlate oldPlate = new OldNumberPlate("AB 123 CD");
        NumberPlate newPlate = FactoryPlate.createNumberPlate(true, "AB 123 CD");

        Car car1 = new Car(oldPlate);
        Car car2 = new Car(newPlate);

        System.out.println("Vehicule 1 => Price du nouvelle plate : " + oldPlate.getCost(1));
        System.out.println("vehicule 2 => Price du nouvelle plate : " + newPlate.getCost(1));

        System.out.println("Vehicule 1 : " + car1.getNumberPlate() + ", format Nouveau : " + isEuropeanNumberPlate(car1.getNumberPlate()));
        System.out.println("vehicule 2 : " + car2.getNumberPlate() + ", format Nouveau : " + isEuropeanNumberPlate(car2.getNumberPlate()));

    }
    public static boolean isEuropeanNumberPlate(NumberPlate plate) {
        return plate instanceof EuropeanNumberPlate;
    }
}
