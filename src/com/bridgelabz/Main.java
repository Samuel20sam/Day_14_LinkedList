package com.bridgelabz;

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Type three integer");
        int x1 = input.nextInt(), x2=input.nextInt(), x3=input.nextInt();
        LinkedList list = new LinkedList();
        list.add(x1);
        list.add(x2);
        list.insertAfter(x1,x3);
//        list.add(x3);
        list.display();
//        list.push(x1);
//        list.push(x2);
//        list.push(x3);
//        list.display();
    }
}