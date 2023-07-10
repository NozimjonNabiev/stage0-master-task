package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Print spaces
            for (int j = i; j <= cathetusLength - 1; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            // Print increasing numbers
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            // Move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
