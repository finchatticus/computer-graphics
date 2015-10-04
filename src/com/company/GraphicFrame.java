package com.company;

import com.company.charts.ChartLine;
import com.company.graphics.GraphicsController;
import com.company.listeners.ButtonClearListener;
import com.company.listeners.ButtonDrawListener;
import com.company.listeners.MouseListener;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cooper on 24.09.15.
 */
public class GraphicFrame extends JFrame {
    private GraphicsController graphicsArea;
    private ChartLine chartLine;
    public final JTextField textPane_x = new JTextField(10);
    public final JTextField textPane_y = new JTextField(10);
    public final JTextField textFieldPixelX = new JTextField(10);
    public final JTextField textFieldPixelY = new JTextField(10);
    public final JTextField textFieldSizeA = new JTextField(10);
    public final JTextField textFieldSizeB = new JTextField(10);
    public final JTextField textFieldSizeC = new JTextField(10);
    public final JTextField textFieldSizeD = new JTextField(10);
    public final JTextField textFieldSizeE = new JTextField(10);
    public final JButton buttonDraw = new JButton("Draw");
    public final JButton buttonClear = new JButton("Clear");


    private Container c;

    public GraphicFrame() throws HeadlessException {
        init();
    }

    private void init() {
        c = getContentPane();
        c.setLayout(new BorderLayout());
        //graphicsArea = new GraphicsController();
        //graphicsArea.setSize(600, 600);
        //c.add(graphicsArea,BorderLayout.CENTER);
        chartLine = new ChartLine();
        chartLine.setPreferredSize(new Dimension(600,600));
        c.add(chartLine,BorderLayout.CENTER);
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textFieldSizeB.setText("40");

        JPanel panel_managment = createPanel_managment();
        c.add(panel_managment, BorderLayout.EAST);

        //MouseListener mouseListener = new MouseListener(this);
        //graphicsArea.addMouseMotionListener(mouseListener);

    }

    private JPanel createPanel_managment() {
        JLabel labelX = new JLabel("X: ");
        JLabel labelY = new JLabel("Y: ");
        JLabel labelPixelX = new JLabel("Pixel X");
        JLabel labelPixwlY = new JLabel("Pixel Y");
        JLabel labelA = new JLabel("A");
        JLabel labelB = new JLabel("B");
        JLabel labelC = new JLabel("C");
        JLabel labelD = new JLabel("D");
        JLabel labelE = new JLabel("E");

        textPane_x.setEditable(false);
        textPane_y.setEditable(false);
        textFieldPixelX.setEditable(false);
        textFieldPixelY.setEditable(false);


        JPanel managmentPane = new JPanel(new GridLayout(0,2));
        managmentPane.add(labelX);
        managmentPane.add(textPane_x);
        managmentPane.add(labelY);
        managmentPane.add(textPane_y);
        managmentPane.add(labelPixelX);
        managmentPane.add(textFieldPixelX);
        managmentPane.add(labelPixwlY);
        managmentPane.add(textFieldPixelY);
        managmentPane.add(labelA);
        managmentPane.add(textFieldSizeA);
        managmentPane.add(labelB);
        managmentPane.add(textFieldSizeB);
        managmentPane.add(labelC);
        managmentPane.add(textFieldSizeC);
        managmentPane.add(labelD);
        managmentPane.add(textFieldSizeD);
        managmentPane.add(labelE);
        managmentPane.add(textFieldSizeE);
        managmentPane.add(buttonDraw);
        managmentPane.add(buttonClear);

        ButtonDrawListener buttonDrawListener = new ButtonDrawListener(this, graphicsArea);
        buttonDraw.addActionListener(buttonDrawListener);

        ButtonClearListener buttonClearListener = new ButtonClearListener(this, graphicsArea);
        buttonClear.addActionListener(buttonClearListener);

        return managmentPane;
    }

    public GraphicsController getGraphicsArea(){
        return graphicsArea;
    }
    public ChartLine getChartLine(){
        return chartLine;
    }
}
