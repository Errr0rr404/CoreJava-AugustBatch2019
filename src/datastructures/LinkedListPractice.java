package datastructures;

import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Mr X");
        linkedList.add("Mr Z");
        linkedList.add("Mr A");
        linkedList.add("Mr B");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("******AFTER******");
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getFirst());

        System.out.println(linkedList.peek());
        System.out.println(linkedList.element());
        //NoSuchElement Exception Thrown for element()

        System.out.println(linkedList.remove());
        System.out.println("******AFTER 2nd******");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println(linkedList.get(0));

        linkedList.set(0, "Mr Random");
        System.out.println(linkedList.getFirst());
    }
}
