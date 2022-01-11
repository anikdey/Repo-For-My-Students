package monirameem.linkedList.implementedMethod;

public class TestSLList {

    public static void main(String[] args) {

        SinglyLList<Integer> list = new SinglyLList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printList();

//        list.disconnectNode(new SinglyLinkedList.Node<>(2));
//        list.printList();

        list.remove();
        list.printList();

        list.add(5);
        list.printList();

        list.addAt(3,4);
        list.printList();


//       System.out.println(list.getFromTail(2));
//       System.out.println(list.getFromTail(5));
//       System.out.println(list.getFromTail(1));
//       System.out.println(list.getFromTail(0));

//        System.out.println(list.getItemAt(2));
//        System.out.println(list.getItemAt(6));

//        list.reverseRecursive(list.head);
//        list.reverseIterative();
//        list.removeAt(2);
        list.printList();
        System.out.println(list.getSizeIterative(list.head));
        System.out.println(list.getSizeRecursive(list.head));
    }
}
