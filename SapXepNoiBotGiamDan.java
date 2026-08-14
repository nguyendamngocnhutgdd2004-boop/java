import java.util.Scanner;

public class SapXepNoiBotGiamDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Khoi tao mang tu ban phim
        System.out.print("Nhap kich thuoc cua mang (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Kich thuoc mang phai lon hon 0!");
            scanner.close();
            return;
        }

        int[] mang = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Phan tu [%d]: ", i);
            mang[i] = scanner.nextInt();
        }

        // 2. Thuat toan sap xep noi bot (Bubble Sort) theo thu tu giam dan
        // Vong lap ngoai kiem soat so luot duyet mang
        for (int i = 0; i < n - 1; i++) {
            // Vong lap trong so sanh cac cap phan tu ke nhau
            for (int j = 0; j < n - 1 - i; j++) {
                // Neu phan tu phia truoc nho hon phan tu phia sau -> doi cho de giam dan
                if (mang[j] < mang[j + 1]) {
                    // Tien hanh hoan vi (swap)
                    int tam = mang[j];
                    mang[j] = mang[j + 1];
                    mang[j + 1] = tam;
                }
            }
        }

        // 3. Dau ra: Hien thi mang da sap xep
        System.out.print("\nMang sau khi sap xep noi bot giam dan: ");
        for (int x : mang) {
            System.out.print(x + " ");
        }
        System.out.println();

		
    }
}
