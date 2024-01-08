/**
 * Very, very simple calculator
 *
 * @author Nora Hønnåshagen Hansen
 * @date   08-01-2024
 */
package com.booleanuk;

import java.util.Scanner;

import com.booleanuk.Operations;

public class Main {
    /**
     * This is the main function
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        showMenu();
        Operations.addition(sc);
    }

    /**
     * Display the menu options in text
     */
    public static void showMenu() {
        System.out.println("Good evening, welcome to the very cool calculator B)\nNow, what can I do you for?");
        System.out.println("(a)Addition");
        System.out.println("(s)Subtraction");
        System.out.println("(m)Multiplication");
        System.out.println("(d)Division");
        System.out.println("(q)Quit");
    }
}

