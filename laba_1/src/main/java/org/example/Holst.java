package org.example;

import javax.swing.*;
import java.awt.*;

public class Holst {

    private final JFrame h = new JFrame("ЛБ_1");

    private final JButton but0 = new JButton("Назад");
    private final JButton but1 = new JButton("Линия");
    private final JButton but2 = new JButton("Окружность");
    private final JButton but3 = new JButton("Прямоугольник");
    private final JButton but4 = new JButton("Треугольник");
    private final JButton but5 = new JButton("Создать");
    private final JButton but6 = new JButton("Переместить");
    private final JButton but7 = new JButton("Удалить");
    private final JButton but8 = new JButton("Изменить размер");
    private final JButton but9 = new JButton("Массив");

    private final JPanel nP = northPanel();
    private final JPanel cP = centrePanel();
    private JPanel line = null;
    private JPanel circle = null;
    private JPanel rectangle = null;
    private JPanel triangle = null;
    private Line[] lines = null;
    private Circle[] circles = null;
    private Rectangle[] rectangles = null;
    private Triangle[] triangles = null;

    private int numbut, c1, c2, c3, c4, c5, c6;
    private boolean VISION = false;

    public Holst() {
        h.setLayout(new BorderLayout());
        h.setSize(1260, 680);
        h.add(nP, BorderLayout.NORTH);
        h.add(cP, BorderLayout.CENTER);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        h.setVisible(true);
    }

