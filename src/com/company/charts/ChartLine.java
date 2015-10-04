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
public class ChartLine extends JComponent {

    private static class Polygon{
        final int[] xPoints;
        final int[] yPoints;
        final int nPoints;
        final Color color;

        public Polygon(int[] xPoints,int[] yPoints,int nPoints,Color color) {
            this.xPoints = xPoints;
            this.yPoints = yPoints;
            this.nPoints = nPoints;
            this.color = color;
        }
    }

/*    private double x1;
    private double x2;
    private double y;
    private Color color;*/
    private final LinkedList<Polygon> polygons = new LinkedList<>();

/*    //public ChartLine(Graphics g){
        paintComponent(g);
    }*/

/*    public ChartLine(Graphics g, double x1, double x2, double y) {
        this.x1 = x1;
        this.x2 = x2;
        this.y = y;
        this.color = Color.BLUE;
        //paint(g);
        //paintComponent(g);
    }

    public ChartLine(Graphics g, double x1, double x2, double y, Color color) {
        this.x1 = x1;
        this.x2 = x2;
        this.y = y;
        this.color = color;
        //paint(g);
        //paintComponent(g);
    }*/

    public void addPolygon(int[] xPoints,int[] yPoints,int nPoints) {
        addPolygon(xPoints,yPoints,nPoints,Color.BLUE);
    }

    public void addPolygon(int[] xPoints,int[] yPoints,int nPoints, Color color) {
        polygons.add(new Polygon(xPoints,yPoints,nPoints,color));
        repaint();
    }

    public void clearPolygon() {
        polygons.clear();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Polygon polygon : polygons) {
            g.setColor(Color.BLUE);
            g.drawPolyline(polygon.xPoints, polygon.yPoints, polygon.nPoints);
            g.drawLine(2,3,4,5);
        }
    }



/*    public void addPolygon(Graphics g,double x1, double x2, double y) {
        java.util.List<Integer> xValue = new ArrayList<Integer>();
        java.util.List<Integer> yValue = new ArrayList<Integer>();

        for (double i = x1; i < x2; i+= 0.1) {
            yValue.add(Coord.getCoordByPixelY(y));
            xValue.add(Coord.getCoordByPixelX(i));
        }

        int[] xArr = listToArr(xValue);
        int[] yArr = listToArr(yValue);
        polygons.add(new Polygon(xArr,yArr,xArr.length));
        repaint();
        paintComponent(g);
    }

    public void clearPolygon(Graphics g) {
        polygons.clear();
        paintComponent(g);
        //repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //super.paint(g);
        g.setColor(color);

        java.util.List<Integer> xValue = new ArrayList<Integer>();
        java.util.List<Integer> yValue = new ArrayList<Integer>();

        for (double i = x1; i < x2; i+= 0.1) {
            yValue.add(Coord.getCoordByPixelY(y));
            xValue.add(Coord.getCoordByPixelX(i));
        }

        int[] xArr = listToArr(xValue);
        int[] yArr = listToArr(yValue);


        polygons.add(new Polygon(xArr,yArr,xArr.length));
        for (Polygon polygon : polygons) {
            g.drawPolyline(polygon.xpoints,polygon.ypoints,polygon.npoints);
        }

        //g.drawPolyline(polygons.get(0).xpoints,polygons.get(0).ypoints,polygons.get(0).npoints);
        //g.drawPolyline(xArr,yArr, xArr.length);
    }*/



}
