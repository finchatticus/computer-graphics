package com.company.listeners;

import com.company.GraphicFrame;
import com.company.graphics.GraphicsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cooper on 04.10.15.
 */
public class ButtonClearListener implements ActionListener {
    private final GraphicFrame graphicFrame;
    private final GraphicsController graphicArea;

    public ButtonClearListener(GraphicFrame graphicFrame, GraphicsController graphicsArea) {
        this.graphicArea = graphicsArea;
        this.graphicFrame = graphicFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        graphicFrame.getChartLine().clearPolygon();
    }
}
