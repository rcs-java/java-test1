package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("please enter your credit card number");
        Scanner input = new Scanner(System.in);
        String card = input.next();
        int chars = card.length();
        int i = 1;
        int t = 2;
        int z = 0;
        while (t < chars) {
            if (card.charAt(i) != card.charAt(t)) {
                               break;}
            else{
                z = z + card.charAt(i);
            }
                i++;
                t++;
            }
            System.out.println( "hash="+ z );
        }
    }
