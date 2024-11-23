package org.example.romannumerals;

import org.junit.jupiter.api.Test;

import static org.example.romannumerals.RomanNumerals.fromDecimal;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RomanNumeralsTest {

    @Test
    public void convertFromDecimalToRomanNumerals() {
        assertThat(fromDecimal(1), is("I"));
        assertThat(fromDecimal(2), is("II"));
        assertThat(fromDecimal(3), is("III"));
        assertThat(fromDecimal(4), is("IV"));
        assertThat(fromDecimal(5), is("V"));
        assertThat(fromDecimal(6), is("VI"));
        assertThat(fromDecimal(7), is("VII"));
        assertThat(fromDecimal(8), is("VIII"));
        assertThat(fromDecimal(9), is("IX"));
        assertThat(fromDecimal(10), is("X"));
        assertThat(fromDecimal(18), is("XVIII"));
        assertThat(fromDecimal(28), is("XXVIII"));
        assertThat(fromDecimal(39), is("XXXIX"));
        assertThat(fromDecimal(1525), is("MDXXV"));
        assertThat(fromDecimal(1984), is("MCMLXXXIV"));
        assertThat(fromDecimal(1990), is("MCMXC"));
        assertThat(fromDecimal(3040), is("MMMXL"));
        assertThat(fromDecimal(3999), is("MMMCMXCIX"));
    }
}
