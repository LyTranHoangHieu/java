package chapter2;

import java.util.Scanner;

public class bai12 {
    public static boolean checkYear(int y){
        return y >= 0;
    }
    public static boolean checkMonth(int m){
        return m >= 1 && m <= 12;
    }
    public static boolean checkLeapYear(int y){
        return y % 400 == 0 || y % 4 ==0 && y % 100 != 0;
    }
    public static void monthPrintDay(int m, int y){
        switch (m){
            case 1, 3, 5, 7, 8, 10, 12
                    -> System.out.println("Thang co 31 ngay");
            case 4, 6, 9, 11
                    -> System.out.println("Thang co 30 ngay");
            case 2
                    -> System.out.println(checkLeapYear(y)? "Thang co 29 ngay" : "Thang co 28 ngay");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month;
        System.out.println("Nhap nam =");
        year = sc.nextInt();
        System.out.println("Nhap thang =");
        month = sc.nextInt();
        if(checkYear(year)){
            if(checkMonth(month)){
                if(checkLeapYear(year))
                    System.out.println("Day la nam nhuan");
                else
                    System.out.println("Day la nam thuong");
                monthPrintDay(month, year);
            }
            else
                System.out.println("Ban da nhap sai thang");
        }
        else
            System.out.println("Ban da nhap sai nam");
    }
}
