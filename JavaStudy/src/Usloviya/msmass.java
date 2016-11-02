package Usloviya;

/**
заполняем масив
 */
public class msmass {
    public static void main(String[] args) {
        int[][] x = new int[10][10];
        for (int i = 0; i < x.length;i++) {
            System.out.println();
            for(int j = 0;j < x[i].length;j++){
                x[i][j]=i*j;
                System.out.print(x[i][j]);
            }
        }
    }
}
