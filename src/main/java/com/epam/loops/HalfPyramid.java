package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {

            // Print spaces
            for (int j = 0; j < cathetusLength - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            // Move to new line
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
