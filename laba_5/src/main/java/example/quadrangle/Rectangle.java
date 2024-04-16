package example.quadrangle;

import example.TQuadrangle;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends TQuadrangle {

    public Rectangle(int x_0, int y_0, int w, int h, Color color) {
        super(x_0, y_0);
        this.w = w;
        this.h = h;
        x_1 = x_2 = x_0 + w;
        y_1 = y_0;
        y_2 = y_3 = y_0 + h;
        x_3 = x_0;
        this.color = color;
        this.fig = 4;
        this.key_fig = 4;
    }

   public void changeSize(int c1, int c2) {
        int x = super.gettX() + c1;
        int y = super.gettY() + c2;
        if (x > 0 && x_1 + c1 < iWidth) {
            x_1 += c1;
            x_2 = x_1;
        }
        if(y > 0 && y_1 + c2 < iHeight) {
            y_1 += c2;
            super.setY(y_1);
        }
    }
}
