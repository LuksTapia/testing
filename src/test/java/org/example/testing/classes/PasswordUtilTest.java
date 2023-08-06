package org.example.testing.classes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weakPasswordLessThanEightLetters() {

        Assert.assertEquals(SecurityLevel.WEAK, PasswordUtil.assesPassword("123454"));
    }

    @Test
    public void weakPasswordHavingOnlyletters() {
        assertEquals(SecurityLevel.WEAK, PasswordUtil.assesPassword("abcdlergdfggfh"));
    }

    @Test
    public void mediumPasswordHavinglettersAndNumbers() {
        assertEquals(SecurityLevel.MEDIUM, PasswordUtil.assesPassword("Lukas1234"));
    }

    @Test
    public void strongPasswordLettersNumberSymbolUpperLower() {
        assertEquals(SecurityLevel.STRONG, PasswordUtil.assesPassword("LukaS.-12"));
    }
}