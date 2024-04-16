package example;

import java.awt.*;

public class TCircle extends TFigure {
    protected Color color;

    public TCircle(int x, int y, int r, Color color) {
        super(x, y);
        this.r1 = this.r2 = r;
        this.color = color;
        this.fig = 1;
        this.key_fig = 1;
    }

    public TCircle(int x, int y) {
        super(x, y);
    }

    /*@Override
    public void moveTo(int c1, int c2) {
        int x = super.gettX() + c1;
        int y = super.gettY() + c2;
        if (x >= 200 & x + r1*2 <= 1160) {
            super.setX(x);
        }
        if (y >= 200 & y + r2*2 <= 580) {
            super.setY(y);
        }
    }*/

    public void changeSize(int c1, int c2) {
        if (key_fig == 1) {
            int x = super.gettX() + c1;
            int y = super.gettY() + c1;
            if(x > 0 && x < iWidth && y > 0 && y < iHeight) {
                r1 = c1;
                r2 = c1;
            }
        }
        else if (key_fig == 2) {
            int x = super.gettX() + c1;
            int y = super.gettY() + c2;
            if(x > 0 && x < iWidth && y > 0 && y < iHeight) {
                r1 = c1;
                r2 = c2;
            }
        }

        /*if (x >= 200 & x + r1*2 <= 1160 & y >= 200 & y + r2*2 <= 580) {
            r1 = c1;
            r2 = c1;
        }*/
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (super.VISION) {
            g.setColor(color);
            g.drawOval(super.gettX(),super.gettY(),r1*2,r2*2);
        }
    }


}
