package chapter2;

import java.util.Scanner;

public class bai15 {
    public static void inputArray(int[] a){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }
    }
    public static void outputArray(int[] a){
        for (int i : a)
            System.out.print(i + "\t");
        System.out.println();
    }
    public static void sort(int[] a){
        for(int i = 0; i < a.length - 1; i++)
            for(int j = a.length - 1; j > i; j--)
                if(a[j] < a[j - 1]){
                    a[j] += a[j - 1];
                    a[j - 1] = a[j] - a[j - 1];
                    a[j] -= a[j - 1];
                }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhap so luong phan tu n =");
            n = sc.nextInt();
        }while(n < 0);
        int[] a = new int[n];
        inputArray(a);
        System.out.println("Mang vua nhap");
        outputArray(a);
        sort(a);
        outputArray(a);
    }
}
