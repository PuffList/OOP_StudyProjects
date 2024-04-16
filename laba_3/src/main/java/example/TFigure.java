package example;

import javax.swing.*;

import lombok.NoArgsConstructor;

@NoArgsConstructor
abstract class TFigure extends JPanel {
    private Point points = new Point();
    abstract void Show(boolean VISION);
    abstract void moveTo(int x, int y);

    public TFigure(int x, int y) {
        setLayout(null);
        setOpaque(false);
        points.setX(x);
        points.setY(y);
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
