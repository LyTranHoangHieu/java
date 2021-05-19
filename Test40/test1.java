package test40;
/*
    Đề kiểm tra của thầy Đạt và cô Ngọc Nga
*/
import java.util.Scanner;
import java.util.Arrays;
public class test1 {
    public static void inputArray(int[] a){
        Scanner input = new Scanner(System.in);
        int n = a.length;
        for(int i = 0; i < n; i++){
            System.out.printf("a[%d] = ", i);
            a[i] = input.nextInt();
        }
    }
    public static void outputArray(int[] a){
        for(int i : a)
            System.out.print(i+ "\t");
        System.out.println();
    }
    public static void maxValue_maxPosition(int[] a){
        int n = a.length;
        int maxValue = a[0];
        for(int i = 1; i < n; i++)
            if(a[i] > maxValue)
                maxValue = a[i];
        System.out.println("Phần tử có giá trị lớn nhất trong mảng là: " + maxValue);
        System.out.println("Vị trí của phần tử lớn nhất trong mảng là:");
        for(int i = 0; i < n; i++)
            if(a[i] == maxValue)
                System.out.print(i + "\t");
        System.out.println();
    }
    public static void minValue_minPosition(int[] a){
        int n = a.length;
        int minValue = a[0];
        for(int i = 1; i < n; i++)
            if(a[i] < minValue)
                minValue = a[i];
        System.out.println("Phần tử có giá trị lớn nhất trong mảng là: " + minValue);
        System.out.println("Vị trí của phần tử lớn nhất trong mảng là:");
        for(int i = 0; i < n; i++)
            if(a[i] == minValue)
                System.out.print(i + "\t");
        System.out.println();
    }
    public static void sortDESC(int[] a){
        int n = a.length;
        int[] temp = Arrays.copyOfRange(a, 0, n);
        for(int i = 0; i < n - 1; i++)
            for(int j = n - 1; j > i; j--)
                if(temp[j] > temp[j - 1]){
                    temp[j] += temp[j - 1];
                    temp[j - 1] = temp[j] - temp[j - 1];
                    temp[j] -= temp[j - 1];
                }
        outputArray(temp);
    }
    public static void sortASC(int[] a){
        int n = a.length;
        int[] temp = Arrays.copyOfRange(a, 0, n);
        for(int i = 0; i < n - 1; i++)
            for(int j = n - 1; j > i; j--)
                if(temp[j] < temp[j - 1]){
                    temp[j] += temp[j - 1];
                    temp[j - 1] = temp[j] - temp[j - 1];
                    temp[j] -= temp[j - 1];
                }
        outputArray(temp);
    }
    public static void symmetricArray(int[] a){
        int n = a.length;
        int count = 0;
        for(int i = 0; i < n; i++)
            if(a[i] != a[n - 1 - i])
                count++;
        if(count == 0)
            System.out.println("Mảng đối xứng");
        else
            System.out.println("Mảng không đối xứng");
    }
    public static void sum3elements(int[] a){
        int n = a.length;
        int sum = 0;
        if(n < 4){
            for(int i : a)
                sum += i;
        }
        else{
            for(int i = 0; i < 3; i++)
                sum += a[i];
        }
        System.out.println("Tổng 3 phần tử đầu tiên = " + sum);
    }
    public static void addTail(int[] a){
        Scanner input = new Scanner(System.in);
        int k;
        System.out.println("Nhập nội dung phần tử cần thêm:");
        k = input.nextInt();
        int n = a.length;
        int sizeTemp = n + 1;
        int[] temp = new int[sizeTemp];
        System.arraycopy(a, 0, temp, 0, n);
        temp[sizeTemp - 1] = k;
        outputArray(temp);
    }
    public static void addHead(int[] a){
        Scanner input = new Scanner(System.in);
        int k;
        System.out.println("Nhập nội dung phần tử cần thêm:");
        k = input.nextInt();
        int n = a.length;
        int sizeTemp = n + 1;
        int[] temp = new int[sizeTemp];
        System.arraycopy(a, 0, temp, 1, n);
        temp[0] = k;
        outputArray(temp);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhập số lượng phần tử mảng: ");
            n = input.nextInt();
        }while(n < 0);
        int[] a = new int[n];
        inputArray(a);
        System.out.println("Mảng vừa nhập");
        outputArray(a);
        maxValue_maxPosition(a);
        minValue_minPosition(a);
        System.out.println("Mảng sắp theo thứ tự giảm dần");
        sortDESC(a);
        System.out.println("Mảng sắp xếp theo thứ tự tăng dần");
        sortASC(a);
        symmetricArray(a);
        sum3elements(a);
        addTail(a);
        addHead(a);
    }
}
