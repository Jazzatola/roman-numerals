package org.example.romannumerals;

public class RomanNumerals {

    private enum RomanNumeral {
        X(10),
        IX(9),
        V(5),
        IV(4),
        I(1);

        private final Integer decimal;

        RomanNumeral(Integer decimal) {
            this.decimal = decimal;
        }
    }

    public static String fromDecimal(int decimal) {
        StringBuilder output = new StringBuilder();

        for(RomanNumeral numeral: RomanNumeral.values()) {
            while(decimal >= numeral.decimal) {
                output.append(numeral.name());
                decimal -= numeral.decimal;
            }
        }

        return output.toString();
    }
}
