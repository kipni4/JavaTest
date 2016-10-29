package Exse01;

import java.util.Scanner;

/**
 * Created by user on 24.10.2016.
 */
public class ThirdClass {
    public static void main(String[] args) {
    //объявляем переменные
        Scanner sc= new Scanner(System.in);
    int x, y;
    x = sc.nextInt();
    y = sc.nextInt();
    /*
    метод для расчёта площади
     */
    int s = square(x, y);
    System.out.println("Площадь S = " + s);
}
    public static int square(int x1, int y1) {
        int s1 = x1 * y1;
        return s1;
    }
}
