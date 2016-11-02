package Usloviya;

/**
 Делаем таблицу умножения через while
 */
public class TablicaUmnosh {
    public static void main(String[] args) {
        int i, j;
        j = i = 1;
        do {
            i++;
            do {
                System.out.println(i);
                System.out.println(j);
                j++;
            }
                while (j < 10) ;
            }
            while (i < 10);
        }
    }

