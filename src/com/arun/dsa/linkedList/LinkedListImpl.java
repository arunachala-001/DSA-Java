package com.arun.dsa.linkedList;

public class LinkedListImpl {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtFirstPos(100);
        list.insertAtFirstPos(40);
        list.insertAtFirstPos(120);
        list.insertAtFirstPos(10);
        list.insertAtFirstPos(12);

        list.iterate();

        list.insertAtMidPos(2, 50);
        System.out.println(" ");
        list.iterate();

        list.deleteVal(40);
        System.out.println(" ");
        list.iterate();
        
        list.reverse();
        System.out.println(" ");
        list.iterate();

        System.out.println("----------------------------DOUBLY LINKED LIST----------------------------");
        DoublyLinkedList Dlist = new DoublyLinkedList();

        Dlist.insertAtFirstPos(100);
        Dlist.insertAtFirstPos(40);
        Dlist.insertAtFirstPos(120);
        Dlist.insertAtFirstPos(10);
        Dlist.insertAtFirstPos(12);

        Dlist.iterate();

        Dlist.insertAtMidPos(2, 50);
        System.out.println(" ");
        Dlist.iterate();

        Dlist.deleteVal(40);
        System.out.println(" ");
        Dlist.iterate();

        System.out.println(" ");
        Dlist.reverse();
        System.out.println(" ");

    }
}
