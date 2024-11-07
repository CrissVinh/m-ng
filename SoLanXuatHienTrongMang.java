
package Mang;

import java.util.Scanner;

public class SoLanXuatHienTrongMang {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhap so luong phan tu trong mang: ");
        int n = scanner.nextInt();
        
        int soLanXuatHien = 0;
        
        int[] mang = new int[n];
        
        System.out.println(" nhap " +n+ " so co trong mang.");
        for (int i = 0; i < n; i++) {
            System.out.print(" nhap gia tri thu " + (i + 1)+ " : " );
            mang[i] = scanner.nextInt();
        }
        System.out.print(" nhap vao so ban muon kiem tra so lan xuat hien: ");
        int soCoSan = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            if(mang[i] == soCoSan ){
                soLanXuatHien++;
                         
            }
        }
        System.out.print(" so lan xuat hien trong mang la " + soLanXuatHien + " lan.");
    }
    
}
