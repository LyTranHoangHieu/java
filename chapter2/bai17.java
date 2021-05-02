package chapter2;

import java.util.Scanner;

public class bai17 {
    public static boolean isPrimeNum(int n){
        if(n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoiso;
        System.out.println("Nhap vao 1 chuoi cac so nguyen");
        chuoiso = sc.nextLine();
        System.out.println("Chuoi vua nhap");
        System.out.println(chuoiso);

//      Bo khoang trang dau va cuoi chuoi
        chuoiso = chuoiso.trim();

//      Tach chuoi khi gap " " va tra ve mang chuoi
        String[] ch = chuoiso.split(" ");

        System.out.println("Chuoi vua nhap co " + ch.length + " so");

        for(String i : ch) {
            if(isPrimeNum(Integer.parseInt(i)))
                System.out.print(i + "\t");
        }
    }
}
