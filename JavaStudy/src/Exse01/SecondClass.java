package Exse01;

/**

 */
public class SecondClass {
    public static void main(String[] args) {
        //объявляем переменные
        int x, y;
        x = 100;
        y = 200;
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
