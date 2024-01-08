package com.booleanuk;

import java.util.Scanner;

public class Operations {
    /**
     * Get two numbers and add them together, displaying the results
     * @see             add(...)
     * @param sc    -   Scanner object for reading input
     */
    public static void addition(Scanner sc)
    {
        System.out.print("Numbers (two of them): ");

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x +" + "+ y +" = "+ add(x,y) + " yippee!");
    }

    /**
     * Get two numbers and subtract the first from the second, displaying the result
     * @see             subtract(...)
     * @param sc    -   Scanner object for reading input
     */
    public static void subtraction(Scanner sc)
    {
        System.out.print("Numbers (two of them): ");

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x +" - "+ y +" = "+ subtract(x,y) +" yippee!");
    }

    /**
     * Get two numbers and multiply them, displaying the result
     * @see             multiply(...)
     * @param sc    -   Scanner object for reading input
     */
    public static void multiplication(Scanner sc)
    {
        System.out.print("Numbers (two of them): ");

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x +" * "+ y +" = "+ multiply(x,y) +" yippee!");
    }

    /**
     * Get two numbers and divide the first with the second, displaying the result
     * If the second number is 0, the operation does not happen
     * @see             divide(...)
     * @param sc    -   Scanner object for reading input
     */
    public static void division(Scanner sc)
    {
        System.out.print("Numbers (two of them): ");

        int x = sc.nextInt();
        int y = sc.nextInt();

        if(y != 0)
        {
            System.out.println(x +" / "+ y +" = "+ divide(x,y) +" yippee!");
        }
        System.out.println("You tryina divide by 0??? >:C You poo");
    }

    /**
     * Adding two numbers and returning the result
     * @param a     -   Integer
     * @param b     -   Integer
     * @return      -   Result (Integer)
     */
    public static int add(int a, int b)      {return a + b;}

    /**
     * Subtracting one number from the other and returning the result
     * @param a     -   Integer
     * @param b     -   Integer
     * @return      -   Result (Integer)
     */
    public static int subtract(int a, int b) {return a - b;}

    /**
     * Multiplying two numbers together
     * @param a     -   Integer
     * @param b     -   Integer
     * @return      -   Result (Integer)
     */
    public static int multiply(int a, int b) {return a * b;}

    /**
     * Dividing one number with the other
     * @param a     -   Integer
     * @param b     -   Integer
     * @return      -   Result (Float)
     */
    public static float divide(int a, int b)
    {
        if(b != 0) return (float) a / b;    // Checks if second number is NOT 0
        else System.out.println("You silly, dividing by 0 is not allowed :)");
        return -1;
    }
}

