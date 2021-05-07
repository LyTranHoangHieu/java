package chapter2;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        do{
            System.out.println("Nhap a = ");
            a = sc.nextDouble();
        }while(a <= 0);
        do{
            System.out.println("Nhap b = ");
            b = sc.nextDouble();
        }while(b <= 0);
        do{
            System.out.println("Nhap c = ");
            c = sc.nextDouble();
        }while(c <= 0);
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Dien tich = " + s);
    }
        
}
