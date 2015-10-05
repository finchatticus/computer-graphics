package com.company.charts;

import com.company.util.Coord;

import java.util.ArrayList;

import static com.company.util.Arrays.listToArr;

/**
 * Created by cooper on 05.10.15.
 */
public class ChartCircle {
    private double x1;
    private double x2;
    private double y;
    private int[] xPoints;
    private int[] yPoints;
    private int nPoints;

    public ChartCircle(double x1, double x2, double y) {
        this.x2 = x2;
        this.x1 = x1;
        this.y = y;
        calcPolygon();
    }

    private void calcPolygon(){
        java.util.List<Integer> xValue = new ArrayList<Integer>();
        java.util.List<Integer> yValue = new ArrayList<Integer>();

        for (double i = x1; i < x2; i+= 0.1) {
            yValue.add(Coord.getCoordByPixelY(y));
            xValue.add(Coord.getCoordByPixelX(i));
        }

        xPoints = listToArr(xValue);
        yPoints = listToArr(yValue);
        nPoints = xPoints.length;
    }

    public int[] getxPoints() {
        return xPoints;
    }

    public int[] getyPoints() {
        return yPoints;
    }

    public int getnPoints() {
        return nPoints;
    }
}
