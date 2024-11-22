package org.example.romannumerals;

import java.util.List;
import java.util.Map;

public class RomanNumerals {

    private static final Map<Integer, String> romanNumerals = Map.of(
        1, "I",
        4, "IV",
        5, "V",
        9, "IX",
        10, "X"
    );

    public static String fromDecimal(int decimal) {
        StringBuilder output = new StringBuilder();

        for(Integer key: decimalKeysInReverseOrder()) {
            while(decimal >= key) {
                output.append(romanNumerals.get(key));
                decimal -= key;
            }
        }

        return output.toString();
    }

    private static List<Integer> decimalKeysInReverseOrder() {
        return romanNumerals.keySet().stream().sorted((first, second) -> second - first).toList();
    }
}
