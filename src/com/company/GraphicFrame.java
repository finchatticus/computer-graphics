package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cooper on 24.09.15.
 */
public class GraphicFrame extends JFrame {
    private PaintGraph pg; // ����� ������ ������� �������
    public final JTextField textPane_x = new JTextField(10);
    public final JTextField textPane_y = new JTextField(10);
    public final JTextField textFieldPixelX = new JTextField(10);
    public final JTextField textFieldPixelY = new JTextField(10);
    private final JTextField textFieldSizeA = new JTextField(10);
    private final JTextField textFieldSizeB = new JTextField(10);
    private final JTextField textFieldSizeC = new JTextField(10);
    private final JTextField textFieldSizeD = new JTextField(10);
    private final JTextField textFieldSizeE = new JTextField(10);
    private final JButton buttonDraw = new JButton("Draw");


    private Container c;

    public GraphicFrame() throws HeadlessException {
        init();
    }

    private void init() {
        c = getContentPane();
        c.setLayout(new BorderLayout()); // ��������� ��������� ����������
        create_PaintGraph();
        c.add(pg, BorderLayout.CENTER); // ������� ����������
        setSize(900, 700); // ������� ��������
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������� ����������


/*        JPanel panel_coords = createPanel_coords();
        c.add(panel_coords, BorderLayout.SOUTH);*/

        JPanel panel_managment = createPanel_managment();
        c.add(panel_managment, BorderLayout.EAST);

        Mouse mouse = new Mouse(this);
        pg.addMouseMotionListener(mouse);
    }

    private void create_PaintGraph() {
        pg = new PaintGraph(); // ������������� ������ ���������� ������� �������
        pg.setSize(600, 600); // ������� ��������
    }

    private JPanel createPanel_coords() {
        JPanel textPane = new JPanel();
        textPane.setLayout(new BoxLayout(textPane, BoxLayout.Y_AXIS));
        textPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        textPane.add(Box.createHorizontalGlue());
        textPane.add(Box.createRigidArea(new Dimension(10, 0)));
        textPane.add(textPane_x);
        textPane.add(textPane_y);
        return textPane;
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
        //managmentPane.add()
/*        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        Component labelUsername = new JLabel("123");
        Component textUsername = new JTextField(10);

        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        managmentPane.add(labelUsername, constraints);

        constraints.gridx = 1;
        managmentPane.add(textUsername, constraints);*/
        return managmentPane;
    }
}
