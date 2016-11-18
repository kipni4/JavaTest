package ru.dvfu.mrcpk.example01oop;

/**пробую геттеры сеттеры*/
import java.util.Scanner;

public class VorosTest {
    public static void main(String[]args ) {
        // voprosb tst[] = new voprosb[3];
      // public void settst(voprosb v1,voprosb v2,voprosb v3){
      // this.tst[0]=v1;
     //  this.tst[1]=v2;
     //  this.ot[2]=v3;}
        voprosb v1 = new voprosb();
        voprosb v2 =new voprosb();
        voprosb v3 =new voprosb();
        v1.setVop("Как зовут разраба?","Коля","УааасяЯЯ","Петя","Леша","2");//Последня строка это порядковый номер правильного ответа
        v2.setVop("Какого цвета белая кошка?","Серого","Красного","Черного","Белого","4");
        v3.setVop("В.И. Ленин завещал?","Бриться","Лечиться","Учиться","Бегать","3");
        v1.zadavatb();
        v2.zadavatb();
        v3.zadavatb();
    }


}
class voprosb{
    private int a1=6;
    String ot[]=new String[a1];
    public void setVop(String a,String b,String c,String d,String e,String f){
        this.ot[0]=a;
        this.ot[1]=b;
        this.ot[2]=c;
        this.ot[3]=d;
        this.ot[4]=e;
        this.ot[5]=f;
    }

    public void zadavatb(){
        System.out.println(ot[0]);
        for(int i=1;i<(a1-1);i++){System.out.print(i+")");System.out.println(ot[i]);}
        int b= new Scanner(System.in).nextInt();
        if(b==Integer.parseInt(ot[a1-1]))
            System.out.println("Правильный ответ");
        else
            System.out.println("Неправильно");
    }
    public String getVop(){
        return ot[a1];
    }
}