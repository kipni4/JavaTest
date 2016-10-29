package Exse01;

/**
считаем площадь круга
 */

import java.util.Scanner;
public class FourthClass
{
    public static void main(String[] args)
    {
        System.out.println("Какой радиус круга?");
        Scanner sckr = new Scanner(System.in);
        double x;
        x = sckr.nextDouble();
        double skr = squarekr(x);
        System.out.println("Площадь круга = " + Math.round(skr) +"см^2");
    }

    public static double squarekr(double x1)

    {
        double skr1 = Math.PI*x1*x1;
        return skr1;
    }
}