package com.company.graphics;

import com.company.charts.ChartCircle;
import com.company.charts.ChartLine;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cooper on 30.09.15.
 */
public class GraphicsController extends JPanel {

    public GraphicsController(){}

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.GREEN);
        g.drawLine(0, 0, 600, 0);
        g.drawLine(0, 0, 0, 600);
        g.drawLine(0, 600, 600, 600);
        g.drawLine(600, 0, 600, 600);

        Grid grid = new Grid(g);
        Axis axis = new Axis(g);
        NameOfAxis nameOfAxis = new NameOfAxis(g);
        CutOnAxis cutOnAxis = new CutOnAxis(g);
        NumbersOnAxis numbersOnAxis = new NumbersOnAxis(g);

        ChartLine chartLine = new ChartLine(g,-8.0 + 2.0 * Math.sqrt(3.0),7.0,2.0);
        ChartLine chartLine1 = new ChartLine(g,-8.0 + 2.0 * Math.sqrt(3.0),7.0,-2.0);

        ChartLine chartLine2 = new ChartLine(g,-8.0,7.0,6.0);
        ChartLine chartLine3 = new ChartLine(g,-8.0,7.0,-6.0);

        ChartCircle chartCircle1 = new ChartCircle(g,-14.0,-8.0,-8.0,0.0,6.0,1);
        ChartCircle chartCircle2 = new ChartCircle(g,-14.0,-8.0,-8.0,0.0,6.0,-1);

        ChartCircle chartCircle3 = new ChartCircle(g,7.0,13.0,7.0,0.0,6.0,1);
        ChartCircle chartCircle4 = new ChartCircle(g,7.0,13.0,7.0,0.0,6.0,-1);

        ChartCircle chartCircle5 = new ChartCircle(g,-12.0,-8.0 + 2.0*Math.sqrt(3.0),-8.0,0.0,4.0,1.0);
        ChartCircle chartCircle6 = new ChartCircle(g,-12.0,-8.0 + 2.0*Math.sqrt(3.0),-8.0,0.0,4.0,-1.0);

        ChartCircle chartCircle7 = new ChartCircle(g,7.0,9.0,7.0,0.0,2.0,1.0);
        ChartCircle chartCircle8 = new ChartCircle(g,7.0,9.0,7.0,0.0,2.0,-1.0);
    }
    
}
