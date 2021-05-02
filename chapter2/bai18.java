package chapter2;

import java.util.Scanner;

public class bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoiso;
        System.out.println("Nhap vao 1 chuoi so thuc");
        chuoiso = sc.nextLine();
        System.out.println("Chuoi vua nhap");
        System.out.println(chuoiso);
        chuoiso = chuoiso.trim();
        String[] ch = chuoiso.split("; ");
        System.out.println("Chuoi vua nhap co " + ch.length + " so");
        for(String i : ch)
            System.out.printf("%s -> %d\n", i, Math.round(Double.parseDouble(i)));
    }
}
