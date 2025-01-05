package com.arun.dsa.linkedList;

public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public LinkedList() {
        head = null;
    }

    public void insertAtFirstPos(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        else
            newNode.next = head;
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
        newNode.next = temp.next;
        temp.next = newNode;
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
                return;
            }
        }
    }

    //Rverse Linked List
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }
}
