package example;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.awt.*;

@NoArgsConstructor
@Data
public class Circle extends JPanel {
    private Point points = new Point();
    private int D;
    private Color color;
    private boolean VISION = true;

    public Circle(int x, int y, int radius, Color color) {
        setLayout(null);
        setOpaque(false);


        System.out.println("Радиус равен: " + radius);
        this.points.setX(x);
        this.points.setY(y);
        this.D = radius * 2;
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
            g.drawOval(this.points.getX() - this.D / 2, this.points.getY() - this.D / 2, this.D, this.D);
        }
    }

    public boolean moveTo(int c1, int c2) {
            int x = this.points.getX() + c1;
            int y = this.points.getY() + c2;
            if (x >= 200 && x + D <= 1160 && y >= 200 && y + D <= 580) {
                this.points.setX(x);
                this.points.setY(y);
                return true;
            }

            return false;
    }

    public boolean changeSize(int c1) {
        int x = this.points.getX() + c1;
        int y = this.points.getY() + c1;
        if (x >= 200 & x + D <= 1160 ) {
            D = c1;
            return true;
        }
        if(y >= 200 & y + D <= 580) {
            D = c1;
            return true;
        }

        return false;
    }
}
