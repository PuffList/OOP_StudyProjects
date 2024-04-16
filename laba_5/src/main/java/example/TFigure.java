package example;

import javax.swing.*;

import lombok.NoArgsConstructor;

@NoArgsConstructor
abstract class TFigure extends JPanel {
    private Point points = new Point();
    public boolean VISION;
    public int fig, key_fig;
    public int r1,r2;
    public int x_1,x_2,x_3,y_1,y_2,y_3;
    public int iWidth = 1000, iHeight = 450;
    //abstract void moveTo(int x, int y);

    public TFigure(int x, int y) {
        setLayout(null);
        setOpaque(false);
        points.setX(x);
        points.setY(y);
    }

    public void Show(boolean VISION) {
        this.VISION = VISION;
        setVisible(this.VISION);
        this.VISION = true;
        this.repaint();
    }

    public void moveTo(int c1, int c2) {
        this.Show(false);
        if (fig == 1) {
            if(check(1,c1,c2)){
                points.setX(gettX() + c1);
                points.setY(gettY() + c2);
            }
        } else if (fig == 4) {

            if (check(4, c1, c2)) {
                points.setX(gettX() + c1);
                points.setY(gettY() + c2);
                x_1 += c1; y_1 += c2;
                x_2 += c1; y_2 += c2;
                x_3 += c1; y_3 += c2;
            }


        }
        this.Show(true);




        /*if (fig == 1) {
            int x = gettX() + c1;
            int y = gettY() + c2;
            if (x >= 200 & x + r1*2 <= 1160) {
                setX(x);
            }
            if (y >= 200 & y + r2*2 <= 580) {
                setY(y);
            }
        }
        else {
            int x = gettX() + c1;
            int y = gettY() + c2;
            System.out.println(x_1);
            System.out.println(y_2);
            if (x >= 200 && x + x_1 <= 1900) {
                setX(x);

                x_1 += c1;
                x_2 += c1;
                x_3 += c1;
            }
            if (y >= 200 && y + y_2 <= 890) {
                setY(y);
                y_1 += c2;
                y_2 += c2;
                y_3 += c2;
            }
        }*/

    }

    private boolean check(int fig, int c1, int c2){
        if (fig == 0) {
            return (gettX() + c1 > 0 && gettX() + c1 < iWidth && gettY() + c2 > 0 && gettY() + c2 < iHeight );
        } else if (fig == 1) {
            return (gettX() + c1 - r1 > 0 && gettX() + c1 + r1 < iWidth && gettY() + c2 - r2 > 0 && gettY() + c2 + r2 < iHeight);
        } else if (fig == 4) {
            return (gettX() + c1 > 0 && gettX() + c1 < iWidth && gettY() + c2 > 0 && gettY() + c2 < iHeight &&
                    x_1 + c1 > 0 && x_1 + c1 < iWidth && y_1 + c2 > 0 && y_1 + c2 < iHeight &&
                    x_2 + c1 > 0 && x_2 + c1 < iWidth && y_2 + c2 > 0 && y_2 + c2 < iHeight &&
                    x_3 + c1 > 0 && x_3 + c1 < iWidth && y_3 + c2 > 0 && y_3 + c2 < iHeight);
        }
        return false;
    }

    public void setX(int x) {
        points.setX(x);
    }

    public void setY(int y) {
        points.setY(y);
    }

    public int gettX() {
        return points.getX();
    }

    public int gettY() {
        return points.getY();
    }
}
