
package Mang;

import java.util.Scanner;

public class TongVaTrungBinhCong {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] number = new int[n];
        int sum = 0;
        
        for( int i = 0; i<n; i++){
            System.out.print(" nhap gia tri thu "+ (i + 1)+" cua mang: ");
            number[i] = scanner.nextInt();
            sum = sum + number[i];
        }
        int average = (int) sum / n;
        System.out.println(" trung binh cong cua cac phan tu: " + average);
        System.out.println(" tong cua cac phan tu: " + sum);
    }
    
}
