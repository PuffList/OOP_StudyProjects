package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.awt.*;

@Data
@NoArgsConstructor
public class Line extends JPanel {
    private int x_0;
    private int y_0;
    private int x_1;
    private int y_1;
    private Color color;
    private boolean VISION = true;

    public Line(int x_0, int y_0, int x_1, int y_1, Color color) {
        setLayout(null);
        setOpaque(false);
        this.x_0 = x_0;
        this.y_0 = y_0;
        this.x_1 = x_1;
        this.y_1 = y_1;
        this.color = color;
    }

    public void Show(boolean VISION) {
        this.VISION = VISION;
        setVisible(this.VISION);
        this.VISION = true;
        this.repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (VISION == true) {
            g.setColor(color);
            g.drawLine(x_0, y_0, x_1, y_1);
        }
    }

    public void moveTo(int c1, int c2) {
        x_0 += c1;
        x_1 += c1;
        y_0 += c2;
        y_1 += c2;
    }

    public void changeSize(int c1) {
        x_1 += c1;
        y_1 += c1;
    }
}
