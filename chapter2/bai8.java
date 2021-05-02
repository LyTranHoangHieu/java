package chapter2;

import java.util.Scanner;

public class bai8 {
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
        if((a + b) > c && (b + c) > a && (a + c) > b){
            System.out.println("a, b, c la do 3 canh cua tam giac");
            if(a == b || b == c ||  c == a){
                if (a == b && b == c)
                    System.out.println("Day la tam giac deu");
                else{
                    double x = Math.pow(a, 2);
                    double y = Math.pow(b, 2);
                    double z = Math.pow(c, 2);
                    if(x + y == z || x + z == y || y + z == x)
                        System.out.println("Day la tam giac vuong can");
                    else
                        System.out.println("Day la tam giac can");
                }   
            }
            else{
                double x = Math.pow(a, 2);
                double y = Math.pow(b, 2);
                double z = Math.pow(c, 2);
                if(x + y == z || x + z == y || y + z == x)
                    System.out.println("Day la tam giac vuong");
                else
                    System.out.println("Day la tam giac thuong");
            }
        }
        else
            System.out.println("a, b, c khong la do dai 3 canh cua tam giac");
    }
}
