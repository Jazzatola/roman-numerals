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
        assertThat(fromDecimal(5), is("V"));
        assertThat(fromDecimal(6), is("VI"));
        assertThat(fromDecimal(7), is("VII"));
        assertThat(fromDecimal(8), is("VIII"));
        assertThat(fromDecimal(10), is("X"));
        assertThat(fromDecimal(18), is("XVIII"));
        assertThat(fromDecimal(28), is("XXVIII"));
    }
}
