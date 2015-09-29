package com.company.graphics;

import java.awt.*;

/**
 * Created by cooper on 30.09.15.
 */
public class CutOnAxis {

    private Color color;

    public CutOnAxis(){
        this.color = Color.BLACK;
    }

    public CutOnAxis(Graphics g) {
        this();
        paint(g);
    }

    public CutOnAxis(Graphics g,Color color) {
        this.color = color;
        paint(g);
    }

    public void paint(Graphics g) {
        g.setColor(color);
        //graph cut on X
        for (int i = 20; i <= 580; i+=20) {
            g.drawLine(i,296,i,304);
        }

        //graph cut on Y
        for (int i = 20; i <= 580; i+=20) {
            g.drawLine(296,i,304,i);
        }
    }
}
