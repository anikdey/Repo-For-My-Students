package monirameem.linkedList;

public class SLinkedListTest {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printList();

        list.addAt(3, 9);
        list.addAt(1, 9);
        list.addAt(0, 9);
        list.addAt(7, 9);
        list.printList();

        list.removeFirst();
        list.printList();

        list.remove();
        list.printList();

        list.removeAt(1);
        list.printList();

        list.removeAt(3);
        list.printList();

        list.reverseList();
        list.printList();

        list.addFirst(5);
        list.add(0);
        list.printList();

    }
}
