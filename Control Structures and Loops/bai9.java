package chapter2;

import java.util.Scanner;

public class bai9 {
    public static void giaiPTB1(double a, double b){
        if(a == 0)
            if(b == 0)
                System.out.println("Phuong trinh co vo so nghiem");
            else
                System.out.println("Phuong trinh vo nghiem");
        else
            System.out.println("Phuong trinh co nghiem x = " + (-b / a));
    }
    public static void giaiPTB2(double a, double b, double c){
        double delta = Math.pow(b, 2) - 4 * a * c;
        if(delta >= 0){
            if(delta > 0){
                System.out.println("Phuong trinh co 2 nghiem phan biet");
                double sqrt_delta = Math.sqrt(delta);
                double x1 = (- b + sqrt_delta) / 2 * a;
                double x2 = (- b - sqrt_delta) / 2 * a;
                System.out.printf("x1 = %f, x2 = %f", x1, x2);
            }
            else{
                System.out.println("Phuong trinh co nghiem kep");
                double x = - b / 2 * a;
                System.out.printf("x1 = x2 = %f", x);
            }
        }
        else
            System.out.println("Phuong trinh vo nghiem");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("=====Giai phuong trinh ax2 + bx + c = 0=====");
        System.out.println("Nhap a = ");
        a = sc.nextDouble();
        System.out.println("Nhap b = ");
        b = sc.nextDouble();
        System.out.println("Nhap c = ");
        c = sc.nextDouble();
        if(a == 0){
            System.out.println("Day khong phai la phuong trinh bac 2");
            giaiPTB1(b, c);
        }
        else{
            giaiPTB2(a, b, c);
        }
    }
}
