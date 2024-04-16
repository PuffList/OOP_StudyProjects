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

class Item {
    private Item Next; // указатель на следующий элемент
    private TFigure Fig; // указатель адресуемой фигуры

    public Item (Item Next, TFigure Fig) {
        this.Next = Next;
        this.Fig = Fig;
    }

    public Item getNext ()  {
        return Next;
    }
    public TFigure getFig () {
        return Fig;
    }
}

public class ContList {

    private Item First; // указатель на первый элемент списка
    private int iList, c1,c2,c3,c4,c5,c6,c7,c8;
    private int number;
    private int counterList;

    public ContList() { // формирование пустого списка
        this.First = null;
    }

    public void operation(int operation) {
        if (operation == 1) {
            counterList += 15 + (Math.random() * 10);
            System.out.println("counterList = " + counterList);
            for (int i = 0; i < counterList; i++) {
                number = 1 + (int)(Math.random() * 6);
                this.Creator(number);
            }
        }
        else if (operation == 2) {
            c1 = -40 + (int) (Math.random() * 100);
            c2 = -40 + (int) (Math.random() * 100);
            Item Current = First;
            while (Current != null) {
                Current.getFig().moveTo(c1,c2);
                Current = Current.getNext( );
            }
        }

        else if (operation == 3){
            Item Current = First;
            while (Current != null) {
                Current.getFig().Show(true);
                Current = Current.getNext( );
            }
        }

        else if (operation == 4){
            iList = 0;
        }

        else if (operation == 5){
            iList = 0;
            First = null;
            counterList = 0;
            Item Current = First;
            while (Current != null) {
                Current = null;
                Current = Current.getNext( );
            }
        }

        else if (operation == 6){
            number = 1 + (int) (Math.random() * 6);
            this.Creator(number);
            counterList++;
        }
    }

    //добавление в начало списка
    public void Add(TFigure aFig) {
        First = new Item(First, aFig);
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
                if (c1 > 200 && c1 < 1000){
                    break;
                }
            }
            while (true) {
                c2 = (int) (Math.random() * 320);
                if (c2 > 200 && c2 < 1000){
                    break;
                }
            }
            c3 = (int) (Math.random() * 100);
            Add(new TCircle(c1, c2, c3, Color.BLACK)) ;
        }
        else  if (number == 2) {

            while (true) {
                c1 = (int) (Math.random() * 320);
                if (c1 > 200 && c1 < 1000){
                    break;
                }
            }
            while (true) {
                c2 = (int) (Math.random() * 320);
                if (c2 > 200 && c2 < 450){
                    break;
                }
            }
            c3 = (int) (Math.random() * 100);
            c4 = (int) (Math.random() * 100);
            Add(new Ellipse(c1, c2, c3, c4, Color.RED));
        }
        else  if (number == 3) {

            while (true) {
                c1 = (int) (Math.random() * 320);
                if (c1 > 200 && c1 <= 1160){
                    break;
                }
            }
            while (true) {
                c2 = (int) (Math.random() * 320);
                if (c2 > 200 && c2 <= 580){
                    break;
                }
            }
            Add(new TQuadrangle(c1, c2, c3, c4, c5, c6,c7,c8, Color.BLACK));
        }
        else  if (number == 4) {

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
            Add(new Rectangle(c1, c2, c3, c4, Color.BLUE));
        }
        else if (number == 5) {

            while (true) {
                c1 = (int) (Math.random() * 320);
                if (c1 >= 200 && c1 <= 1000){
                    break;
                }
            }
            while (true) {
                c2 = (int) (Math.random() * 320);
                if (c2 > 200 && c2 < 450){
                    break;
                }
            }
            Add(new Romb(c1, c2, c3, c4, Color.CYAN));
        }
        else  if (number == 6) {

            while (true) {
                c1 = (int) (Math.random() * 320);
                if (c1 >= 200 && c1 <= 1000){
                    break;
                }
            }
            while (true) {
                c2 = (int) (Math.random() * 320);
                if (c2 > 100 && c2 < 250){
                    break;
                }
            }
            c3 = (int) (Math.random() * 150);
            c4 = (int) (Math.random() * 150);
            c5 = 10 + (int) (Math.random() * 50);
            Add(new Trapeze(c1, c2, c3, c4, c5, Color.GREEN));
        }
    }

    private Item Iterator(int i) {

        if (i <= counterList) {
            Item a = First;
            for (int j = 0; j < i; j++) {
                a = a.getNext();
            }
            return a;
        }
        else {
            return null;
        }
    }

    JPanel getFigureFromContList(int i) {
        Item a = Iterator(i);
        return a.getFig();
    }

    int getCount() { return this.counterList; }

    int getIList() { return this.iList; }

    void setIList(int iList) { this.iList = iList;}
}
