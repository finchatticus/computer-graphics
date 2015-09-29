package com.company.graphics;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cooper on 30.09.15.
 */
public class Grid extends JPanel {

    private Color colorX;
    private Color colorY;

    public Grid() {
        this.colorX = Color.MAGENTA;
        this.colorY = Color.MAGENTA;
    }

    public Grid(Graphics g) {
        this();
        paint(g);
    }

    public Grid(Graphics g,Color colorX, Color colorY) {
        this.colorX = colorX;
        this.colorY = colorY;
        paint(g);
    }

    public void paint(Graphics g) {

        //frame
        g.setColor(Color.GREEN);
        g.drawLine(0, 0, 600, 0);
        g.drawLine(0, 0, 0, 600);
        g.drawLine(0, 600, 600, 600);
        g.drawLine(600, 0, 600, 600);

        //Y
        g.setColor(colorY);
        for (int i = 20; i < 590; i+=20) {
            g.drawLine(i,20,i,580);
        }

        //X
        g.setColor(colorX);
        for (int i = 20; i < 590; i+=20) {
            g.drawLine(20,i,580,i);
        }
    }
}
