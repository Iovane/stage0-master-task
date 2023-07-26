package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Print spaces on the left side
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }

            // Print numbers in decreasing order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print numbers in increasing order
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(4);
    }

}
