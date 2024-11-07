package Mang;

import java.util.Scanner;

public class MinMaxTrongMang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(" nhap gia tri thu " + (i + 1) + " trong mang: ");
            mang[i] = scanner.nextInt();
        }
        int min = mang[0];
        int max = mang[0];
        
        for (int i = 1; i < n; i++) {
            if( mang[i] > max ){
                max = mang[i];
            }if(mang[i] < min){
                min = mang[i];
            }
        }
            System.out.println(" so lon nhat trong mang la: " + max);
            System.out.println(" so nho nhat trong mang la: " + min);
        
    }
    
}
