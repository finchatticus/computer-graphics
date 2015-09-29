package com.company.graphics;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cooper on 30.09.15.
 */
public class GraphicsController extends JPanel {

    public void paint(Graphics g) {
        super.paint(g);

        Grid grid = new Grid(g);
        Axis axis = new Axis(g);
        NameOfAxis nameOfAxis = new NameOfAxis(g);
        CutOnAxis cutOnAxis = new CutOnAxis(g);
        NumbersOnAxis numbersOnAxis = new NumbersOnAxis(g);
    }
    
}
