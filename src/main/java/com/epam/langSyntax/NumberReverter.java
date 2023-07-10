package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        StringBuilder revertedNumber = new StringBuilder();

        while (number != 0) {
            int remainder = number % 10;
            number = number / 10;
            revertedNumber.append(remainder);
        }

        System.out.println(revertedNumber);
    }

}
