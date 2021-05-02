package chapter2;

import java.util.Scanner;

public class bai19 {
    public static boolean isSoThuanNghich(int n){
        // lớp StringBuilder() để sử dụng
        // phương thức append() - nối thêm tham số vào cuối chuỗi
        // và phương thức reverse() - tạo chuỗi đảo ngược
        // kiểu dữ liệu String để sử dụng
        // hàm equals() - so sánh 2 chuỗi
        StringBuilder xau = new StringBuilder();
        String strNumber = "" + n;
        xau.append(strNumber);
        String reverse = "" + xau.reverse();
        return strNumber.equals(reverse);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n (6 chu so) ");
        n = sc.nextInt();
        System.out.println(isSoThuanNghich(n) ? "Thuan nghich" : "Khong Thuan nghich");
    }
}
