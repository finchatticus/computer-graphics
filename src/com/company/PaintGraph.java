package com.company;

/**
 * Created by vlad on 14.09.2015.
 */
import com.company.util.Coord;

import java.awt.*;
import javax.swing.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

import static com.company.util.Arrays.listToArr;

public class PaintGraph extends JPanel
{

    public PaintGraph()
    {

    }

    public void paint(Graphics g) {
        super.paint(g);

        //??????? ???????
        g.setColor(Color.GREEN);
        g.drawLine(0, 0, 600, 0);
        g.drawLine(0, 0, 0, 600);
        g.drawLine(0, 600, 600, 600);
        g.drawLine(600, 0, 600, 600);

/*        //???????????? ?????
        g.setColor(Color.MAGENTA);
        for (int i = 40; i < 570; i+=20) {
            g.drawLine(i,40,i,560);
        }

        //?????????????? ?????
        for (int i = 40; i < 570; i+=20) {
            g.drawLine(40,i,560,i);
        }*/

        //???????????? ?????
        g.setColor(Color.MAGENTA);
        for (int i = 20; i < 590; i+=20) {
            g.drawLine(i,20,i,580);
        }
        //?????????????? ?????
        for (int i = 20; i < 590; i+=20) {
            g.drawLine(20,i,580,i);
        }

        g.setColor(Color.BLACK);
        //??? Y
        g.drawLine(300,10,300,590);
        //??? X
        g.drawLine(10,300,590,300);
        //??????? ??? ??? ?????
        g.drawLine(300,10,295,15);
        g.drawLine(300,10,305,15);
        //??????? ??? ????
        g.drawLine(590,300,585,295);
        g.drawLine(590,300,585,305);

        //graph cut on X
        for (int i = 20; i <= 580; i+=20) {
            g.drawLine(i,296,i,304);
        }

        //graph cut on Y
        for (int i = 20; i <= 580; i+=20) {
            g.drawLine(296,i,304,i);
        }

        Font font1 = new Font("Serif", Font.PLAIN, 10);
        g.setFont(font1);

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

        //??????? ????
        Font font = new Font("Serif", Font.PLAIN, 14);
        g.setFont(font);
        g.drawString("x", 585, 320);
        g.drawString("y", 310, 20);

        g.setColor(Color.BLUE);

        drawGraph1(g);
        drawGraph2(g);
        drawGraph3(g);
        drawGraph4(g);
        drawGraph5(g);
        drawGraph6(g);

    }
    
    public static void drawNumbers(Graphics g) {
        Font font = new Font("Serif", Font.PLAIN, 14);
        g.setFont(font);

        for (int i = 0; i < 10; i++) {
            
        }
        
        g.drawString("x", 585, 320);
    }

    //big semicircle left two graph |y| = (36-(x+8)^2)^(1/2)
    private void drawGraph1(Graphics g) {

        List<Integer> x = new ArrayList<Integer>();
        List<Integer> y = new ArrayList<Integer>();

        //up graph
        for (double i = -14.0; i < -8.0; i+= 0.1) {
            y.add(Coord.getCoordByPixelY(Math.sqrt(36 - Math.pow(i + 8, 2))));
            x.add(Coord.getCoordByPixelX(i));
        }

        int[] xArr = listToArr(x);
        int[] yArr = listToArr(y);

        g.drawPolyline(xArr,yArr, xArr.length);

        x.clear();
        y.clear();

        //down graph
        for (double i = -14.0; i < -8.0; i+= 0.1) {
            y.add(Coord.getCoordByPixelY(-Math.sqrt( 36 - Math.pow(i + 8, 2))));
            x.add(Coord.getCoordByPixelX(i));
        }

        int[] xArr1 = listToArr(x);
        int[] yArr1 = listToArr(y);

        g.drawPolyline(xArr1,yArr1, xArr.length);
    }

    //first graph |y| = 6
    private void drawGraph2(Graphics g) {

        List<Integer> x = new ArrayList<Integer>();
        List<Integer> y = new ArrayList<Integer>();

        //up graph
        for (double i = -8.0; i < 7.0; i+= 0.1) {
            y.add(Coord.getCoordByPixelY(6.0));
            x.add(Coord.getCoordByPixelX(i));
        }

        int[] xArr = listToArr(x);
        int[] yArr = listToArr(y);

        g.drawPolyline(xArr,yArr, xArr.length);

        x.clear();
        y.clear();

        //down graph
        for (double i = -8.0; i < 7.0; i+= 0.1) {
            y.add(Coord.getCoordByPixelY(-6.0));
            x.add(Coord.getCoordByPixelX(i));
        }

        int[] xArr1 = listToArr(x);
        int[] yArr1 = listToArr(y);

        g.drawPolyline(xArr1,yArr1, xArr.length);
    }

