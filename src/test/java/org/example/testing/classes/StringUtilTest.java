package org.example.testing.classes;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilTest {

    @Test
    public void repeat_string_zero() {
        assertEquals( "",StringUtil.repeat("titi", 0));
    }

    @Test
    public void repeat_string_once() {
        assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_twice() {
        assertEquals( "titititi",StringUtil.repeat("titi", 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative() {
        assertEquals( "",StringUtil.repeat("titi", -1));
    }

    /*
    @Test
    public void repeat_string_negative1() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.repeat("titi",-1);
        });

        String expected = "IllegalArgumentException";
        assertEquals(expected, exception.getMessage());
    }*/




}