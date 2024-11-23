package org.example.romannumerals;

public class RomanNumerals {

    private enum RomanNumeral {
        M(1000), CM(900), D(500),
        C(100), XC(90), L(50),
        XL(40), X(10), IX(9),
        V(5), IV(4), I(1);

        private final int decimal;

        RomanNumeral(int decimal) {
            this.decimal = decimal;
        }

        public int decimal() {
            return decimal;
        }
    }

    public static String fromDecimal(int decimal) {
        StringBuilder output = new StringBuilder();

        for(RomanNumeral numeral: RomanNumeral.values()) {
            while(decimal >= numeral.decimal()) {
                output.append(numeral.name());
                decimal -= numeral.decimal();
            }
        }

        return output.toString();
    }
}
