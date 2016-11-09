package ru.dvfu.mrcpk.example01oop;

/**
 Класс для работы с геометричесскими объектами
 */
public class Geometry01 {
    public static void main(String[] args) {
        //класс треугольник
        class Tr{
            int a,b,c;
            Tr(int a1,int b1,int c1) {
                this.a = a1;
                this.b = b1;
                this.c = c1;
            }
                int p() {
                return (a+b+c);
            }
            double s(){
                double p =(a+b+c)*0.5;
                return 0.01*Math.round(Math.sqrt(p*(p-a)*(p-b)*(p-c))*100);
            }
        }
        //класс прямоугольни
        class Pr {
            int a, b;

            Pr(int a1,int b){
                this.a = a1;
                this.b = b;
            }
            int p() {
                return 2 * (a + b);
            }

            int s() {
                return a * b;
            }

        }
        //класс круг
        class Kr{
            int r;
            Kr(int r){
                this.r=r;
            }
            double dlinaokru(){
                return Math.round(Math.PI*2*r*100)*0.01;
            }
            double s(){
                return Math.round(Math.PI*r*r*100)*0.01;
            }
        }
        //Создаём объект прямоугольник

        Pr pr1 = new Pr(10,20);
        Kr круг = new Kr(5);
        Tr treug= new Tr(8,6,7);
        System.out.println("Периметр теуголинка "+treug.p());
        System.out.println("Площадь треугольника "+treug.s());
        System.out.println("Длина окружности "+круг.dlinaokru());
        System.out.println("Площадь круга "+круг.s());
        //или инициализировать переменные отдельно
        // pr pr1 =new Pr();
        //pr.a=10;
        // pr.b=20;
        System.out.println("Рисуем прямоугольник "+pr1.a+" "+pr1.b);
        System.out.println("Периметр "+pr1.p()+"см^2");
        System.out.println("Площадь "+pr1.s()+"см^3");
    }
}

