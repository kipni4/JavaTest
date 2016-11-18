package ru.dvfu.mrcpk.example01oop;
import java.util.Scanner;
/**
 Пробую собрать класс вопрос
 */
public class TesterS {
        public static void main(String[] args) {
        voprosbi v1 = new voprosbi();
        v1.ot[0]="Как зовут разраба";
        v1.ot[1]="Саша";
        v1.ot[2]="Гриша";
        v1.ot[3]="УААасяЯЯ";
        v1.ot[4]="Лёша";
        v1.ot[5]="3"; //Номер строка правильного ответа
        voprosbi v2 =new voprosbi();
        v2.ot[0]="Как зовут разраба";
        v2.ot[1]="Саша";
        v2.ot[2]="Гриша";
        v2.ot[3]="Остап";
        v2.ot[4]="УААасяЯЯ";
        v2.ot[5]="4"; //Номер строка правильного ответа
        voprosbi v3 =new voprosbi();
        v3.ot[0]="Как зовут разраба";
        v3.ot[1]="УААасяЯЯ";
        v3.ot[2]="Гриша";
        v3.ot[3]="Остап";
        v3.ot[4]="Максим";
        v3.ot[5]="1"; //Номер строка правильного ответа
        v1.zadavatb();
        v2.zadavatb();
        v3.zadavatb();

    }
}
class voprosbi{
    int a1=6;
    String ot[]=new String[a1];
    void zadavatb(){
        System.out.println(ot[0]);
        for(int i=1;i<(a1-1);i++){System.out.print(i+")");System.out.println(ot[i]);}
        int b= new Scanner(System.in).nextInt();
        if(b==Integer.parseInt(ot[a1-1]))
            System.out.println("Правильный ответ");
        else
            System.out.println("Неправильно");
    }
}





