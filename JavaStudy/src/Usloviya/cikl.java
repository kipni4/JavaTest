package Usloviya;

import java.util.Scanner;

/**
Расчёт площади фигуры выбирая её через switch
*/
public class cikl {
    public static void main(String[] args) {
        int a, b, c, r, x;
        double s, p, skr;
        System.out.println("Выбирите фигуру площадь которой надо расчитать");
        System.out.println("[1] Треугольник");
        System.out.println("[2] Круг");
        System.out.println("[3] Прямоугольник");
        x = new Scanner(System.in).nextInt();
        switch (x) {
            case 1:
                System.out.println("Введите стороны треугольника");
                a = new Scanner(System.in).nextInt();
                b = new Scanner(System.in).nextInt();
                c = new Scanner(System.in).nextInt();
                p = (a + b + c) / 2;
                s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                //округление до 3-ёх знаков

                s = s*100;
                skr= Math.round(s);
                s=skr/100;
                System.out.println("Площадь треугольника " +s+ " см^2");
                break;
            case 2:
                System.out.println("Введите радиус круга");
                r= new Scanner(System.in).nextInt();
                s= Math.PI*r*r;
                s = s*1000;
                skr= Math.round(s);
                s=skr/1000;
                System.out.println("Площадь круга " +s+ " см^2");
                break;
            case 3:
                System.out.println("Введите стороны прямоугольника");
                a = new Scanner(System.in).nextInt();
                b = new Scanner(System.in).nextInt();
                s= a*b;
                System.out.println("Площадь прямоугольника равна " +s+ " см^2");
                break;
            default :
                System.out.println("Oшибка");
                break;
        }
    }
}