    //big semicircle right two graph |y| = (36-(x-7)^2)^(1/2)
    private void drawGraph3(Graphics g) {

        List<Integer> x = new ArrayList<Integer>();
        List<Integer> y = new ArrayList<Integer>();

        //up graph
        for (double i = 7.0; i < 13.0; i+= 0.1) {
            y.add(Coord.getCoordByPixelY(Math.sqrt( 36 - Math.pow(i - 7, 2))));
            x.add(Coord.getCoordByPixelX(i));
        }

        int[] xArr = listToArr(x);
        int[] yArr = listToArr(y);

        g.drawPolyline(xArr,yArr, xArr.length);

        x.clear();
        y.clear();

        //down graph
        for (double i = 7.0; i < 13.0; i+= 0.1) {
            y.add(Coord.getCoordByPixelY(-Math.sqrt( 36 - Math.pow(i - 7, 2))));
            x.add(Coord.getCoordByPixelX(i));
        }

        int[] xArr1 = listToArr(x);
        int[] yArr1 = listToArr(y);

        g.drawPolyline(xArr1,yArr1, xArr.length);
    }

    //small semicircle left two graph |y| = (16-(x+8)^2)^(1/2)
    private void drawGraph4(Graphics g) {

        List<Integer> x = new ArrayList<Integer>();
        List<Integer> y = new ArrayList<Integer>();

        //up graph
        for (double i = -12.0; i < -8.0 + 2 * Math.sqrt(3.0655); i+= 0.1) {
            y.add(Coord.getCoordByPixelY(Math.sqrt( 16 - Math.pow(i + 8, 2))));
            x.add(Coord.getCoordByPixelX(i));
        }

        int[] xArr = listToArr(x);
        int[] yArr = listToArr(y);

        g.drawPolyline(xArr,yArr, xArr.length);

        x.clear();
        y.clear();

        //down graph
        for (double i = -12.0; i < -8.0 + 2 * Math.sqrt(3.065); i+= 0.1) {
            y.add(Coord.getCoordByPixelY(-Math.sqrt( 16 - Math.pow(i + 8, 2))));
            x.add(Coord.getCoordByPixelX(i));
        }

        int[] xArr1 = listToArr(x);
        int[] yArr1 = listToArr(y);

        g.drawPolyline(xArr1,yArr1, xArr.length);
    }

    //graph |y| = 2
    private void drawGraph5(Graphics g) {

        List<Integer> x = new ArrayList<Integer>();
        List<Integer> y = new ArrayList<Integer>();

        //up graph
        for (double i = -8.0 + 2 * Math.sqrt(3); i < 7.0; i+= 0.1) {
            y.add(Coord.getCoordByPixelY(2.0));
            x.add(Coord.getCoordByPixelX(i));
        }

        int[] xArr = listToArr(x);
        int[] yArr = listToArr(y);

        g.drawPolyline(xArr,yArr, xArr.length);

        x.clear();
        y.clear();

        //down graph
        for (double i = -8.0 + 2 * Math.sqrt(3); i < 7.0; i+= 0.1) {
            y.add(Coord.getCoordByPixelY(-2.0));
            x.add(Coord.getCoordByPixelX(i));
        }

        int[] xArr1 = listToArr(x);
        int[] yArr1 = listToArr(y);

        g.drawPolyline(xArr1,yArr1, xArr.length);
    }


    //small semicircle right two graph |y| = (4-(x-7)^2)^(1/2)
    private void drawGraph6(Graphics g) {

        List<Integer> x = new ArrayList<Integer>();
        List<Integer> y = new ArrayList<Integer>();

        //up graph
        for (double i = 7.0; i < 9.0; i+= 0.1) {
            y.add(Coord.getCoordByPixelY(Math.sqrt( 4 - Math.pow(i - 7, 2))));
            x.add(Coord.getCoordByPixelX(i));
        }

        int[] xArr = listToArr(x);
        int[] yArr = listToArr(y);

        g.drawPolyline(xArr,yArr, xArr.length);

        x.clear();
        y.clear();

        //down graph
        for (double i = 7.0; i < 9.0; i+= 0.1) {
            y.add(Coord.getCoordByPixelY(-Math.sqrt( 4 - Math.pow(i - 7, 2))));
            x.add(Coord.getCoordByPixelX(i));
        }

        int[] xArr1 = listToArr(x);
        int[] yArr1 = listToArr(y);

        g.drawPolyline(xArr1,yArr1, xArr.length);
    }
}
