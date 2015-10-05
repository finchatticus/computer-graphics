package com.company.listeners;

import com.company.GraphicFrame;
import com.company.charts.ChartLine;
import com.company.graphics.PaintGraph;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by cooper on 01.10.15.
 */
public class ButtonDrawListener implements ActionListener {

    private final GraphicFrame graphicFrame;
    private final PaintGraph paintGraph;

    public ButtonDrawListener(GraphicFrame graphicFrame,PaintGraph paintGraph) {
        this.graphicFrame = graphicFrame;
        this.paintGraph = paintGraph;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //graphicFrame.textFieldSizeB.setText("40");
/*        String B = graphicFrame.textFieldSizeB.getText();
        System.out.println("Ok");
        System.out.println(B);
        Double B1 = Double.valueOf(B);
        double y1 = B1/20.0;
        paintGraph.clearPolygon();

        java.util.List<Integer> xValue = new ArrayList<Integer>();
        java.util.List<Integer> yValue = new ArrayList<Integer>();

        double x1 = -8.0 + 2.0 * Math.sqrt(3.0);
        double x2 = 7.0;
        double y = 4.0;

        for (double i = x1; i < x2; i+= 0.1) {
            yValue.add(Coord.getCoordByPixelY(y));
            xValue.add(Coord.getCoordByPixelX(i));
        }

        int[] xArr = listToArr(xValue);
        int[] yArr = listToArr(yValue);


        paintGraph.addPolygon(xArr,yArr,xArr.length);*/

        ChartLine chartLine = new ChartLine(-8.0 + 2.0 * Math.sqrt(3.0),7,2);
        paintGraph.addPolygon(chartLine.getxPoints(), chartLine.getyPoints(), chartLine.getnPoints());

        ChartLine chartLine1 = new ChartLine(-8.0 + 2.0 * Math.sqrt(3.0),7,-2);
        paintGraph.addPolygon(chartLine1.getxPoints(), chartLine1.getyPoints(), chartLine1.getnPoints());



        //graphicFrame.getChartLine().addPolygon(xArr,yArr,xArr.length);
        //graphicFrame.getChartLine().clearPolygon();


/*        //ChartLine chartLine = new ChartLine(graphicArea.getGraphics(),-8.0 + 2.0 * Math.sqrt(3.0),7.0,y1);
        ChartLine chartLine = new ChartLine(graphicArea.getGraphics());
        chartLine.addPolygon(graphicArea.getGraphics(),-8.0 + 2.0 * Math.sqrt(3.0),7.0,y1);
        chartLine.clearPolygon(graphicArea.getGraphics());
        ChartLine chartLine1 = new ChartLine(graphicArea.getGraphics(),-8.0 + 2.0 * Math.sqrt(3.0),7.0,-y1);

        ChartLine chartLine2 = new ChartLine(graphicArea.getGraphics(),-8.0,7.0,6.0);
        ChartLine chartLine3 = new ChartLine(graphicArea.getGraphics(),-8.0,7.0,-6.0);

        ChartCircle chartCircle1 = new ChartCircle(graphicArea.getGraphics(),-14.0,-8.0,-8.0,0.0,6.0,1);
        ChartCircle chartCircle2 = new ChartCircle(graphicArea.getGraphics(),-14.0,-8.0,-8.0,0.0,6.0,-1);

        ChartCircle chartCircle3 = new ChartCircle(graphicArea.getGraphics(),7.0,13.0,7.0,0.0,6.0,1);
        ChartCircle chartCircle4 = new ChartCircle(graphicArea.getGraphics(),7.0,13.0,7.0,0.0,6.0,-1);

        ChartCircle chartCircle5 = new ChartCircle(graphicArea.getGraphics(),-12.0,-8.0 + 2.0*Math.sqrt(3.0),-8.0,0.0,4.0,1.0);
        ChartCircle chartCircle6 = new ChartCircle(graphicArea.getGraphics(),-12.0,-8.0 + 2.0*Math.sqrt(3.0),-8.0,0.0,4.0,-1.0);

        ChartCircle chartCircle7 = new ChartCircle(graphicArea.getGraphics(),7.0,9.0,7.0,0.0,2.0,1.0);
        ChartCircle chartCircle8 = new ChartCircle(graphicArea.getGraphics(),7.0,9.0,7.0,0.0,2.0,-1.0);*/

        //chartLine.clearPolygon();


        //getGraphics().drawPolyline(polygons.get(0).xpoints,polygons.get(0).ypoints,polygons.get(0).npoints);

        //polygons.clear();
        //getGraphics().drawLine(2,3,4,5);

    }

}


