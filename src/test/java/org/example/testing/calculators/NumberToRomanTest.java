package org.example.testing.calculators;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberToRomanTest {

    NumberToRoman number;

    @Before
    public void setUp() {
        number = new NumberToRoman();
    }

    @Test
    public void arabicToRoman_1() {
        assertThat(number.intToRoman(1), CoreMatchers.is("I"));
    }

    @Test
    public void arabicToRoman_2() {
        assertThat(number.intToRoman(2), CoreMatchers.is("II"));
    }

    @Test
    public void arabicToRoman_3() {
        assertThat(number.intToRoman(3), CoreMatchers.is("III"));
    }

    @Test
    public void arabicToRoman_5() {
        assertThat(number.intToRoman(5), CoreMatchers.is("V"));
    }

    @Test
    public void arabicToRoman_6() {
        assertThat(number.intToRoman(6), CoreMatchers.is("VI"));
    }

    @Test
    public void arabicToRoman_7() {
        assertThat(number.intToRoman(7), CoreMatchers.is("VII"));
    }

    @Test
    public void arabicToRoman_10() {
        assertThat(number.intToRoman(10), CoreMatchers.is("X"));
    }

    @Test
    public void arabicToRoman_11() {
        assertThat(number.intToRoman(11), CoreMatchers.is("XI"));
    }

    @Test
    public void arabicToRoman_15() {
        assertThat(number.intToRoman(15), CoreMatchers.is("XV"));
    }

    @Test
    public void arabicToRoman_16() {
        assertThat(number.intToRoman(16), CoreMatchers.is("XVI"));
    }

    @Test
    public void arabicToRoman_50() {
        assertThat(number.intToRoman(50), CoreMatchers.is("L"));
    }

    @Test
    public void arabicToRoman_51() {
        assertThat(number.intToRoman(51), CoreMatchers.is("LI"));
    }

    @Test
    public void arabicToRoman_55() {
        assertThat(number.intToRoman(55), CoreMatchers.is("LV"));
    }

    @Test
    public void arabicToRoman_56() {
        assertThat(number.intToRoman(56), CoreMatchers.is("LVI"));
    }

    @Test
    public void arabicToRoman_60() {
        assertThat(number.intToRoman(60), CoreMatchers.is("LX"));
    }

    @Test
    public void arabicToRoman_70() {
        assertThat(number.intToRoman(70), CoreMatchers.is("LXX"));
    }

    @Test
    public void arabicToRoman_80() {
        assertThat(number.intToRoman(80), CoreMatchers.is("LXXX"));
    }

    @Test
    public void arabicToRoman_81() {
        assertThat(number.intToRoman(81), CoreMatchers.is("LXXXI"));
    }

    @Test
    public void arabicToRoman_85() {
        assertThat(number.intToRoman(85), CoreMatchers.is("LXXXV"));
    }

    @Test
    public void arabicToRoman_86() {
        assertThat(number.intToRoman(86), CoreMatchers.is("LXXXVI"));
    }

    @Test
    public void arabicToRoman_126() {
        assertThat(number.intToRoman(126), CoreMatchers.is("CXXVI"));
    }

    @Test
    public void arabicToRoman_2507() {
        assertThat(number.intToRoman(2507), CoreMatchers.is("MMDVII"));
    }
}