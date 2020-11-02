package com.sarath;

public class PrimitiveTypes {

    public static void main(String[] args) {
        // Max allowed number is -128 → 127
        byte myByte = 110;
        // Max allowed number is -32_000 → 32_000
        short myShort = 30_000;
        // Max allowed number is -2_000_000_000 → 2_000_000_000
        int myInt = 1_923_121_212;
        // To use type long the letter 'l' or 'L' has to be added to the end of the number.
        long myLong = 231398172391823L;
        // However long the float maybe only 6 decimal places will be printed.
        float myFloat = 5.78523566646466561F;
        System.out.println(myFloat);
        // However long the double maybe only 16 decimal places will be printed.
        double myDouble = 3.546544646846846846846464F;
        System.out.println(myDouble);
        // Only allows single characters (Use single quotes)
        char myChar = 'A';
        // Has only two states true/false
        boolean myBoolean = true;
    }
}
