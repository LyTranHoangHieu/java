package chapter2;

import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhap n =");
            n = sc.nextInt();
        }while(n <= 0);
        System.out.println("BANG CUU CHUONG " + n);
        for(int i = 1; i < 11; i++){
            System.out.printf("%d x %d = %d", n, i, n * i);
            System.out.println();
        }
    }
}
