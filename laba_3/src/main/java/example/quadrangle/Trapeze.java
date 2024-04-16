package example.quadrangle;

import example.TQuadrangle;

import java.awt.*;

public class Trapeze extends TQuadrangle {

    public Trapeze(int x_0, int y_0, int w, int h, int c, Color color) {
        super(x_0, y_0);
        x_1 = x_0 + w; y_1 = y_0;
        x_2 = x_1 + c; y_2 = y_0 + h;
        x_3 = x_0 - c; y_3 = y_2;
       /* x_1 = x_0 + w; y_1 = y_0;
        x_2 = x_1 - c; y_2 = y_0 - h;
        x_3 = x_0 + c; y_3 = y_2;*/
        this.color = color;
    }
    @Override
    public void changeSize(int c1, int c2) {
        int x = super.gettX() + c1;
        int y = super.gettY() + c2;
        if (x >= 200 && x + x_1 <= 1900) {
            super.setX(super.gettX()-c1);
            x_1 += c1;
            x_2 += c1;
            x_3 -= c1;
        }
        if(y >= 200 && y + y_2 <= 990) {
            super.setY(y);
            y_1 += c2;
        }
    }
}
