package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.awt.*;

@Data
@NoArgsConstructor
public class Triangle extends JPanel {

    private int x_0, y_0, x_1, y_1, x_2, y_2;
    private Color color;
    private boolean VISION = true;

    public Triangle(int x_0, int y_0, int x_1, int y_1, int x_2, int y_2, Color color ) {
        setLayout(null);
        setOpaque(false);
        this.x_0 = x_0;
        this.y_0 = y_0;
        this.x_1 = x_1;
        this.y_1 = y_1;
        this.x_2 = x_2;
        this.y_2 = y_2;
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
            int[] xPoints = {x_0, x_1, x_2};
            int[] yPoints = {y_0, y_1, y_2};
            g.drawPolygon(xPoints, yPoints, 3);
        }
    }

    public void moveTo(int c1, int c2) {
        x_0 += c1;
        x_1 += c1;
        x_2 += c1;
        y_0 += c2;
        y_1 += c2;
        y_2 += c2;
    }

    public void changeSize(int c1, int c2) {
        x_0 -= c1;
        x_2 -= c1;
        y_0 += c2;
        y_2 -= c2;
    }
}
