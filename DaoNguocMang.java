import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhap kich thuoc mang va kiem tra dieu kien rong
        System.out.print("Nhap kich thuoc cua mang (n): ");
        int n = scanner.nextInt();

        // Neu mang co kich thuoc rong (<= 0) thi thong bao va dung chuong trinh
        if (n <= 0) {
            System.out.println("Kich thuoc rong");
            scanner.close();
            return;
        }

        // Nhap gia tri cho tung phan tu cua mang
        int[] mang = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Phan tu [%d]: ", i);
            mang[i] = scanner.nextInt();
        }

        // 2. Dau ra: Hien thi mang ban dau
        System.out.print("\nMang ban dau: ");
        for (int x : mang) {
            System.out.print(x + " ");
        }
        System.out.println();

        // 3. Xuly dao nguoc mang khong dung mang phu
        // Chi duyet den giua mang (n / 2) de hoan doi cac phan tu doi xung
        for (int i = 0; i < n / 2; i++) {
            // Hoan doi vi tri arr[i] va arr[n - i - 1]
            int tam = mang[i];
            mang[i] = mang[n - i - 1];
            mang[n - i - 1] = tam;
        }

        // 4. Dau ra: Hien thi mang sau khi dao nguoc
        System.out.print("Mang sau khi dao nguoc: ");
        for (int x : mang) {
            System.out.print(x + " ");
        }
        System.out.println();

        scanner.close();
    }
}
