package m1.exercices.collection;

public class Main {
    public static void main(String[] args) {
        MyList postalCodes = new MyArrayList(5);
        postalCodes.insert(92320);
        postalCodes.insert(75012);
        postalCodes.insert(75011);
        postalCodes.insert(75020);
        postalCodes.insert(75017); // 4
        postalCodes.insert(75018);
        postalCodes.insert(75513);

        System.out.println(postalCodes.indexOf(75017));
       // postalCodes.print();
    }
}
