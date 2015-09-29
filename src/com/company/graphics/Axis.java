package com.company.graphics;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cooper on 30.09.15.
 */
public class Axis extends JPanel {

    private Color color;

    public Axis(){
        this.color = Color.BLACK;
    }

    public Axis(Graphics g) {
        this.color = Color.BLACK;
        paint(g);
    }

    public Axis(Graphics g, Color color) {
        this.color = color;
        paint(g);
    }

    public void paint(Graphics g) {
        g.setColor(color);
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
    }
}
