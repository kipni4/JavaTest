package ru.dvfu.mrcpk.example01oop;

/**
 Реализуем наследование
 */
public class Nasledovanie {
   public abstract class figura{
        void draw() {
            System.out.println("Рисуем фигуру ");
        }
        void perimetr(){};
        void square(){};

    }
    public class krug extends figura{
        int a;
        krug(int a1) {this.a = a1;}
        }
    }

