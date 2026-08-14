import java.util.Scanner;

public class TongChanLeMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Khoi tao mang 2 chieu tu ban phim
        System.out.print("Nhap so hang (so dong): ");
        int soHang = scanner.nextInt();

        System.out.print("Nhap so cot: ");
        int soCot = scanner.nextInt();

        // Kiem tra dieu kien kich thuoc mang hop le
        if (soHang <= 0 || soCot <= 0) {
            System.out.println("So hang va so cot phai lon hon 0!");
            scanner.close();
            return;
        }

        int[][] mang2Chieu = new int[soHang][soCot];
        System.out.println("Nhap cac phan tu cua mang 2 chieu:");
        
        // Su dung 2 vong lap for long nhau de nhap du lieu theo hang va cot
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.printf("Phan tu [%d][%d]: ", i, j);
                mang2Chieu[i][j] = scanner.nextInt();
            }
        }

        // 2. Duyet mang 2 chieu de tinh tong chan va tong le
        int tongChan = 0;
        int tongLe = 0;

        // Su dung vong lap foreach long nhau de duyet qua tung phan tu
        for (int[] hang : mang2Chieu) {
            for (int phanTu : hang) {
                // Kiem tra phan tu la so chan hay so le
                if (phanTu % 2 == 0) {
                    tongChan += phanTu; // Cong vao tong chan
                } else {
                    tongLe += phanTu;   // Cong vao tong le
                }
            }
        }

        // 3. Dau ra: Hien thi ket qua
        System.out.println("\n------------------------------------------");
        System.out.println("Tong cac so chan trong mang 2 chieu la: " + tongChan);
        System.out.println("Tong cac so le trong mang 2 chieu la: " + tongLe);
        System.out.println("------------------------------------------");

        scanner.close();
    }
}
