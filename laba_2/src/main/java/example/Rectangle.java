package example;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.awt.*;

@Data
@NoArgsConstructor
public class Rectangle extends JPanel {
    private Point points = new Point();
    private int x_1;
    private int y_1;
    private Color color;

    private boolean VISION = true;

    public Rectangle(int x_0, int y_0, int x_1, int y_1, Color color) {
        setLayout(null);
        setOpaque(false);

        this.points.setX(x_0);
        this.points.setY(y_0);
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
            g.drawRect(this.points.getX(), this.points.getY(), x_1, y_1);
        }
    }

    public void moveTo(int c1, int c2) {
            int x = this.points.getX() + c1;
            int y = this.points.getY() + c2;
            if (x >= 200 & x + x_1 <= 1160 ) {
                this.points.setX(x);
            }
            if (y >= 200 & y + y_1 <= 580) {
                this.points.setY(y);
            }
    }

    public void changeSize(int c1, int c2) {
        int x = this.points.getX() + c1;
        int y = this.points.getY() + c2;
        if (x >= 200 & x + x_1 <= 1160 ) {
            x_1 += c1;
        }
        if (y >= 200 & y + y_1 <= 580) {
            y_1 += c2;
        }
    }
}
