package com.company.listeners;

import com.company.GraphicFrame;
import com.company.graphics.PaintGraph;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cooper on 04.10.15.
 */
public class ButtonClearListener implements ActionListener {
    private final GraphicFrame graphicFrame;
    private final PaintGraph paintGraph;

    public ButtonClearListener(GraphicFrame graphicFrame, PaintGraph paintGraph) {
        this.graphicFrame = graphicFrame;
        this.paintGraph = paintGraph;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        paintGraph.clearPolygon();
    }
}
