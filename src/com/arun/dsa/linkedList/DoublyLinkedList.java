package com.arun.dsa.linkedList;

public class DoublyLinkedList {

    Node head;
    Node tail;

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtFirstPos(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if(head == null) {
            tail = newNode;
        }
        else {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void iterate() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public void insertAtMidPos(int pos, int data) {
        if(pos == 0) {
            insertAtFirstPos(data);
            return;
        }

        Node temp = head;
        Node newNode = new Node(data);

        for(int i=0; i<pos-1; i++) {
            if(temp == null) {
                throw new IllegalArgumentException("Invalid Arg");
            }
            temp = temp.next;
        }
        if(temp.next == null) {
            temp.next = newNode;
            newNode.prev = temp;
            tail = newNode;

        } else {
            newNode.next = temp.next;
            temp.next.prev = newNode;
            newNode.prev = temp;
            temp.next = newNode;
        }

    }

    public void deleteVal(int data) {
       Node temp = head;
       Node prev;

        if(head == null) {
            throw new IndexOutOfBoundsException("Empty List");
        }
        while(temp != null) {
            prev = temp;
            temp = temp.next;
            if(temp.data == data) {
                prev.next = temp.next;
                temp.next.prev = prev;
                return;
            }
        }
    }

    //Reverse Doubly Linked List
    public void reverse() {
//        Node prev = null;
//        Node current = head;
        Node temp =  tail;

        while(temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.prev;
        }


    }
}
