package example.quadrangle;

import example.TQuadrangle;

import java.awt.*;

public class Romb extends TQuadrangle {

    public Romb(int x_0, int y_0, int w, int h, Color color) {
        super(x_0, y_0);
        x_1 = x_3 = x_0 + w/2;
        y_1 = y_0 - h/2;
        x_2 = x_0 + w;
        y_2 = y_0;
        y_3 = y_0 + h/2;
        this.color = color;
    }
    @Override
    public void changeSize(int c1, int c2) {
        int x = super.gettX() + c1;
        int y = super.gettY() + c2;
        if (x >= 200 && x + x_1 <= 1900 ) {
            super.setX(x);
            x_2 -= c1;
        }
        if(y >= 200 && y + y_1 <= 790) {
            super.setY(super.gettY());
            y_1 += c2;
            y_3 -= c2;
        }
    }
}
