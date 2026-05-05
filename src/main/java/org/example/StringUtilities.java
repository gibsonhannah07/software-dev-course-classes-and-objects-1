package org.example;

public class StringUtilities {
    //returns true if string has less than 5 char
    public static boolean shortString(String s) {
        return s.length() <5;
    }

    //returns first character of the string
    //at index 0
    public static char firstLetter(String s) {
        return s.charAt(0);
    }

    //replaces all instances of asparagus with ****
    public static String censorAsparagus(String s) {
        return s.replace("asparagus", "****");
    }

    //function bigger that takes two strings and returns longer
    //if strings are same, return first
    public static String bigger(String a, String b) {
        if (b.length() > a.length()) {
            return b;
        }
        return a;
    }

}
