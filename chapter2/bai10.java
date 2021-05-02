package chapter2;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhap a = ");
        a = sc.nextInt();
        switch(a){
            case 1 -> System.out.println("Chu nhat");
            case 2 -> System.out.println("Thu Hai");
            case 3 -> System.out.println("Thu Ba");
            case 4 -> System.out.println("Thu Tu");
            case 5 -> System.out.println("Thu Nam");
            case 6 -> System.out.println("Thu Sau");
            case 7 -> System.out.println("Thu Bay");
            default -> System.out.println("Ban da sai, chi duoc nhap so nguyen tu 1->7");
        }
    }
}
