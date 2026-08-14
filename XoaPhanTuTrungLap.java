import java.util.Scanner;

public class XoaPhanTuTrungLap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhap du lieu mang va kiem tra tinh hop le
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

        // 2. Xu ly xac dinh tan suat xuat hien va loc phan tu duy nhat
        // Dung mot mang boolean de danh dau xem phan tu do da bi dem hoac trung lap chua
        boolean[] daXet = new boolean[n];
        
        // Dung mot mang phu de luu cac phan tu duy nhat tim duoc
        int[] mangDuyNhat = new int[n];
        int soPhanTuDuyNhat = 0;

        for (int i = 0; i < n; i++) {
            // Neu phan tu nay da duoc danh dau la trung o cac vong quet truoc thi bo qua
            if (daXet[i]) {
                continue;
            }

            int dem = 1; // Mac dinh phan tu hien tai xuat hien 1 lan
            
            // Quet cac phan tu phia sau de tim phan tu trung lap
            for (int j = i + 1; j < n; j++) {
                if (mang[i] == mang[j]) {
                    dem++;
                    daXet[j] = true; // Danh dau phan tu o vi tri j la bi trung
                }
            }

            // Neu tan suat xuat hien dung 1 lan thi luu vao mang ket qua
            if (dem == 1) {
                mangDuyNhat[soPhanTuDuyNhat] = mang[i];
                soPhanTuDuyNhat++;
            }
        }

        // 3. In ket qua dau ra
        System.out.println("\n---------------- KET QUA ----------------");
        if (soPhanTuDuyNhat == 0) {
            System.out.println("Khong co phan tu nao duy nhat trong mang");
        } else {
            System.out.print("Mang sau khi da loai bo cac phan tu trung lap: ");
            for (int i = 0; i < soPhanTuDuyNhat; i++) {
                System.out.print(mangDuyNhat[i] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");

        scanner.close();
    }
}
