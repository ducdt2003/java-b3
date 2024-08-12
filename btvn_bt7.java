package btvn;
import java.util.Scanner;
public class btvn_bt7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, tich = 1, soNguyen, sumChan = 0;
        do {
            System.out.println( " nhập số nguyên dương bất kỳ ");
            soNguyen = Integer.parseInt(sc.nextLine());
        } while (soNguyen < 0);
        for (int i = 0 ; i <= soNguyen ; i++){
            sum += i ;
        }
        for (int i = 1 ; i <= soNguyen ; i++){
            tich *= i ;
        }
        System.out.println("các số chẵn là ");
        for (int i = 0 ; i <= soNguyen ; i++){
            if (i % 2 == 0 ){
                sumChan += i;
                System.out.println(i);
            }
        }
        System.out.println( " Tổng các số nguyên từ 0 đến " + soNguyen + " là " + sum);
        System.out.println( " Tích các số nguyên từ 0 đến " + soNguyen + " là " + tich);
        System.out.println( " tổng các số chẵn từ 0 đến " + soNguyen + " là " + sumChan);
    }
}