    public JPanel northPanel() {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        p.setBackground(Color.DARK_GRAY);
        p.add(but1);
        p.add(but2);
        p.add(but3);
        p.add(but4);

        but0.addActionListener(e -> {

            if (numbut == 1 || numbut == 2 || numbut == 3 || numbut == 4) {
                nP.removeAll();
                nP.add(but1);
                nP.add(but2);
                nP.add(but3);
                nP.add(but4);
            }

            if (numbut == 10 || numbut == 11 || numbut == 12 || numbut == 13) {

                if (numbut == 10) { numbut = 1;}
                if (numbut == 11) { numbut = 2;}
                if (numbut == 12) { numbut = 3;}
                if (numbut == 13) { numbut = 4;}
                nP.add(but9);
            }

            nP.repaint();
            nP.revalidate();
        });

        but1.addActionListener(e -> {
            numbut = 1;
            nP.removeAll();
            nP.add(but0);
            nP.add(but5);
            nP.add(but6);
            nP.add(but8);
            nP.add(but9);
            nP.add(but7);
            nP.revalidate();
            nP.repaint();
        });

        but2.addActionListener(e -> {
            numbut = 2;
            nP.removeAll();
            nP.add(but0);
            nP.add(but5);
            nP.add(but6);
            nP.add(but8);
            nP.add(but9);
            nP.add(but7);
            nP.revalidate();
            nP.repaint();
        });

        but3.addActionListener(e -> {
            numbut = 3;
            nP.removeAll();
            nP.add(but0);
            nP.add(but5);
            nP.add(but6);
            nP.add(but8);
            nP.add(but9);
            nP.add(but7);
            nP.revalidate();
            nP.repaint();
        });

        but4.addActionListener(e -> {
            numbut = 4;
            nP.removeAll();
            nP.add(but0);
            nP.add(but5);
            nP.add(but6);
            nP.add(but8);
            nP.add(but9);
            nP.add(but7);
            nP.revalidate();
            nP.repaint();
        });

        but5.addActionListener(e -> {
            c1 = (int) (Math.random() * 320);
            c2 = (int) (Math.random() * 320);
            c3 = (int) (Math.random() * 320);
            c4 = (int) (Math.random() * 320);
            c5 = (int) (Math.random() * 320);
            c6 = (int) (Math.random() * 320);

            if (numbut == 1) {
                if (line == null) {
                    VISION = true;
                    line = new Line(c1, c2, c3, c4, Color.MAGENTA);
                    ((Line) line).Show(VISION);
                    cP.add(line, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Линия уже нарисована");
                }
            }

            else if (numbut == 2) {
                if (circle == null) {
                    VISION = true;
                    circle = new Circle(c1, c2, c3, Color.BLUE);
                    ((Circle) circle).Show(VISION);
                    cP.add(circle, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Круг уже нарисована");
                }
            }

            else if (numbut == 3) {
                if (rectangle == null) {
                    VISION = true;
                    rectangle = new Rectangle(c1, c2, c3, c4, Color.ORANGE);
                    ((Rectangle) rectangle).Show(VISION);
                    cP.add(rectangle, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Прямоугольник уже нарисована");
                }
            }

            else if (numbut == 4) {
                if (triangle == null) {
                    VISION = true;
                    triangle = new Triangle(c1, c2, c3, c4, c5, c6, Color.GREEN);
                    ((Triangle) triangle).Show(VISION);
                    cP.add(triangle, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Треугольник уже нарисована");
                }
            }

            else if (numbut == 10) {
                if (lines == null) {
                    VISION = true;
                    lines = new Line[5];
                    for (int i = 0; i < 5; i++) {
                        c1 = (int) (Math.random() * 320);
                        c2 = (int) (Math.random() * 320);
                        c3 = (int) (Math.random() * 320);
                        c4 = (int) (Math.random() * 320);
                        lines[i] = new Line(c1, c2, c3, c4, Color.MAGENTA);
                        lines[i].Show(VISION);
                        cP.add(lines[i], BorderLayout.CENTER);
                        cP.validate();
                        cP.repaint();
                    }
                        cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Линии уже нарисованы");
                }
            }

            else if (numbut == 11) {
                if (circles == null) {
                    VISION = true;
                    circles = new Circle[5];
                    for (int i = 0; i < 5; i++) {
                        c1 = (int) (Math.random() * 320);
                        c2 = (int) (Math.random() * 320);
                        c3 = (int) (Math.random() * 320);
                        circles[i] = new Circle(c1, c2, c3, Color.BLUE);
                        circles[i].Show(VISION);
                        cP.add(circles[i], BorderLayout.CENTER);
                        cP.validate();
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Круги уже нарисованы");
                }
            }

            else if (numbut == 12) {
                if (rectangles == null) {
                    VISION = true;
                    rectangles = new Rectangle[5];
                    for (int i = 0; i < 5; i++) {
                        c1 = (int) (Math.random() * 320);
                        c2 = (int) (Math.random() * 320);
                        c3 = (int) (Math.random() * 320);
                        c4 = (int) (Math.random() * 320);
                        rectangles[i] = new Rectangle(c1, c2, c3, c4, Color.ORANGE);
                        rectangles[i].Show(VISION);
                        cP.add(rectangles[i], BorderLayout.CENTER);
                        cP.validate();
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Прямоугольники уже нарисованы");
                }
            }

            else if (numbut == 13) {
                if (triangles == null) {
                    VISION = true;
                    triangles = new Triangle[5];
                    for (int i = 0; i < 5; i++) {
                        c1 = (int) (Math.random() * 320);
                        c2 = (int) (Math.random() * 320);
                        c3 = (int) (Math.random() * 320);
                        c4 = (int) (Math.random() * 320);
                        c5 = (int) (Math.random() * 320);
                        c6 = (int) (Math.random() * 320);
                        triangles[i] = new Triangle(c1, c2, c3, c4, c5, c6, Color.GREEN);
                        triangles[i].Show(VISION);
                        cP.add(triangles[i], BorderLayout.CENTER);
                        cP.validate();
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Треугольники уже нарисованы");
                }
            }

            c1 = c2 = c3 = c4 = c5 = c6 = 0;
        });

        but6.addActionListener(e -> {
            c1 = -40 + (int) (Math.random() * 100);
            c2 = -40 + (int) (Math.random() * 100);

            if (numbut == 1) {
                if (line != null) {
                    ((Line) line).moveTo(c1, c2);
                    ((Line) line).Show(VISION);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Линия не создана");
                }
            }

            else if (numbut == 2) {
                if (circle != null) {
                    ((Circle) circle).moveTo(c1, c2);
                    ((Circle) circle).Show(VISION);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Круг не создан");
                }
            }

            else if (numbut == 3) {
                if (rectangle != null) {
                    ((Rectangle) rectangle).moveTo(c1, c2);
                    ((Rectangle) rectangle).Show(VISION);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Прямоугольник не создан");
                }
            }

            else if (numbut == 4) {
                if (triangle != null) {
                    ((Triangle) triangle).moveTo(c1, c2);
                    ((Triangle) triangle).Show(VISION);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Треугольник не создан");
                }
            }

            else if (numbut == 10) {
                if (lines != null) {
                    for (int i = 0; i < 5; i++) {
                        lines[i].moveTo(c1, c2);
                        lines[i].Show(VISION);
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив линий не создан");
                }
            }

            else if (numbut == 11) {
                if (circles != null) {
                    for (int i = 0; i < 5; i++) {
                        circles[i].moveTo(c1, c2);
                        circles[i].Show(VISION);
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив кругов не создан");
                }
            }

            else if (numbut == 12) {
                if (rectangles != null) {
                    for (int i = 0; i < 5; i++) {
                        rectangles[i].moveTo(c1, c2);
                        rectangles[i].Show(VISION);
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив прямоугольников не создан");
                }
            }

            else if (numbut == 13) {
                if (triangles != null) {
                    for (int i = 0; i < 5; i++) {
                        triangles[i].moveTo(c1, c2);
                        triangles[i].Show(VISION);
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив треугольников не создан ");
                }
            }

            c1 = c2 = 0;
        });

        but7.addActionListener(e -> {

            if (numbut == 1) {
                if (line != null) {
                    cP.remove(line);
                    ((Line) line).Show(false);
                    line = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Линия не найдена");
                }
            }

            else if (numbut == 2) {
                if (circle != null) {
                    cP.remove(circle);
                    ((Circle) circle).Show(false);
                    circle = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Круг не найден");
                }
            }

            else if (numbut == 3) {
                if (rectangle != null) {
                    cP.remove(rectangle);
                    ((Rectangle) rectangle).Show(false);
                    rectangle = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Прямоугольник не найден");
                }
            }

            else if (numbut == 4) {
                if (triangle != null) {
                    cP.remove(triangle);
                    ((Triangle) triangle).Show(false);
                    triangle = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Треугольник не найден");
                }
            }

            else if (numbut == 10) {
                if (lines != null) {

                    for (int i = 0; i < 5; i++){
                        cP.remove(lines[i]);
                        lines[i].Show(false);
                    }

                    lines = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив линий не найден");
                }
            }

            else if (numbut == 11) {
                if (circles != null) {

                    for (int i = 0; i < 5; i++){
                        cP.remove(circles[i]);
                        circles[i].Show(false);
                    }

                    circles = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив кругов не найден");
                }
            }

            else if (numbut == 12) {
                if (rectangles != null) {

                    for (int i = 0; i < 5; i++){
                        cP.remove(rectangles[i]);
                        rectangles[i].Show(false);
                    }

                    rectangles = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив прямоугольников не найден");
                }
            }

            else if (numbut == 13) {
                if (triangles != null) {

                    for (int i = 0; i < 5; i++){
                        cP.remove(triangles[i]);
                        triangles[i].Show(false);
                    }

                    triangles = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив треугольников не найден");
                }
            }
        });

        but8.addActionListener(e -> {
            c1 = -15 + (int) (Math.random() * 40);
            c2 = -15 + (int) (Math.random() * 40);

            if (numbut == 1) {
                if (line != null) {
                    ((Line) line).changeSize(c1);
                    ((Line) line).Show(VISION);
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Линия не найдена");
                }
            }

            else if (numbut == 2) {
                c1 = 50 + (int) (Math.random() * 100);
                if (circle != null) {
                    ((Circle) circle).changeSize(c1);
                    ((Circle) circle).Show(VISION);
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Круг не найден");
                }
            }

            else if (numbut == 3) {
                if (rectangle != null) {
                    ((Rectangle) rectangle).changeSize(c1, c2);
                    ((Rectangle) rectangle).Show(VISION);
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Прямоугольник не найден");
                }
            }

            else if (numbut == 4) {
                if (triangle != null) {
                    ((Triangle) triangle).changeSize(c1, c2);
                    ((Triangle) triangle).Show(VISION);
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Треугольник не найден");
                }
            }

            else if (numbut == 10) {
                if (lines != null) {

                    for (int i = 0; i < 5; i++){
                        lines[i].changeSize(c1);
                        lines[i].Show(VISION);
                    }

                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив линий не найден");
                }
            }

            else if (numbut == 11) {
                c1 = 50 + (int) (Math.random() * 150);

                if (circles != null) {

                    for (int i = 0; i < 5; i++){
                        circles[i].changeSize(c1);
                        circles[i].Show(VISION);
                    }

                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив кругов не найден");
                }
            }

            else if (numbut == 12) {
                if (rectangles != null) {

                    for (int i = 0; i < 5; i++){
                        rectangles[i].changeSize(c1,c2);
                        rectangles[i].Show(VISION);
                    }

                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив прямоугольников не найден");
                }
            }

            else if (numbut == 13) {
                if (triangles != null) {

                    for (int i = 0; i < 5; i++){
                        triangles[i].changeSize(c1,c2);
                        triangles[i].Show(VISION);
                    }

                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив треугольников не найден");
                }
            }

            c1 = c2 = 0;
        });

        but9.addActionListener(e -> {
            nP.removeAll();
            nP.add(but0);
            nP.add(but5);
            nP.add(but6);
            nP.add(but7);
            nP.add(but8);

            if (numbut == 1) {
                numbut = 10;
                JOptionPane.showMessageDialog(h, "Дальнейшие действия будут выполнены для нескольких линий");
            }

            if (numbut == 2) {
                numbut = 11;
                JOptionPane.showMessageDialog(h, "Дальнейшие действия будут выполнены для нескольких кругов");
            }

            if (numbut == 3) {
                numbut = 12;
                JOptionPane.showMessageDialog(h, "Дальнейшие действия будут выполнены для нескольких прямоугольников");
            }

            if (numbut == 4) {
                numbut = 13;
                JOptionPane.showMessageDialog(h, "Дальнейшие действия будут выполнены для нескольких треугольников");
            }

            nP.revalidate();
            nP.repaint();
        });

        return p;
    }

    public JPanel centrePanel() {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.setBackground(Color.WHITE);
        return p;
    }

}
