package m1.examen_final.tache1;

public class LinkedList {
    private Node first; //can be called head
    private Node last; //can be called tail

    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    public static void printList(LinkedList list) {
        Node current = list.first;

        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }

        System.out.println();
    }

    //addFirst
    public void addFirst(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setNext(first);
            first = newNode;
        }
    }

    //addLast
    public void addLast(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    //deleteFirst
    public void deleteFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot delete from an empty list.");
        }

        if (first == last) {
            first = null;
            last = null;
        } else {
            Node second = first.getNext();
            first.setNext(null);
            first = second;
        }
    }

    //deleteLast
    public void deleteLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot delete from an empty list.");
        }

        if (first == last) {
            first = null;
            last = null;
        } else {
            Node current = first;

            while (current.getNext() != last) {
                current = current.getNext();
            }

            current.setNext(null);
            last = current;
        }
    }

    //contains
    public boolean contains(int value) {
        Node current = first;

        while (current != null) {
            if (current.getValue() == value) {
                return true;
            }

            current = current.getNext();
        }

        return false;
    }

    //indexOf
    public int indexOf(int value) {
        int index = 0;
        Node current = first;

        while (current != null) {
            if (current.getValue() == value) {
                return index;
            }

            current = current.getNext();
            index++;
        }

        return -1;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
