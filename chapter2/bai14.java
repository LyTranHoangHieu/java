package chapter2;

public class bai14 {
    public static void main(String[] args) {

//        Dang 1
        for(int i  = 1; i < 11; i++){
            System.out.println("Bang cuu chuong " + i);
            for(int j = 1; j < 11; j++){
                System.out.printf("%d x %d = %d", i, j, i * j);
                System.out.println();
            }
        }
//        Dang 2
        for(int i = 1; i < 11; i++){
            for(int j = 1; j < 11; j++)
                System.out.printf("%d x %-2d = %-4d", j, i, i * j);
            System.out.println();
        }
    }
}
