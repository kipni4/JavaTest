package ru.dvfu.mrcpk.example01oop;

/**
 Класс для работы с геометричесскими объектами
 */
public class Geometry01 {
    public static void main(String[] args) {
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
            float r;
            Kr(float r){
                this.r=r;
            }
            float dlinaokru(){
                return 2*3*r;
            }
            float s(){
                return 3*r*r;
            }
        }
        //Создаём объект прямоугольник

        Pr pr1 = new Pr(10,20);
        Kr круг = new Kr(5);
        System.out.println("Длина окружности "+круг.dlinaokru());
        //или инициализировать переменные отдельно
        // pr pr1 =new Pr();
        //pr.a=10;
        // pr.b=20;
        System.out.println("Рисуем прямоугольник "+pr1.a+" "+pr1.b);
        System.out.println("Периметр "+pr1.p()+"см^2");
        System.out.println("Площадь "+pr1.s()+"см^3");
    }
}

