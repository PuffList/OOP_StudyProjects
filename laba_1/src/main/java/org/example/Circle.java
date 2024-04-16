package org.example;

import lombok.NoArgsConstructor;
import lombok.Data;

import javax.swing.*;
import java.awt.*;

@NoArgsConstructor
@Data
public class Circle extends JPanel {
    private int x;
    private int y;
    private int radius;
    private Color color;
    private boolean VISION = true;

    public Circle(int x, int y, int radius, Color color) {
        setLayout(null);
        setOpaque(false);
        this.x = x;
        this.y = y;
        this.radius = radius;
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
            g.drawOval(x, y, radius, radius);
        }
    }

    public void moveTo(int c1, int c2) {
        x += c1;
        y += c2;
    }

    public void changeSize(int c1) {
        radius = c1;
    }
}
