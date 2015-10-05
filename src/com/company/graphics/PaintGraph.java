package com.company.graphics;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

/**
 * Created by cooper on 05.10.15.
 */
public class PaintGraph extends JComponent {
    private static class Polygon{
        int[] xPoints;
        int[] yPoints;
        int nPoints;
        Color color;

        public Polygon(int[] xPoints,int[] yPoints,int nPoints,Color color) {
            this.xPoints = xPoints;
            this.yPoints = yPoints;
            this.nPoints = nPoints;
            this.color = color;
        }
    }

    private LinkedList<Polygon> polygons = new LinkedList<>();

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

        //grid
        //frame
        g.setColor(Color.GREEN);
        g.drawLine(0, 0, 600, 0);
        g.drawLine(0, 0, 0, 600);
        g.drawLine(0, 600, 600, 600);
        g.drawLine(600, 0, 600, 600);

        //Y
        g.setColor(Color.MAGENTA);
        for (int i = 20; i < 590; i+=20) {
            g.drawLine(i,20,i,580);
        }

        //X
        g.setColor(Color.MAGENTA);
        for (int i = 20; i < 590; i+=20) {
            g.drawLine(20,i,580,i);
        }

        //axis
        g.setColor(Color.BLACK);
        //Y
        g.drawLine(300,10,300,590);
        //X
        g.drawLine(10,300,590,300);
        //Arrows Y
        g.drawLine(300,10,295,15);
        g.drawLine(300,10,305,15);
        //Arrows X
        g.drawLine(590,300,585,295);
        g.drawLine(590,300,585,305);

        //nameOfAxis
        Font font = new Font("Serif", Font.PLAIN, 14);
        g.setFont(font);
        g.setColor(Color.BLACK);
        g.drawString("x", 585, 320);
        g.drawString("y", 310, 20);

        //cutOnAxis
        g.setColor(Color.BLACK);
        //graph cut on X
        for (int i = 20; i <= 580; i+=20) {
            g.drawLine(i,296,i,304);
        }

        //graph cut on Y
        for (int i = 20; i <= 580; i+=20) {
            g.drawLine(296,i,304,i);
        }

        //numberOnAxis
        font = new Font("Serif", Font.PLAIN, 10);
        g.setFont(font);

        //draw numbers Y 0-13
        for (int i = 1, j = 284; i <= 13; i++,j-=20 ) {
            g.drawString(String.valueOf(i), 310, j);
        }

        //draw numbers Y -13-0
        for (int i = 1, j = 323; i <= 13; i++,j+=20 ) {
            g.drawString(String.valueOf(-i), 310, j);
        }

        //draw numbers X 0-13
        for (int i = 1, j = 317; i <= 13; i++,j+=20 ) {
            g.drawString(String.valueOf(i), j, 315);
        }

        //draw numbers X -13-0
        for (int i = 13, j = 35; i >= 1; i--,j+=20 ) {
            g.drawString(String.valueOf(-i), j, 315);
        }

        //draw graph
        for (Polygon polygon : polygons) {
            g.setColor(Color.BLUE);
            g.drawPolyline(polygon.xPoints, polygon.yPoints, polygon.nPoints);
            g.drawLine(2,3,4,5);
        }
    }
}
