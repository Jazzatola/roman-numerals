package org.example.romannumerals;

public class RomanNumerals {
    public static String fromDecimal(int decimal) {
        return decimal == 5 ? "V" : "I".repeat(decimal);
    }
}
