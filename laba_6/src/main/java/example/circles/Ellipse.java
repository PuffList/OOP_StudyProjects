package example.circles;

import example.TCircle;

import java.awt.*;

public class Ellipse extends TCircle {

    public Ellipse(int x, int y, int r1, int r2, Color color) {
        super(x, y);
        this.r1 = r1;
        this.r2 = r2;
        this.fig = 1;
        this.key_fig = 2;
        this.color = color;
    }

    public void changeSize(int c1, int c2) {
        int x = super.gettX() + c1;
        int y = super.gettY() + c2;
        if(x > 0 && x < iWidth && y > 0 && y < iHeight) {
            r1 = c1;
            r2 = c2;
        }
    }
    public void turn() {
        int a = r1;
        int x = super.gettX();
        int y = super.gettY();

        if(y + r1 > 0 && y + r1 < iHeight  && x + r2 > 0 && x + r2 < iWidth){
            r1=r2;
            r2= a;
            this.repaint();
        }

    }
}
