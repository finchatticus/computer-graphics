package com.company.charts;

import com.company.util.Coord;

import javax.swing.*;
import java.awt.*;
import java.util.*;

import static com.company.util.Arrays.listToArr;

/**
 * Created by cooper on 30.09.15.
 */
//chart |y| = b + (r^2-(x-a)^2)^(1/2)
public class ChartCircle extends JPanel {

    private double r;
    private double a;
    private double b;
    private double x1;
    private double x2;
    private double l; // (l)*(r^2 - (x-a)^2)^(1/2)
    private Color color;
    private Polygon polygon;

    public ChartCircle(Graphics g,double x1,double x2,double a,double b,double r,double l) {
        this.x1 = x1;
        this.x2 = x2;
        this.a = a;
        this.b = b;
        this.r = r;
        this.l = l;
        this.color = Color.BLUE;
        paint(g);
    }

    public ChartCircle(Graphics g,double x1,double x2,double a,double b,double r,double l,Color color) {
        this.x1 = x1;
        this.x2 = x2;
        this.a = a;
        this.b = b;
        this.r = r;
        this.l = l;
        this.color = color;
        paint(g);
    }

    public void paint(Graphics g) {

        g.setColor(color);

        java.util.List<Integer> x = new ArrayList<Integer>();
        java.util.List<Integer> y = new ArrayList<Integer>();

        //up graph
        for (double i = x1; i < x2; i+= 0.1) {
            y.add(Coord.getCoordByPixelY(b + l * Math.sqrt( Math.pow(r,2) - Math.pow(i - a, 2))));
            x.add(Coord.getCoordByPixelX(i));
        }

        int[] xArr = listToArr(x);
        int[] yArr = listToArr(y);
        polygon = new Polygon(xArr,yArr,xArr.length);
        //g.drawPolyline(polygon.xpoints,polygon.ypoints,polygon.npoints);
        //g.drawPolyline(xArr,yArr, xArr.length);
    }

    public Polygon getPolygon() {
        return polygon;
    }
}
