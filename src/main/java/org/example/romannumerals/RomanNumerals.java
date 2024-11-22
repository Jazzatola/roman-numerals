package org.example.romannumerals;

public class RomanNumerals {
    public static String fromDecimal(int decimal) {
        StringBuilder output = new StringBuilder();

        if(decimal >= 5) {
            output.append("V");
            decimal -= 5;
        }

        output.append("I".repeat(decimal));
        return output.toString();
    }
}
