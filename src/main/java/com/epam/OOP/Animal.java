package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal (String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        var fur = (hasFur) ? "a" : "no";

        if (numberOfPaws == 1) {
            return "This animal is mostly " + color + ". " +
                    "It has " + numberOfPaws + " paw and " + fur + " fur.";
        } else {
            return "This animal is mostly " + color + ". " +
                    "It has " + numberOfPaws + " paws and " + fur + " fur.";

        }
    }
}
