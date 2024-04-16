package example.circles;

import example.TCircle;

import java.awt.*;

public class Ellipse extends TCircle {

    public Ellipse(int x, int y, int r1, int r2, Color color) {
        super(x, y);
        this.r1 = r1;
        this.r2 = r2;
        this.fig = 1;
        this.color = color;
    }

    public void changeSize(int c1) {
        int x = super.gettX() + c1;
        int y = super.gettY() + c1;
        if (x >= 200 & x + r1*2 <= 1160 ) {
            r1 = c1;
        }
        if (y >= 200 & y + r2*2 <= 580) {
            r2 = c1;
        }
    }
    public void turn() {
        int a = r1;
        int x = super.gettX();
        int y = super.gettY();

        if(y >= 200 & y + r1*2 <= 580 & x >= 200 & x + r1*2 <= 1160){
            r1=r2;
            r2= a;
            this.repaint();
        }

    }
}
