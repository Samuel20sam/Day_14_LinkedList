package com.bridgelabz;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type three integer");
        int x1 = input.nextInt(), x2 = input.nextInt(), x3 = input.nextInt();
//                x4 = input.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        Node<Integer> fn = new Node<>(x1);
        Node<Integer> sn = new Node<>(x2);
        Node<Integer> tn = new Node<>(x3);
//        Node<Integer> fon = new Node<>(x4);

//        System.out.println("Add method");
//        list.add(fn);
//        list.add(sn);
//        list.add(tn);
//        list.display();

        System.out.println("Push method");
        list.push(fn);
//        list.push(sn);
        list.push(tn);
        list.display();

//        System.out.println("\n\nInsert " + fon + " after " + x2);
//        list.insertAfter(x2, fon);
//        list.display();

        System.out.println("\n\nInserting second element");
        list.insert(sn);
        list.display();

//        System.out.println("\n\nDelete first element (pop)");
//        list.deleteFirst();
//        list.display();
//
//        System.out.println("\n\nDelete last element");
//        list.deleteLast();
//        list.display();

        System.out.println("\n\nSearching the node with value 30");
        Node<Integer> searchNode = list.search(30);
        if (searchNode == null) {
            System.out.println("Data not found");
        } else {
            System.out.println("Data found");
        }
    }
}