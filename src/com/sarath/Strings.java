package com.sarath;

public class Strings {
    public static void main(String[] args) {
        // In java there are two ways two initialize a string
        // Remember: A string is also a reference type in Java the second initialization is just for ease of use.
        String myString = new String("Hello World");
        String myNewString = "Bonjour!";
        System.out.println(myString);
        System.out.println(myNewString);

        System.out.println();

        // Strings can be concatenated with one another
        String myName = "Sarath " + "Chandra ";
        System.out.println(myName);
        String myLastName = "Godithi";
        String concString2 = myName + myLastName ;
        System.out.println(concString2);
    }
}
