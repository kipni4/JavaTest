package Usloviya;

import java.util.Scanner;

/**
 Выбираем максимальное значение из 2-ух.
 */
public class MaxZnach2
{
    public static void main (String[]args)
    {
        int a,b;
        Scanner ab = new Scanner(System.in);
        a=ab.nextInt();
        b=ab.nextInt();
        if (a>b)
            System.out.println("Максимальное значение равно " +a);
        else if(a==b)
            System.out.println("Числа одинаковые");
        else
            System.out.println("Максимально значение равно " +b);
    }
}
