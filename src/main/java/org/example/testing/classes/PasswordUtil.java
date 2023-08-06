package org.example.testing.classes;

public class PasswordUtil {

    //Method that returns the security level of a password
    public static SecurityLevel assesPassword(String password) {

        SecurityLevel toTest = SecurityLevel.MEDIUM;

        if(comparing(password, 8) || comparingLettersOnly(password)) {
            toTest = SecurityLevel.WEAK;
        }

        if(comparingLetterNumberSymbolUpperLower(password)) {
            toTest = SecurityLevel.STRONG;
        }

        return toTest;
    }

    private static boolean comparing(String password, int lenght) {
        return password.length() < lenght;
    }

    private static boolean comparingLettersOnly(String password) {
        return password.matches("[a-zA-Z]+");
    }

    private static boolean comparingLetterNumberSymbolUpperLower(String password) {
        return password.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
    }

}
