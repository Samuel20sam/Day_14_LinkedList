package com.bridgelabz;

public class SortedLinkedList<T extends Comparable<T>> {
    Node<T> head;
    int size;

    void add (Node<T> newNode){
        insert(newNode);
    }

    void insert(Node<T> info){
        if ((head == null) || (info.compareTo(head) < 0)) {
            info.next = (head);
            head = info;
        } else {
            Node<T> current = head;
            while ((current.next != null) && (info.compareTo(current.next) > 0)) {
                current = current.next;
            }
            if (current.next == null) {
                current.next = info;
            }
            if (info.compareTo(current.next) < 0) {
                info.next = current.next;
                current.next = info;
            }
        }
    }
    public void display() {
        Node<T> temp = head;
        System.out.print("Sorted linked list is\n");
        while (temp != null) {
            System.out.print(temp.value +"->");
            size++;
            temp = temp.next;
        }
        System.out.println("\nSize of sorted linked list is " +size);
        size = 0;
    }
}
