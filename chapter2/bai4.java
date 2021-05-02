package chapter2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 chuoi so nguyen bat ky: ");
        int n = sc.nextInt();
        int tong = 0;
        while(n > 0){
            tong += n%10;
            n /= 10;
        }
        System.out.println("Tong cac chu so cua " + n + " = " + tong);
    }
}
