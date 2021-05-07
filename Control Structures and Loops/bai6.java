package chapter2;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("GIAI PHUONG TRINH 2AX + B = 8C");
        System.out.println("Nhap a = ");
        a = sc.nextDouble();
        System.out.println("Nhap b = ");
        b = sc.nextDouble();
        System.out.println("Nhap c = ");
        c = sc.nextDouble();
        if (a == 0)
            if ((b - 8 * c) == 0)
                System.out.println("Phuong trinh co vo so nghiem");
            else
                System.out.println("Phuong trinh vo nghiem");
        else
            System.out.println("Phuong trinh co nghiem x = " + (8 * c - b) / 2 * a);
    }
}
