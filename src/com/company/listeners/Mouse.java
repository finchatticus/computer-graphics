package com.company.listeners;

import com.company.GraphicFrame;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * Created by vlad on 24.09.2015.
 */

public class Mouse implements MouseMotionListener {

    private final GraphicFrame graphicFrame;

    public Mouse(GraphicFrame graphicFrame) {
        this.graphicFrame = graphicFrame;
    }

    public void mouseMoved(MouseEvent e) {

        graphicFrame.textPane_x.setText(getCoordX(e.getX()));
        graphicFrame.textPane_y.setText(getCoordY(e.getY()));
        graphicFrame.textFieldPixelX.setText(String.valueOf(e.getX()));
        graphicFrame.textFieldPixelY.setText(String.valueOf(e.getY()));
    }

    public void mouseDragged(MouseEvent e) {
        //do something
    }

    public double getCoord(int x) {
        return ((x - 300) / 20.0);
    }

    public String getCoordX(int x) {
        return String.valueOf(getCoord(x));
    }

    public String getCoordY(int y) {
        return String.valueOf(-getCoord(y));
    }

}