package example;

import javax.swing.*;
import java.awt.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ring extends JPanel {
    private Point points = new Point();
    private Circle one;
    private Circle two;
    private int D;
    private Color color;
    private boolean VISION = true;

    public Ring(int x, int y, int radius, Color color) {
        setLayout(null);
        setOpaque(false);


        System.out.println("Радиус равен: " + radius);
        this.one = new Circle(x, y, radius, color);
        this.two = new Circle(x, y, radius / 2, color);
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
            one.paintComponent(g);
            two.paintComponent(g);
        }
    }

    public void moveTo(int c1, int c2) {
        if(one.moveTo(c1, c2)) {
            two.moveTo(c1, c2);
        }


        /*int x = this.points.getX() + c1;
        int y = this.points.getY() + c2;
        if (x >= 200 & x + D <= 1160) {
            this.points.setX(x);
        }
        if (y >= 200 & y + D <= 580) {
            this.points.setY(y);
        }*/
    }

    public void changeSize(int c1) {
        if(one.changeSize(c1)) {
            two.changeSize(c1/2);
        }
        /*int x = this.points.getX() + c1;
        int y = this.points.getY() + c1;
        if (x >= 200 & x + D <= 1160 ) {
            D = c1;
        }
        if (y >= 200 & y + D <= 580) {
            D = c1;
        }*/


    }
}
