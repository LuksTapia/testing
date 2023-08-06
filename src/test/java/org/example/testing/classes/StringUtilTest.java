package org.example.testing.classes;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilTest {

    @Before
    public void init() {
        System.out.println("Beginning");
    }

    @After
    public void finish() {
        System.out.println("Ending");
    }


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

    @Test
    public void repeat_string_negative1() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.repeat("titi",-1);
        });
    }

    @Test
    public void repeat_string_negative_times(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.repeat("hola", -1);
        });

        assertEquals("Number must be bigger than zero", exception.getMessage());
    }




}