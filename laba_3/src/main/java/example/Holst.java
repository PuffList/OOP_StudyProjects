package example;

import example.circles.Ellipse;
import example.quadrangle.Rectangle;
import example.quadrangle.Romb;
import example.quadrangle.Trapeze;

import javax.swing.*;
import java.awt.*;

public class Holst {

    private final JFrame h = new JFrame("ЛБ_1");

    private final JButton but0 = new JButton("Назад");
    private final JButton but1 = new JButton("Окружности");
    private final JButton but1_2 = new JButton("Четырёхугольники");
    private final JButton but2 = new JButton("Окружность");
    private final JButton but3 = new JButton("Прямоугольник");
    private final JButton but3_2 = new JButton("Ромб");
    private final JButton but3_3 = new JButton("Трапеция");
    private final JButton but3_4 = new JButton("Четырёхугольник");
    private final JButton but4 = new JButton("Элипс");
    private final JButton but5 = new JButton("Создать");
    private final JButton but6 = new JButton("Переместить");
    private final JButton but7 = new JButton("Удалить");
    private final JButton but8 = new JButton("Изменить размер");
    private final JButton but9 = new JButton("Массив");
    private final JButton but50 = new JButton("Повернуть на 90");

    private final JPanel nP = northPanel();
    private final JPanel cP = centrePanel();
    private JPanel ellipse = null;
    private JPanel circle = null;
    private JPanel rectangle = null;
    private JPanel romb = null;
    private JPanel quadrangle = null;
    private JPanel trapeze = null;
    private Ellipse[] ellipses = null;
    private TQuadrangle[] quadrangles = null;
    private TCircle[] circles = null;
    private Rectangle[] rectangles = null;
    private Romb[] rombs = null;
    private Trapeze[] trapezes = null;

    private int numbut, numbut2, c1, c2, c3, c4, c5, c6, c7, c8;
    private boolean VISION = false;

