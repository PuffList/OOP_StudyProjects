package example;


/* number
 1 -> Окружность      2 -> Эллипс   3 -> Четырехугольник
 4 -> Прямоугольник   5 -> Ромб     6 -> Трапециия

 operation
 1 -> Создать    2 -> Переместить   3 -> Показать
 4 -> Стереть    5 -> Уничтожить    6 -> Добавить */

import example.circles.Ellipse;
import example.quadrangle.Rectangle;
import example.quadrangle.Romb;
import example.quadrangle.Trapeze;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ContMassive {

    private List<TFigure> Figure = new ArrayList();;
    private int iMass, c1,c2,c3,c4,c5,c6,c7,c8;
    private int number;
    private int counterMassive;

    public void operation(int operation){

        if (operation == 1) {
            counterMassive += 15 + (int) (Math.random()*10);
            System.out.println("counterMassive = " + counterMassive);
            for (int i = 0; i < counterMassive; i++ ) {
                number = 1 + (int) (Math.random() * 6);
                this.Creator(number);
            }
        }

        else if (operation == 2){
            c1 = -30 + (int) (Math.random() * 100);
            c2 = -30 + (int) (Math.random() * 100);
            for (int i = 0; i < iMass; i++) {
                Figure.get(i).moveTo(c1, c2);
            }
        }

        else if (operation == 3){
            for (iMass = 0; iMass < counterMassive; iMass++) {
                Figure.get(iMass).Show(true);
            }
        }

        else if (operation == 4){
            iMass = 0;
        }

        else if (operation == 5){
            iMass = 0;
            Figure = null;
            counterMassive = 0;
        }

        else if (operation == 6){
            number = 1 + (int) (Math.random() * 6);
            this.Creator(number);
            counterMassive++;
        }
    }


    private void Creator(int number) {

        c3 = (int) (Math.random() * 320);
        c4 = (int) (Math.random() * 320);
        c5 = (int) (Math.random() * 320);
        c6 = (int) (Math.random() * 320);
        c7 = (int) (Math.random() * 320);
        c8 = (int) (Math.random() * 320);

        if (number == 1) {

            while (true) {
                c1 = (int) (Math.random() * 320);
                if (c1 > 200 && c1 < 1000) {
                    break;
                }
            }
            while (true) {
                c2 = (int) (Math.random() * 320);
                if (c2 > 200 && c2 < 1000) {
                    break;
                }
            }
            c3 = (int) (Math.random() * 100);
            Figure.add(new TCircle(c1, c2, c3, Color.BLACK));
        } else if (number == 2) {

            while (true) {
                c1 = (int) (Math.random() * 320);
                if (c1 > 200 && c1 < 1000) {
                    break;
                }
            }
            while (true) {
                c2 = (int) (Math.random() * 320);
                if (c2 > 200 && c2 < 450) {
                    break;
                }
            }
            c3 = (int) (Math.random() * 100);
            c4 = (int) (Math.random() * 100);
            Figure.add(new Ellipse(c1, c2, c3, c4, Color.RED));
        } else if (number == 3) {

            while (true) {
                c1 = (int) (Math.random() * 320);
                if (c1 > 200 && c1 <= 1160) {
                    break;
                }
            }
            while (true) {
                c2 = (int) (Math.random() * 320);
                if (c2 > 200 && c2 <= 580) {
                    break;
                }
            }
            Figure.add(new TQuadrangle(c1, c2, c3, c4, c5, c6, c7, c8, Color.BLACK));
        } else if (number == 4) {

            while (true) {
                c1 = (int) (Math.random() * 320);
                if (c1 >= 200 && c1 <= 1000) {
                    break;
                }
            }
            while (true) {
                c2 = (int) (Math.random() * 320);
                if (c2 > 100 && c2 < 250) {
                    break;
                }
            }
            c3 = (int) (Math.random() * 150);
            c4 = (int) (Math.random() * 150);
            Figure.add(new Rectangle(c1, c2, c3, c4, Color.BLUE));
        } else if (number == 5) {

            while (true) {
                c1 = (int) (Math.random() * 320);
                if (c1 >= 200 && c1 <= 1000) {
                    break;
                }
            }
            while (true) {
                c2 = (int) (Math.random() * 320);
                if (c2 > 200 && c2 < 450) {
                    break;
                }
            }
            Figure.add(new Romb(c1, c2, c3, c4, Color.CYAN));
        } else if (number == 6) {

            while (true) {
                c1 = (int) (Math.random() * 320);
                if (c1 >= 200 && c1 <= 1000) {
                    break;
                }
            }
            while (true) {
                c2 = (int) (Math.random() * 320);
                if (c2 > 100 && c2 < 250) {
                    break;
                }
            }
            c3 = (int) (Math.random() * 150);
            c4 = (int) (Math.random() * 150);
            c5 = 10 + (int) (Math.random() * 50);
            Figure.add(new Trapeze(c1, c2, c3, c4, c5, Color.GREEN));
        }
    }

    int getCount() { return this.counterMassive; }

    int getIMass() { return this.iMass; }

    void setIMass(int iMass) { this.iMass = iMass;}

    JPanel getFigureFromContMass(int iMass) { return Figure.get(iMass); }

}
