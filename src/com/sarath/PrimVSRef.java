package com.sarath;

import java.awt.*;

public class PrimVSRef {
    public static void main(String[] args) {
        byte x = 10;
        byte y = x;
        x = 15;
        System.out.println("Value of Y: " + y + "\nValue of X: " + x);

        Point myPoint1 = new Point(1, 5);
        Point myPoint2 = myPoint1;
        myPoint1.x = 5;
        System.out.println("\n2nd Point: " + myPoint2);
        System.out.printf("X-Coordinate: %s, Y-Coordinate: %s", myPoint2.x, myPoint2.y);
    }
}
