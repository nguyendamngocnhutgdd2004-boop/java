import java.util.Scanner;

public class TinhTongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Khoi tao mang tu ban phim
        System.out.print("Nhap kich thuoc cua mang (n): ");
        int n = scanner.nextInt();

        // Kiem tra dieu kien kich thuoc mang hop le
        if (n <= 0) {
            System.out.println("Kich thuoc mang phai lon hon 0!");
            scanner.close();
            return; // Thoat chuong trinh neu nhap sai
        }

        int[] mang = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Phan tu [%d]: ", i);
            mang[i] = scanner.nextInt();
        }

        // 2. Tinh tong cac phan tu trong mang
        int tong = 0;
        // Su dung vong lap foreach de duyet qua tung phan tu va cong don
        for (int phanTu : mang) {
            tong += phanTu; // Tuong duong voi: tong = tong + phanTu
        }

        // 3. Dau ra: Hien thi ket qua
        System.out.println("------------------------------------------");
        System.out.println("Tong cac phan tu trong mang la: " + tong);
        System.out.println("------------------------------------------");

        scanner.close();
    }
}
