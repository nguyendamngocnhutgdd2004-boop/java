import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.HashSet;
import java.util.Set;

public class baitap10 {
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

        System.out.println("Cac so Happy tu 1 den " + n + " la:");
        for (int i = 1; i <= n; i++) {
            if (isHappy(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        scanner.close();
    }

    // Kiem tra mot so co phai la Happy Number hay khong
    public static boolean isHappy(int soCanKiemTra) {
        Set<Integer> daGap = new HashSet<>(); // luu lai cac so da xuat hien de phat hien vong lap
        int temp = soCanKiemTra;

        while (temp != 1 && !daGap.contains(temp)) {
            daGap.add(temp);
            temp = tongBinhPhuongChuSo(temp);
        }

        return temp == 1;
    }

    // Tinh tong binh phuong cac chu so cua mot so
    public static int tongBinhPhuongChuSo(int so) {
        int tong = 0;
        while (so > 0) {
            int chuSo = so % 10;
            tong += chuSo * chuSo;
            so = so / 10;
        }
        return tong;
    }
}