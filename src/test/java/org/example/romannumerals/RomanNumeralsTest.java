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
    }
}
