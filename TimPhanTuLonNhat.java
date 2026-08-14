import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Khoi tao mang tu ban phim
        System.out.print("Nhap kich thuoc cua mang (n): ");
        int n = scanner.nextInt();

        // Kiem tra neu mang khong hop le
        if (n <= 0) {
            System.out.println("Kich thuoc mang phai lon hon 0!");
            scanner.close();
            return; // Cau lenh nhay thoat chuong trinh
        }

        int[] mang = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Phan tu [%d]: ", i);
            mang[i] = scanner.nextInt();
        }

        // 2. Sap xep mang giam dan bang thuat toan Selection Sort (Sap xep chon)
        // Duyet qua tung phan tu cua mang (tru phan tu cuoi cung)
        for (int i = 0; i < n - 1; i++) {
            int chiSoLonNhat = i; // Gia su phan tu hien tai la lon nhat

            // Tim phan tu lon nhat trong doan chua sap xep con lai
            for (int j = i + 1; j < n; j++) {
                if (mang[j] > mang[chiSoLonNhat]) {
                    chiSoLonNhat = j; // Cap nhat chi so cua phan tu lon nhat
                }
            }

            // Hoan vi phan tu lon nhat tim duoc voi phan tu hien tai (i)
            if (chiSoLonNhat != i) {
                int tam = mang[i];
                mang[i] = mang[chiSoLonNhat];
                mang[chiSoLonNhat] = tam;
            }
        }

        // 3. Dau ra: Hien thi ket qua
        System.out.print("\nMang sau khi sap xep giam dan: ");
        // Su dung vong lap foreach de in mang
        for (int x : mang) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Phan tu lon nhat luon o vi tri dau tien (chi so 0) sau khi sap xep giam dan
        int phanTuLonNhat = mang[0];
        System.out.println("Gia tri lon nhat trong mang la: " + phanTuLonNhat);

		
    }
}
