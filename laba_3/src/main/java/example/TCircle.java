package example;

import java.awt.*;

public class TCircle extends TFigure {
    protected int r1, r2;
    protected Color color;
    protected boolean VISION;

    public TCircle(int x, int y, int r, Color color) {
        super(x, y);
        r1 = r2 = r;
        this.color = color;
    }

    public TCircle(int x, int y) {
        super(x, y);
    }

    @Override
    public void Show(boolean VISION) {
        this.VISION = VISION;
        setVisible(this.VISION);
        this.VISION = true;
        this.repaint();
    }

    @Override
    public void moveTo(int c1, int c2) {
        int x = super.gettX() + c1;
        int y = super.gettY() + c2;
        if (x >= 200 & x + r1*2 <= 1160) {
            super.setX(x);
        }
        if (y >= 200 & y + r2*2 <= 580) {
            super.setY(y);
        }
    }

    public void changeSize(int c1) {
        int x = super.gettX() + c1;
        int y = super.gettY() + c1;
        if (x >= 200 & x + r1*2 <= 1160 & y >= 200 & y + r2*2 <= 580) {
            r1 = c1;
            r2 = c1;
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (VISION == true) {
            g.setColor(color);
            g.drawOval(super.gettX(),super.gettY(),r1*2,r2*2);
        }
    }


}
