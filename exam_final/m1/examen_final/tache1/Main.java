package m1.examen_final.tache1;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println("list actuelle :");
        LinkedList.printList(list);

        // ajout Last
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        System.out.println("ajout First :");
        LinkedList.printList(list);

        // ajout First
        list.addFirst(20);


        System.out.println("list actuelle :");
        LinkedList.printList(list);

        // Supprimer First
        list.deleteFirst();

        System.out.println("apres supprimer First :");
        LinkedList.printList(list);

        // Supprimer Last
        list.deleteLast();

        System.out.println("apres supprimer Last :");
        LinkedList.printList(list);

        // Trouver si les valeurs existe
        System.out.println("liste contient 20 : " + list.contains(20));
        System.out.println("liste contient 200 : " + list.contains(200));

        // Affichage de l'indice de la première occurrence d'une valeur
        System.out.println("Index du valeur 20 : " + list.indexOf(20));
        System.out.println("Index du valeur 200 : " + list.indexOf(200));


    }

}