package com.company.graphics;

import java.awt.*;

/**
 * Created by cooper on 30.09.15.
 */
public class NameOfAxis {

    private Font font;
    private Color color;

    public NameOfAxis(){
        this.color = Color.BLACK;
    }

    public NameOfAxis(Graphics g) {
        this();
        paint(g);
    }

    public NameOfAxis(Graphics g, Color color) {
        this.color = color;
        paint(g);
    }

    public void paint(Graphics g) {
        font = new Font("Serif", Font.PLAIN, 14);
        g.setFont(font);
        g.setColor(color);
        g.drawString("x", 585, 320);
        g.drawString("y", 310, 20);
    }

}
