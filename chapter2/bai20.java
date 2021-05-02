package chapter2;

public class bai20 {
    public static boolean isSoThuanNghich(int n){
        StringBuilder xau = new StringBuilder();
        String strNumber = "" + n;
        xau.append(strNumber);
        String reverse =  "" + xau.reverse();
        return strNumber.equals(reverse);
    }
    public static void main(String[] args) {
        StringBuilder xau = new StringBuilder();
        int count = 0;
        for(int i = 100000; i < 999999; i++)
            if(isSoThuanNghich(i)){
                xau.append(i);
                xau.append("\n");
                count++;
            }
        System.out.println("Co " + count + " so thuan nghich co 6 chu so");
        System.out.println(xau);
    }
}
