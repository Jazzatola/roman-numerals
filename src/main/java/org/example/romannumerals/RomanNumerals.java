package org.example.romannumerals;

import java.util.Comparator;
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
                output.append(getRomanNumeralFor(key));
                decimal -= key;
            }
        }

        return output.toString();
    }

    private static String getRomanNumeralFor(Integer key) {
        return romanNumerals.get(key);
    }

    private static List<Integer> decimalKeysInReverseOrder() {
        return romanNumerals.keySet().stream().sorted(inReverseOrder()).toList();
    }

    private static Comparator<Integer> inReverseOrder() {
        return (first, second) -> second - first;
    }
}
