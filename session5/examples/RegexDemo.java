package com.upgrad.ubank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public boolean validatePassword(String password) {
        String passwordValidator = "^[AEIOUaeiou]\\S{4,12}\\d{3}$";
        return Pattern.matches(passwordValidator, password);
    }

    public boolean[] validatePasswords(String[] passwords) {
        boolean[] result = new boolean[passwords.length];
        String passwordValidator = "^[AEIOUaeiou]\\S{4,12}\\d{3}$";
        Pattern pattern = Pattern.compile(passwordValidator);
        int counter = 0;

        for (String password : passwords) {
            Matcher matcher = pattern.matcher(password);
            result[counter++] = matcher.matches();
        }
        return result;
    }

    public boolean validatePasswordBasicMatchers(String password) {
        String passwordValidator = "ar";
        return Pattern.matches(passwordValidator, password);
    }

    public boolean validatePasswordQuantifier(String password) {
        String passwordValidator = "ab*c+d?e{3,4}";
        return Pattern.matches(passwordValidator, password);
    }

    public boolean validatePasswordCharacterClasses(String password) {
        String passwordValidator = "[^AB]xy[1-9_]";
        return Pattern.matches(passwordValidator, password);
    }

    public boolean validatePasswordPredefinedCharacterClasses(String password) {
        String passwordValidator = "\\d{2}\\s+.\\W";
        return Pattern.matches(passwordValidator, password);
    }

    public boolean validatePasswordOtherMetaCharacters(String password) {
        String passwordValidator = "^x\\[abc\\]y$";
        return Pattern.matches(passwordValidator, password);
    }

    public static void main(String[] args) {
        RegexDemo regexDemo = new RegexDemo();
        String[] passwords = {"xay", "xby", "xcy", "x[abc]y"};

        for (String password : passwords) {
            System.out.println(regexDemo.validatePasswordOtherMetaCharacters(password));
        }

        //Predefined character classes
        /*RegexDemo regexDemo = new RegexDemo();
        String[] passwords = {"12 K#", "90   pQ", "89 r", "87 p*"};

        for (String password : passwords) {
            System.out.println(regexDemo.validatePasswordPredefinedCharacterClasses(password));
        }*/

        //Character classes
        /*RegexDemo regexDemo = new RegexDemo();
        String[] passwords = {"Axy1", "1xy9", "@xy_", "cxy8_"};

        for (String password : passwords) {
            System.out.println(regexDemo.validatePasswordCharacterClasses(password));
        }*/

        //Quantifiers
        /*RegexDemo regexDemo = new RegexDemo();
        String[] passwords = {"aceee", "abcdeeee", "abbee", "abbcccdeeee", "abbcccdeeeee"};

        for (String password : passwords) {
            System.out.println(regexDemo.validatePasswordQuantifier(password));
        }*/

        //Basic Matchers
        /*RegexDemo regexDemo = new RegexDemo();
        String[] passwords = {"ar", "ishwar", "upgrad"};

        for (String password : passwords) {
            System.out.println(regexDemo.validatePasswordBasicMatchers(password));
        }*/
    }
}
