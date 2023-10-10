package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Case 1 : adding all elements at the end of linked list");
        CustomLinkedList<Integer> integerCustomLinkedList = new CustomLinkedList<>();
        CustomLinkedList<String> stringCustomLinkedList = new CustomLinkedList<>();
        int n = 3;
        System.out.println("Number of integer elements-> " + n);
        System.out.println("Entering elements one by one");
        integerCustomLinkedList.addAtLast(5);
        integerCustomLinkedList.addAtLast(6);
        integerCustomLinkedList.addAtLast(7);

        System.out.println(integerCustomLinkedList);
        System.out.println("The Size of linked list is=" + integerCustomLinkedList.getSize());

        System.out.println("-----------------------------------");
        System.out.println("Case 2 :  Adding the string elements at the start of linkedList");
        System.out.println("Number of string elements-> " + n);
        System.out.println("Entering elements one by one");
        stringCustomLinkedList.addAtFirst("qw");
        stringCustomLinkedList.addAtFirst("as");
        stringCustomLinkedList.addAtFirst("zx");

        System.out.println(stringCustomLinkedList);
        System.out.println("The Size of linked list is=" + stringCustomLinkedList.getSize());
    }
}




