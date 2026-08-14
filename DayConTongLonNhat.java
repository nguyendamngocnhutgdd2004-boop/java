import java.util.Scanner;

public class DayConTongLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhap kich thuoc mang va kiem tra tinh hop le
        System.out.print("Nhap so phan tu cua mang (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Mang khong hop le");
            scanner.close();
            return;
        }

        int[] mang = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Phan tu [%d]: ", i);
            mang[i] = scanner.nextInt();
        }

        // 2. Xu ly bang thuat toan Kadane
        // Buoc 2.1: Kiem tra truong hop dac biet - Tat ca phan tu deu am
        boolean tatCaAm = true;
        int phanTuLonNhat = mang[0];

        for (int x : mang) {
            if (x >= 0) {
                tatCaAm = false; // Co it nhat 1 so khong am
            }
            if (x > phanTuLonNhat) {
                phanTuLonNhat = x; // Tim phan tu lon nhat truoc de phong mang toan am
            }
        }

        int tongLonNhat = 0;

        if (tatCaAm) {
            // Neu tat ca deu am, chon phan tu lon nhat lam ket qua theo dung yeu cau
            tongLonNhat = phanTuLonNhat;
        } else {
            // Nguoc lai, ap dung thuat toan Kadane tieu chuan
            int tongTamThoi = 0;
            tongLonNhat = Integer.MIN_VALUE;

            for (int x : mang) {
                tongTamThoi += x;

                if (tongTamThoi > tongLonNhat) {
                    tongLonNhat = tongTamThoi; // Cap nhat tong lon nhat dat duoc
                }

                if (tongTamThoi < 0) {
                    tongTamThoi = 0; // Dat lai bang 0 de bat dau day con moi
                }
            }
        }

        // 3. Dau ra: Hien thi ket qua tong lon nhat
        System.out.println("\n---------------- KET QUA ----------------");
        System.out.println("Tong lon nhat cua day con lien tiep la: " + tongLonNhat);
        System.out.println("-----------------------------------------");

        scanner.close();
    }
}
