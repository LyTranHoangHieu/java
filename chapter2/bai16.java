package chapter2;

import java.util.Scanner;

public class bai16 {
    public static void inputArray(int[][] a){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j < a[i].length; j++){
                System.out.printf("a[%d][%d] = ", i, j);
                a[i][j] = sc.nextInt();
            }
    }
    public static void outputArray(int[][] a){
        for(int[] i : a){
            for(int j : i)
                System.out.print(j + "\t");
            System.out.println();
        }
    }
    public static int tong(int[][] a){
        int tong = 0;
        for (int[] i : a)
            for (int j : i)
                tong += j;
        return tong;
    }
    public static void main(String[] args) {
        System.out.println("Nhap noi dung phan tu vao 2 ma tran cung kich thuoc 2x2");
        System.out.println("Ma tran 1");
        int[][] a = new int[2][2];
        inputArray(a);
        System.out.println("Ma tran vua nhap");
        outputArray(a);
        System.out.println("Ma tran 2");
        int[][] b = new int[2][2];
        inputArray(b);
        System.out.println("Ma tran vua nhap");
        outputArray(b);
        int tong = tong(a) + tong(b);
        System.out.println("Tong 2 ma tran = " + tong);
        int hieu = tong(a) - tong(b);
        System.out.println("Hieu 2 ma tran = " + hieu);
        long tich = (long) tong(a) * tong(b);
        System.out.println("Tich 2 ma tran = " + tich);
    }
}
