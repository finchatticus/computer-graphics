package com.company;

/**
 * Created by cooper on 25.09.15.
 */
public class Coord {

    public static int getCoordByPixelX(double x) {
        double i =  20*x+300;
        return (int) i;
    }

    public static int getCoordByPixelY(double y) {
        double i = 300-20*y;
        return (int) i;
    }

}
