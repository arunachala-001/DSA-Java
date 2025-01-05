package com.arun.dsa.linkedList;

public class CircularLinkedList<T> {

    public static void main(String[] args) {
        CircularLinkedList<String> CList = new CircularLinkedList<String>();

        CList.insertAtBeginning("ZOHO");
        CList.insertAtBeginning("PayPal");
        CList.insertAtBeginning("FIS");
        CList.insertAtBeginning("Comcast");
        CList.insertAtBeginning("Oracle");
        CList.insertAtBeginning("Cognizant");
        CList.traverse();
        System.out.println(" ");

        CList.insertAtLast("Citi");
        CList.traverse();
        System.out.println(" ");

        CList.deleteAtFirstPos();
        CList.deleteAtEndPos();
        CList.traverse();
    }

    Node last;
    class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    public CircularLinkedList() {
        last = null;
    }

    public void insertAtBeginning(T data) {
        Node newNode = new Node(data);
        if(last == null) {
            newNode.next = newNode;
            last = newNode;

        }
        else {
            newNode.next = last.next;
            last.next = newNode;
        }
    }

    public void insertAtLast(T data) {
        Node newNode = new Node(data);
        if(last == null) {
            newNode.next = newNode;
            last = newNode;
        }
        else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public void traverse() {
        if(last == null) {
            return;
        }
        Node temp = last.next;
        do{
            System.out.print(temp.data+ " ");
            temp = temp.next;
        } while(temp != last.next);
    }

    public T deleteAtFirstPos() {
        T temp = last.next.data;

        if(last == null) {
            System.out.println("Empty List");
        }

        if(last.next == last) {
            last = null;
        }
        else {
            last.next = last.next.next;
        }
        return temp;

    }

    public void deleteAtEndPos() {

        if(last == null) {
            System.out.println("Empty List");
        }

        if(last.next == last) {
            last = null;
        }
        else {
            Node temp = last.next;
            while(temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp;
        }


    }
}
