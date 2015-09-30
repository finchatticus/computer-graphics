package com.company.charts;

import com.company.util.Coord;

import javax.swing.*;
import java.awt.*;
import java.util.*;

import static com.company.util.Arrays.listToArr;

/**
 * Created by cooper on 30.09.15.
 */

//chart y = x
public class ChartLine extends JPanel {

    private double x1;
    private double x2;
    private double y;
    private Color color;

    public ChartLine(Graphics g, double x1, double x2, double y) {
        this.x1 = x1;
        this.x2 = x2;
        this.y = y;
        this.color = Color.BLUE;
        paint(g);
    }

    public ChartLine(Graphics g, double x1, double x2, double y, Color color) {
        this.x1 = x1;
        this.x2 = x2;
        this.y = y;
        this.color = color;
        paint(g);
    }

    public void paint(Graphics g) {

        g.setColor(color);

        java.util.List<Integer> xValue = new ArrayList<Integer>();
        java.util.List<Integer> yValue = new ArrayList<Integer>();

        for (double i = x1; i < x2; i+= 0.1) {
            yValue.add(Coord.getCoordByPixelY(y));
            xValue.add(Coord.getCoordByPixelX(i));
        }

        int[] xArr = listToArr(xValue);
        int[] yArr = listToArr(yValue);

        g.drawPolyline(xArr,yArr, xArr.length);
    }
}
