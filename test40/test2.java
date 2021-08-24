package test40;
/*
    Đề kiểm tra của cô Ngân - đề 2
*/

// Nhập 1 ký tự trong java
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class test2 {
    public static boolean isPrime(int n){
        if(n < 2)
            return false;
        double sqrt_n = Math.sqrt(n);
        for(int i = 2; i <= sqrt_n; i++)
            if(n % i == 0)
                return false;
        return true;
    }
    public static void listed(int n){
        if(n < 3)
            out.println("Không có số nguyên tố nào < " + n);
        else{
            out.println("Các số nguyên tố < " + n);
            for(int i = 2; i < n; i++)
                if(isPrime(i))
                    out.print(i + "\t");
            out.println();
        }
    }
    public static void countWord(String xau) throws IOException {
        Scanner input = new Scanner(in);
        out.println("Nhập từ x");
        char x;
        x = (char) in.read();
        char[] charArray = xau.toCharArray();
        int count = 0;
        for (char i : charArray)
            if (i == x) {
                count++;
            }
        out.println("Số lần xuất hiện của " + x + " trong xau la " + count);
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
    public static void minValue_firstMinPosition(int[] a){
        int n = a.length;
        int minValue = a[0];
        int firstMinPosition = 0;
        for(int i = 1; i < n; i++)
            if(a[i] < minValue)
                minValue = a[i];
        System.out.println("Phần tử có giá trị nhỏ nhất trong mảng là: " + minValue);
        for(int i = 0; i < n; i++)
            if(a[i] == minValue){
                firstMinPosition =  i;
                break;
            }
        System.out.println("Vị trí đầu tiên của phần tử nhỏ nhất trong mảng là:" + firstMinPosition);
    }
    public static void showManyTimeAppear(int[] a){
        int n = a.length;
        int[] temp = Arrays.copyOfRange(a, 0, n);
        for(int i = 0; i < n - 1; i++)
            for(int j = n - 1; j > i; j--)
                if(temp[j] < temp[j - 1]){
                    temp[j] += temp[j - 1];
                    temp[j - 1] = temp[j] - temp[j - 1];
                    temp[j] -= temp[j - 1];
                }
        int time = 1;
        for(int i = 1; i < n; i++){
            if(temp[i] == temp[i - 1])
                time++;
            else{
                out.println("Phần tử " + temp[i - 1] + " xuất hiện " + time + " lần");
                time = 1;
            }
        }
        out.println("Phần tử " + temp[n - 1] + " xuất hiện " + time + " lần");
    }
    public static int search(int[] a, int x){
        int n = a.length;
        for(int i = 0; i < n; i++)
            if(a[i] == x)
                return i;
        return -1;
    }
    public static void removeX(int[] a){
        Scanner input = new Scanner(in);
        int x;
        out.println("Nhập x =");
        x = input.nextInt();
        int n = a.length;
        int pos = search(a, x);
        if(pos == -1){
            out.println("Không tìm thấy phần tử " + x + " trong mảng");
        }
        else{
            int[] temp = new int[n];
            arraycopy(a, 0, temp, 0, n);
            if (n - 1 - pos >= 0)
                arraycopy(temp, pos + 1, temp, pos, n - 1 - pos);
            n--;
            for(int i = 0; i < n; i++)
                out.print(temp[i] + "\t");
        }

    }
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(in);
//        int n;
//        do{
//            System.out.println("Nhập số nguyên n =");
//            n = input.nextInt();
//        }while(n < 0);
//        listed(n);
//        out.println("Nhập vào 1 xâu ký tự");
//        String xau = input.nextLine();
//        out.println("Xâu ký tự vừa nhập");
//        out.println(xau);
//        countWord(xau);
        int n;
        do{
            out.println("Nhập số lượng phần tử mảng");
            n = input.nextInt();
        }while(n < 0);
        int[] a = new int[n];
        inputArray(a);
        outputArray(a);
//        minValue_firstMinPosition(a);
//        showManyTimeAppear(a);
        removeX(a);
    }
}
