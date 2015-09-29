package com.company.graphics;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cooper on 30.09.15.
 */
public class NumbersOnAxis extends JPanel {

    private Color color;
    private Font font;

    public NumbersOnAxis(){
        this.color = Color.BLACK;
    }

    public NumbersOnAxis(Graphics g){
        this();
        paint(g);
    }

    public NumbersOnAxis(Graphics g, Color color) {
        this.color = color;
        paint(g);

    }

    public void paint(Graphics g) {
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
    }

}
