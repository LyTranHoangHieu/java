package test40;
/*
    Đề kiểm tra của cô Ngân - đề 1
*/
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class test3 {
    public static int gcd(int a, int b){
        if(a == 0 || b == 0)
            return a + b;
        while(a != b){
            if(a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }
    public static int lcm(int a, int b){
        int gcd = gcd(a, b);
        return a * b / gcd;
    }
    public static void countWords(String s){

        int count = 0;
        char[] charArray = s.toCharArray();
        int n = s.length();
        for(char i : charArray)
            if(i == ' ')
                count++;
        out.println("Xâu có " + (count + 1) + " từ");
    }
    public static void inputArray(int[] a){
        Scanner input = new Scanner(in);
        int n = a.length;
        for(int i = 0; i < n; i++){
            do{
                out.printf("a[%d] = ", i);
                a[i] = input.nextInt();
            }while(a[i] < 1 || a[i] > 99);
        }
    }
    public static void outputArray(int[] a){
        for(int i : a)
            out.print(i + "\t");
        out.println();
    }
    public static void average(int[] a){
        int n = a.length;
        double average = 0;
        for (int j : a)
            average += j;
        out.println("Tổng trung bình mảng = " + average / n);
    }
    public static void showGreatestAppearTime(int[] a){
        int n = a.length;
        int[] temp = Arrays.copyOfRange(a, 0, n);
        for(int i = 0; i < n - 1; i++)
            for(int j = n - 1; j > i; j--)
                if(temp[j] < temp[j - 1]){
                    temp[j] += temp[j - 1];
                    temp[j - 1] = temp[j] - temp[j - 1];
                    temp[j] -= temp[j - 1];
                }
        int i = 1, max = 0,index = 0;
        int frequency;
        while(i < n)	{
            frequency = 1;
            while(temp[i] == temp[i-1])	{
                frequency++;
                i++;
            }
            if(max < frequency)	{
                max = frequency;
                index = i;
            }
            i++;
        }
        out.println("Maximum frequency: " + max);
        out.println("Element has maximum frequency factor: " + temp[index-1]);
    }
    public static void addX(int[] a){
        Scanner input = new Scanner(in);
        int n = a.length;
        int sizeTemp = n + 1;
        int[] temp = new int[sizeTemp];
        arraycopy(a, 0, temp, 0, n);
        int x, index;
        out.println("Nhập giá trị x cần thêm: ");
        x = input.nextInt();
        do{
            out.println("Nhập vị trí muốn thêm: ");
            index = input.nextInt();
        }while(index < 0 || index > sizeTemp);

        // Dich chuyen mang de tao o trong truoc khi them.
        if (n - index >= 0)
            arraycopy(temp, index, temp, index + 1, n - index);
        // Chen val tai pos
        temp[index] = x;
        // Tang so luong phan tu sau khi chen.
        for (int i = 0; i < sizeTemp; i++)
            out.print(temp[i] + "\t");
    }
    public static void removeX(int[] a){
        Scanner input = new Scanner(in);
        int n = a.length;
        int sizeTemp = n;
        int[] temp = new int[sizeTemp];
        arraycopy(a, 0, temp, 0, sizeTemp);
        int index;
        do{
            out.println("Nhập vị trí muốn xóa: ");
            index = input.nextInt();
        }while(index < 0 || index > sizeTemp);
        if (sizeTemp - 1 - index >= 0)
            arraycopy(temp, index + 1, temp, index, sizeTemp - 1 - index);
        --sizeTemp;
        for (int i = 0; i < sizeTemp; i++)
            out.print(temp[i] + "\t");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
//        int a, b;
//        do{
//            out.println("Nhập a = ");
//            a = input.nextInt();
//        }while(a <= 0);
//        do{
//            out.println("Nhập b = ");
//            b = input.nextInt();
//        }while(b <= 0);
//        out.println("Ước chung lớn nhất của a và b là: " + gcd(a, b));
//        out.println("Bội chung nhỏ nhất của a và b là: " + lcm(a, b));
//        String s;
//        out.println("Nhập vào 1 xâu: ");
//        s = input.nextLine();
//        countWords(s);
        int n;
        do{
            out.println("Nhập số lượng phần tử mảng");
            n = input.nextInt();
        }while(n < 0);
        int[] a = new int[n];
        inputArray(a);
        outputArray(a);
//        average(a);
//        showGreatestAppearTime(a);
        addX(a);
        removeX(a);
    }
}
