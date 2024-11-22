package org.example.romannumerals;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumerals {

    private static final Map<Integer, String> romans = new TreeMap<>(RomanNumerals::reverseOrder);

    private static int reverseOrder(int first, int second) {
        return second - first;
    }

    static {
        romans.put(1, "I");
        romans.put(5, "V");
        romans.put(10, "X");
    }

    public static String fromDecimal(int decimal) {
        StringBuilder output = new StringBuilder();

        for(Integer key: romans.keySet()) {
            while(decimal >= key) {
                output.append(romans.get(key));
                decimal -= key;
            }
        }

        return output.toString();
    }
}
