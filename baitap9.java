import java.util.Scanner;
import java.util.InputMismatchException;

public class SoArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean hopLe = false;

        // Vong lap de nhap N hop le (so nguyen duong)
        while (!hopLe) {
            System.out.print("Nhap so nguyen duong N: ");
            try {
                n = scanner.nextInt();
                if (n > 0) {
                    hopLe = true;
                } else {
                    System.out.println("So nhap vao khong hop le");
                }
            } catch (InputMismatchException e) {
                System.out.println("So nhap vao khong hop le");
                scanner.next(); // xoa du lieu sai khoi bo dem
            }
        }

        System.out.println("Cac so Armstrong tu 0 den " + n + " la:");
        for (int i = 0; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        scanner.close();
    }

    // Kiem tra mot so co phai la so Armstrong hay khong
    public static boolean isArmstrong(int soCanKiemTra) {
        int soChuSo = demSoChuSo(soCanKiemTra);
        int temp = soCanKiemTra;
        int tong = 0;

        while (temp > 0) {
            int chuSo = temp % 10;
            tong += (int) Math.pow(chuSo, soChuSo);
            temp = temp / 10;
        }

        return tong == soCanKiemTra;
    }

    // Dem so chu so cua mot so nguyen (rieng so 0 co 1 chu so)
    public static int demSoChuSo(int so) {
        if (so == 0) return 1;
        int dem = 0;
        while (so > 0) {
            dem++;
            so = so / 10;
        }
        return dem;
    }
}