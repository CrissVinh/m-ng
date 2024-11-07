package Mang;

import java.util.Scanner;

public class TangDan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhap so luong phan tu trong mang: ");
        int n = scanner.nextInt();

        int[] mang = new int[n];

        System.out.println(" nhap " + n + " so co trong mang.");
        for (int i = 0; i < n; i++) {
            System.out.print(" nhap gia tri thu " + (i + 1) + " : ");
            mang[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int soNhoHon = i;
            // tạo biến j = i + 1 nếu mang[j] < mang[soNhoHon] thì gán soNhôHn = j.
            for (int j = i + 1; j < n; j++) {
                if (mang[j] < mang[soNhoHon]) {
                    soNhoHon = j;

                }
            }
            // nếu số nhỏ nhất không ở vị trí i thì thay thế ... 
            if (soNhoHon != i) {
                int thayThe = mang[i];
                mang[i] = mang[soNhoHon];
                mang[soNhoHon] = thayThe;
            }

        }
        System.out.print(" mang sau khi sap xep tang dan: ");
        // duyệt lại các phần tử trong mảng mang[]
        for (int so : mang) {
            System.out.print(so + " ");
        }

    }
}
