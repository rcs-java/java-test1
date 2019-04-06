package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int capacity = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the amount of people in the room");
        int input1 = sc.nextInt();
        System.out.println("the amount of people still in the queue");
        int input2 = sc.nextInt();
        int now = 100 - input1;


        for (int user = 0; user <input2 ; user++) {
            if (now > 0) {
                System.out.println("fit");
                now--;
            } else {
                System.out.println("can't fit");
                now--;
            }
        }

    }

}