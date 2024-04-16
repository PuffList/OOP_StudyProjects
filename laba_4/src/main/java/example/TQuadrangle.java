package example;

import java.awt.*;


public class TQuadrangle extends TFigure{
    //protected int x_1, y_1, x_2, y_2, x_3, y_3;
    protected int w, h;
    protected Color color;

    public TQuadrangle(int x_0, int y_0, int x_1, int y_1, int x_2, int y_2, int x_3, int y_3, Color color) {
        super(x_0, y_0);
        this.x_1 = x_1;
        this.y_1 = y_1;
        this.x_2 = x_2;
        this.y_2 = y_2;
        this.x_3 = x_3;
        this.y_3 = y_3;
        this.color = color;
    }


    public TQuadrangle(int x_0, int y_0) {
        super(x_0, y_0);
    }

    /*@Override
    public void moveTo(int c1, int c2) {
        int x = super.gettX() + c1;
        int y = super.gettY() + c2;
        System.out.println(x_1);
        System.out.println(y_2);
        if (x >= 200 && x + x_1 <= 1900) {
            super.setX(x);

            x_1 += c1;
            x_2 += c1;
            x_3 += c1;
        }
        if(y >= 200 && y + y_2 <= 890) {
            super.setY(y);
            y_1 += c2;
            y_2 += c2;
            y_3 += c2;
        }
    }*/

     public void changeSize(int c1, int c2) {
        int x = super.gettX() + c1;
        int y = super.gettY() + c2;
        if (x >= 200 && x + x_1 <= 1900) {
            x_1 += c1;
            x_2 = x_1;

        }
        if(y >= 200 && y + y_1 <= 590) {
            y_2 += c2;
            y_3 = y_2;
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (super.VISION) {
            int x_0 = super.gettX();
            int y_0 = super.gettY();
            g.setColor(color);
            g.drawLine(x_0, y_0, x_1, y_1);
            g.drawLine(x_1, y_1, x_2, y_2);
            g.drawLine(x_2, y_2, x_3, y_3);
            g.drawLine(x_3, y_3, x_0, y_0);

        }
    }
}