    public Holst() {
        h.setLayout(new BorderLayout());
        h.setSize(1920, 1000);
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
        p.add(but1_2);
        //"Назад"
        but0.addActionListener(e -> {

            if (numbut2 == 1) {
                nP.removeAll();
                nP.add(but1);
                nP.add(but1_2);
                numbut2 = 0;
            }

            if (numbut2 == 2) {
                nP.removeAll();
                nP.add(but0);
                nP.add(but2);
                nP.add(but4);
                numbut2 = 1;

            }
            if (numbut2 == 3) {
                nP.removeAll();
                nP.add(but0);
                nP.add(but3);
                nP.add(but3_2);
                nP.add(but3_3);
                nP.add(but3_4);
                numbut2 = 1;
            }

            if (numbut == 10 || numbut == 11 || numbut == 12 || numbut == 13 || numbut == 14 || numbut == 15) {

                if (numbut == 10) { numbut = 2;}
                if (numbut == 11) { numbut = 1;}
                if (numbut == 12) { numbut = 3;}
                if (numbut == 13) { numbut = 4;}
                if (numbut == 14) { numbut = 5;}
                if (numbut == 15) { numbut = 6;}
            }

            nP.repaint();
            nP.revalidate();
        });
        //"Окружности"
        but1.addActionListener(e -> {
            nP.removeAll();
            nP.add(but0);
            nP.add(but2);
            nP.add(but4);
            numbut2 = 1;
            nP.revalidate();
            nP.repaint();
        });
        //"Четырёхугольники"
        but1_2.addActionListener(e -> {
            nP.removeAll();
            nP.add(but0);
            nP.add(but3);
            nP.add(but3_2);
            nP.add(but3_3);
            nP.add(but3_4);
            numbut2 = 1;
            nP.revalidate();
            nP.repaint();
        });
        //"Кружок"
        but2.addActionListener(e -> {
            numbut = 1;
            numbut2 = 2;
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
        //"Элипс"
        but4.addActionListener(e -> {
            numbut = 2;
            numbut2 = 2;
            nP.removeAll();
            nP.add(but0);
            nP.add(but5);
            nP.add(but6);
            nP.add(but8);
            nP.add(but9);
            nP.add(but7);
            nP.add(but50);
            nP.revalidate();
            nP.repaint();
        });
        //"Прямоугольник"
        but3.addActionListener(e -> {
            numbut = 3;
            numbut2 = 3;
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
        //"Ромб"
        but3_2.addActionListener(e -> {
            numbut = 4;
            numbut2 = 3;
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
        //"Трапеция"
        but3_3.addActionListener(e -> {
            numbut = 5;
            numbut2 = 3;
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
        //"Четырёхугольник"
        but3_4.addActionListener(e -> {
            numbut = 6;
            numbut2 = 3;
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

        //"Создать"
        but5.addActionListener(e -> {
            c1 = (int) (Math.random() * 320 );
            c2 = (int) (Math.random() * 320 );
            c3 = (int) (Math.random() * 320);
            c4 = (int) (Math.random() * 320);
            c5 = (int) (Math.random() * 320);
            c6 = (int) (Math.random() * 320);
            c7 = (int) (Math.random() * 320);
            c8 = (int) (Math.random() * 320);

            if (numbut == 2) {
                if (ellipse == null) {
                    VISION = true;
                    while (true) {
                        c1 = (int) (Math.random() * 320);
                        if (c1 >= 200 & c1 <= 1160){
                            break;
                        }
                    }
                    while (true) {
                        c2 = (int) (Math.random() * 320);
                        if (c2 >= 200 & c2 <= 580){
                            break;
                        }
                    }
                    c3 = (int) (Math.random() * 100);
                    c4 = (int) (Math.random() * 100);
                    ellipse = new Ellipse(c1, c2, c3, c4, Color.MAGENTA);
                    ((Ellipse) ellipse).Show(VISION);
                    cP.add(ellipse, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Элипс уже нарисован");
                }
            }

            else if (numbut == 1) {
                if (circle == null) {
                    VISION = true;

                    while (true) {
                        c1 = (int) (Math.random() * 320);
                        if (c1 >= 200 & c1 <= 1160){
                            break;
                        }
                    }
                    while (true) {
                        c2 = (int) (Math.random() * 320);
                        if (c2 >= 200 & c2 <= 580){
                            break;
                        }
                    }
                    c3 = (int) (Math.random() * 100);

                    circle = new TCircle(c1, c2, c3, Color.BLUE);
                    ((TCircle) circle).Show(VISION);
                    cP.add(circle, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Круг уже нарисован");
                }
            }

            else if (numbut == 3) {
                if (rectangle == null) {
                    VISION = true;
                    while (true) {
                        c1 = (int) (Math.random() * 320);
                        if (c1 >= 200 & c1 <= 1160){
                            break;
                        }
                    }
                    while (true) {
                        c2 = (int) (Math.random() * 320);
                        if (c2 >= 200 & c2 <= 580){
                            break;
                        }
                    }
                    rectangle = new Rectangle(c1, c2, c3, c4, Color.ORANGE);
                    ((Rectangle) rectangle).Show(VISION);
                    cP.add(rectangle, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Прямоугольник уже нарисован");
                }
            }

            else if (numbut == 4) {
                if (romb == null) {
                    VISION = true;

                    while (true) {
                        c1 = (int) (Math.random() * 320);
                        if (c1 >= 200 & c1 <= 1160){
                            break;
                        }
                    }
                    while (true) {
                        c2 = (int) (Math.random() * 320);
                        if (c2 >= 200 & c2 <= 580){
                            break;
                        }
                    }
                    romb = new Romb(c1, c2, c3, c4, Color.GREEN);
                    ((Romb) romb).Show(VISION);
                    cP.add(romb, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Ромб уже нарисован");
                }
            }

            else if (numbut == 5) {
                if (trapeze == null) {
                    VISION = true;

                    while (true) {
                        c1 = (int) (Math.random() * 320);
                        if (c1 >= 200 & c1 <= 1160){
                            break;
                        }
                    }
                    while (true) {
                        c2 = (int) (Math.random() * 320);
                        if (c2 >= 200 & c2 <= 580){
                            break;
                        }
                    }
                    c3 = 100 + (int) (Math.random() * 200);
                    c4 = 100 + (int) (Math.random() * 200);
                    c5 = 10 + (int) (Math.random() * 50);
                    trapeze = new Trapeze(c1, c2, c3, c4, c5, Color.GREEN);
                    ((Trapeze) trapeze).Show(VISION);
                    cP.add(trapeze, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Трапеция уже нарисована");
                }
            }

            else if (numbut == 6) {
                if (quadrangle == null) {
                    VISION = true;

                    while (true) {
                        c1 = (int) (Math.random() * 320);
                        if (c1 >= 200 & c1 <= 1160){
                            break;
                        }
                    }
                    while (true) {
                        c2 = (int) (Math.random() * 320);
                        if (c2 >= 200 & c2 <= 580){
                            break;
                        }
                    }
                    quadrangle = new TQuadrangle(c1, c2, c3, c4, c5, c6, c7, c8, Color.GREEN);
                    ((TQuadrangle) quadrangle).Show(VISION);
                    cP.add(quadrangle, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Четырёхугольник уже нарисован");
                }
            }

            else if (numbut == 10) {
                if (ellipses == null) {
                    VISION = true;
                    ellipses = new Ellipse[5];
                    for (int i = 0; i < 5; i++) {
                        while (true) {
                            c1 = (int) (Math.random() * 320);
                            if (c1 >= 200 & c1 <= 1160){
                                break;
                            }
                        }
                        while (true) {
                            c2 = (int) (Math.random() * 320);
                            if (c2 >= 200 & c2 <= 580){
                                break;
                            }
                        }
                        c3 = (int) (Math.random() * 100);
                        c4 = (int) (Math.random() * 100);
                        ellipses[i] = new Ellipse(c1, c2, c3, c4, Color.MAGENTA);
                        ellipses[i].Show(VISION);
                        cP.add(ellipses[i], BorderLayout.CENTER);
                        cP.validate();
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Элипсы уже нарисованы");
                }
            }

            else if (numbut == 11) {
                if (circles == null) {
                    VISION = true;
                    circles = new TCircle[5];
                    for (int i = 0; i < 5; i++) {

                        while (true) {
                            c1 = (int) (Math.random() * 320);
                            if (c1 >= 200 & c1 <= 1160){
                                break;
                            }
                        }
                        while (true) {
                            c2 = (int) (Math.random() * 320);
                            if (c2 >= 200 & c2 <= 580){
                                break;
                            }
                        }
                        c3 = (int) (Math.random() * 100);

                        circles[i] = new TCircle(c1, c2, c3, Color.BLUE);
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
                        while (true) {
                            c1 = (int) (Math.random() * 320);
                            if (c1 >= 200 & c1 <= 1160){
                                break;
                            }
                        }
                        while (true) {
                            c2 = (int) (Math.random() * 320);
                            if (c2 >= 200 & c2 <= 580){
                                break;
                            }
                        }
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
                if (rombs == null) {
                    VISION = true;
                    rombs = new Romb[5];
                    for (int i = 0; i < 5; i++) {

                        while (true) {
                            c1 = (int) (Math.random() * 320);
                            if (c1 >= 200 & c1 <= 1160){
                                break;
                            }
                        }
                        while (true) {
                            c2 = (int) (Math.random() * 320);
                            if (c2 >= 200 & c2 <= 580){
                                break;
                            }
                        }
                        rombs[i] = new Romb(c1, c2, c3, c4, Color.GREEN);
                        rombs[i].Show(VISION);
                        cP.add(rombs[i], BorderLayout.CENTER);
                        cP.validate();
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Ромбы уже нарисованы");
                }
            }

            else if (numbut == 14) {
                if (trapezes == null) {
                    VISION = true;
                    trapezes = new Trapeze[5];
                    for (int i = 0; i < 5; i++) {

                        while (true) {
                            c1 = (int) (Math.random() * 320);
                            if (c1 >= 200 & c1 <= 1160){
                                break;
                            }
                        }
                        while (true) {
                            c2 = (int) (Math.random() * 320);
                            if (c2 >= 200 & c2 <= 580){
                                break;
                            }
                        }
                        c5 = 10 + (int) (Math.random() * 50);
                        trapezes[i] = new Trapeze(c1, c2, c3, c4, c5, Color.GREEN);
                        trapezes[i].Show(VISION);
                        cP.add(trapezes[i], BorderLayout.CENTER);
                        cP.validate();
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Трапеции уже нарисованы");
                }
            }

            else if (numbut == 15) {
                if (quadrangles == null) {
                    VISION = true;
                    quadrangles = new TQuadrangle[5];
                    for (int i = 0; i < 5; i++) {

                        while (true) {
                            c1 = (int) (Math.random() * 320);
                            if (c1 >= 200 & c1 <= 1160){
                                break;
                            }
                        }
                        while (true) {
                            c2 = (int) (Math.random() * 320);
                            if (c2 >= 200 & c2 <= 580){
                                break;
                            }
                        }
                        quadrangles[i] = new TQuadrangle(c1, c2, c3, c4, c5, c6, c7, c8, Color.GREEN);
                        quadrangles[i].Show(VISION);
                        cP.add(quadrangles[i], BorderLayout.CENTER);
                        cP.validate();
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Четырёхугольники уже нарисованы");
                }
            }

            c1 = c2 = c3 = c4 = c5 = c6 = c7 = c8 = 0;
        });

        //"Перемещение"
        but6.addActionListener(e -> {
            c1 = -40 + (int) (Math.random() * 100);
            c2 = -40 + (int) (Math.random() * 100);

            if (numbut == 2) {
                if (ellipse != null) {

                    ((Ellipse) ellipse).moveTo(c1, c2);
                    ((Ellipse) ellipse).Show(VISION);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Элипс не создан");
                }
            }

            else if (numbut == 1) {
                if (circle != null) {
                    ((TCircle) circle).moveTo(c1, c2);
                    ((TCircle) circle).Show(VISION);
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
                if (romb != null) {
                    ((Romb) romb).moveTo(c1, c2);
                    ((Romb) romb).Show(VISION);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Ромб не создано");
                }
            }

            else if (numbut == 5) {
                if (trapeze != null) {
                    ((Trapeze) trapeze).moveTo(c1, c2);
                    ((Trapeze) trapeze).Show(VISION);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Трапеция не создано");
                }
            }

            else if (numbut == 6) {
                if (quadrangle != null) {
                    ((TQuadrangle) quadrangle).moveTo(c1, c2);
                    ((TQuadrangle) quadrangle).Show(VISION);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Четырёхугольник не создано");
                }
            }

            else if (numbut == 10) {
                if (ellipses != null) {
                    for (int i = 0; i < 5; i++) {
                        ellipses[i].moveTo(c1, c2);
                        ellipses[i].Show(VISION);
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив элипсов не создан");
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
                if (rombs != null) {
                    for (int i = 0; i < 5; i++) {
                        rombs[i].moveTo(c1, c2);
                        rombs[i].Show(VISION);
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив ромбов не создан ");
                }
            }

            else if (numbut == 14) {
                if (trapezes != null) {
                    for (int i = 0; i < 5; i++) {
                        trapezes[i].moveTo(c1, c2);
                        trapezes[i].Show(VISION);
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив трапеций не создан ");
                }
            }

            else if (numbut == 15) {
                if (quadrangles != null) {
                    for (int i = 0; i < 5; i++) {
                        quadrangles[i].moveTo(c1, c2);
                        quadrangles[i].Show(VISION);
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив четырёхугольников не создан ");
                }
            }

            c1 = c2 = 0;
        });
        //"Удаление"
        but7.addActionListener(e -> {

            if (numbut == 2) {
                if (ellipse != null) {
                    cP.remove(ellipse);
                    ((Ellipse) ellipse).Show(false);
                    ellipse = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Элипс не найдена");
                }
            }

            else if (numbut == 1) {
                if (circle != null) {
                    cP.remove(circle);
                    ((TCircle) circle).Show(false);
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
                if (romb != null) {
                    cP.remove(romb);
                    ((Romb) romb).Show(false);
                    romb = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Ромб не найдено");
                }
            }

            else if (numbut == 5) {
                if (trapeze != null) {
                    cP.remove(trapeze);
                    ((Trapeze) trapeze).Show(false);
                    trapeze = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Трапеция не найдено");
                }
            }

            else if (numbut == 6) {
                if (quadrangle != null) {
                    cP.remove(quadrangle);
                    ((TQuadrangle) quadrangle).Show(false);
                    quadrangle = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "четырёхугольник не найден");
                }
            }


            else if (numbut == 10) {
                if (ellipses != null) {

                    for (int i = 0; i < 5; i++){
                        cP.remove(ellipses[i]);
                        ellipses[i].Show(false);
                    }

                    ellipses = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив элиgсов не найден");
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
                if (rombs != null) {

                    for (int i = 0; i < 5; i++){
                        cP.remove(rombs[i]);
                        rombs[i].Show(false);
                    }

                    rombs = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив ромбов не найден");
                }
            }

            else if (numbut == 14) {
                if (trapezes != null) {

                    for (int i = 0; i < 5; i++){
                        cP.remove(trapezes[i]);
                        trapezes[i].Show(false);
                    }

                    trapezes = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив трапеций не найден");
                }
            }

            else if (numbut == 15) {
                if (quadrangles != null) {

                    for (int i = 0; i < 5; i++){
                        cP.remove(quadrangles[i]);
                        quadrangles[i].Show(false);
                    }

                    quadrangles = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив трапеций не найден");
                }
            }
        });

        but8.addActionListener(e -> {
            c1 = -15 + (int) (Math.random() * 40);
            c2 = -15 + (int) (Math.random() * 40);

            if (numbut == 2) {
                c1 = 50 + (int) (Math.random() * 100);
                if (ellipse != null) {
                    ((Ellipse) ellipse).changeSize(c1);
                    ((Ellipse) ellipse).Show(VISION);
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Элипс не найдена");
                }
            }

            else if (numbut == 1) {
                c1 = 50 + (int) (Math.random() * 50);
                if (circle != null) {
                    ((TCircle) circle).changeSize(c1);
                    ((TCircle) circle).Show(VISION);
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

                if (romb != null) {
                    ((Romb) romb).changeSize(c1,c2);
                    ((Romb) romb).Show(VISION);
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Ромб не найден");
                }
            }

            else if (numbut == 5) {

                if (trapeze != null) {
                    ((Trapeze) trapeze).changeSize(c1,c2);
                    ((Trapeze) trapeze).Show(VISION);
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Трапеция не найден");
                }
            }

            else if (numbut == 6) {

                if (quadrangle != null) {
                    ((TQuadrangle) quadrangle).changeSize(c1,c2);
                    ((TQuadrangle) quadrangle).Show(VISION);
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Четырёхугольник не найден");
                }
            }

            else if (numbut == 10) {
                c1 = 50 + (int) (Math.random() * 100);

                if (ellipses != null) {

                    for (int i = 0; i < 5; i++){
                        ellipses[i].changeSize(c1);
                        ellipses[i].Show(VISION);
                    }

                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив элипсов не найден");
                }
            }

            else if (numbut == 11) {
                c1 = 50 + (int) (Math.random() * 50);

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

                if (rombs != null) {

                    for (int i = 0; i < 5; i++){
                        rombs[i].changeSize(c1, c2);
                        rombs[i].Show(VISION);
                    }

                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив ромбов не найден");
                }
            }

            else if (numbut == 14) {

                if (trapezes != null) {

                    for (int i = 0; i < 5; i++){
                        trapezes[i].changeSize(c1, c2);
                        trapezes[i].Show(VISION);
                    }

                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив трапеций не найден");
                }
            }

            else if (numbut == 15) {

                if (quadrangles != null) {

                    for (int i = 0; i < 5; i++){
                        quadrangles[i].changeSize(c1, c2);
                        quadrangles[i].Show(VISION);
                    }

                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив четырёхугольников не найден");
                }
            }

            c1 = c2 = 0;
        });
        //"Поворот"
        but50.addActionListener(e -> {
            if(numbut == 2) {
                if (ellipse  != null) {
                    ((Ellipse) ellipse ).turn();
                    ((Ellipse) ellipse ).Show(VISION);
                    cP.add(ellipse , BorderLayout.CENTER);
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(h, "Эллипс не найден");
                }
            }

            else if (numbut == 10) {
                if (ellipses != null) {

                    for (int i = 0; i < 5; i++){
                        ellipses[i].turn();
                        ellipses[i].Show(VISION);
                    }

                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(h, "Массив элипсов не найден");
                }
            }

        });

        but9.addActionListener(e -> {
            nP.removeAll();
            nP.add(but0);
            nP.add(but5);
            nP.add(but6);
            nP.add(but7);
            nP.add(but8);

            if (numbut == 2) {
                numbut = 10;
                nP.add(but50);
                JOptionPane.showMessageDialog(h, "Дальнейшие действия будут выполнены для нескольких элипсов");
            }

            if (numbut == 1) {
                numbut = 11;
                JOptionPane.showMessageDialog(h, "Дальнейшие действия будут выполнены для нескольких кругов");
            }

            if (numbut == 3) {
                numbut = 12;
                JOptionPane.showMessageDialog(h, "Дальнейшие действия будут выполнены для нескольких прямоугольников");
            }

            if (numbut == 4) {
                numbut = 13;
                JOptionPane.showMessageDialog(h, "Дальнейшие действия будут выполнены для нескольких ромбов");
            }

            if (numbut == 5) {
                numbut = 14;
                JOptionPane.showMessageDialog(h, "Дальнейшие действия будут выполнены для нескольких трапеций");
            }

            if (numbut == 6) {
                numbut = 15;
                JOptionPane.showMessageDialog(h, "Дальнейшие действия будут выполнены для нескольких четырёхугольников");
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
