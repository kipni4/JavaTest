package Usloviya;

import java.util.Scanner;

/**
 Выбираем максимальное значение из 3-ёх
 */
public class MaxZnach3
{
    public static void main (String[]args)
    {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        if (a==b&&b==c)
            System.out.println("Все числа равны");
        else if (a==b&&a>c)
            System.out.println("Первое и втрое число одинаковые и максимальные " +a);
         else if (a==c&&a>b)
            System.out.println("Первое и третье число одинаковые и максимальные " +a);
          else if(b==c&&b>a)
            System.out.println("Второе и третье число одинаковые и максимальные " +b);
            else if (a>b&a>c)
            System.out.println("Первое число максимальное " +a);
            else if (b>c)
            System.out.println("Второе число максимально " +b);
             else System.out.println("Третье число максимальное " +c);
        }
}