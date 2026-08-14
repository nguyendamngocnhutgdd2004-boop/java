import java.util.Scanner;

public class SapXepVaTimKiem {
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

        // 2. Sap xep mang giam dan bang thuat toan Selection Sort (Sap xep chon)
        for (int i = 0; i < n - 1; i++) {
            int chiSoLonNhat = i;
            for (int j = i + 1; j < n; j++) {
                if (mang[j] > mang[chiSoLonNhat]) {
                    chiSoLonNhat = j;
                }
            }
            // Hoan vi
            if (chiSoLonNhat != i) {
                int tam = mang[i];
                mang[i] = mang[chiSoLonNhat];
                mang[chiSoLonNhat] = tam;
            }
        }

        // Dau ra: In mang da sap xep
        System.out.print("\nMang sau khi sap xep giam dan: ");
        for (int x : mang) {
            System.out.print(x + " ");
        }
        System.out.println();

        // 3. Nhap so can tim kiem
        System.out.print("\nNhap so nguyen can tim: ");
        int soCanTim = scanner.nextInt();

        // --- PHUONG PHAP 1: TIM KIEM TUYEN TINH ---
        int viTriTuyenTinh = -1;
        for (int i = 0; i < n; i++) {
            if (mang[i] == soCanTim) {
                viTriTuyenTinh = i; // Luu lai vi tri dau tien tim thay
                break; // Dung lai vi da tim thay
            }
        }

        // --- PHUONG PHAP 2: TIM KIEM NHI PHAN (Tren mang giam dan) ---
        int viTriNhiPhan = -1;
        int trai = 0;
        int phai = n - 1;

        while (trai <= phai) {
            int giua = trai + (phai - trai) / 2;

            if (mang[giua] == soCanTim) {
                viTriNhiPhan = giua;
                break; // Tim thay, thoat vong lap
            }
            // Vi mang giam dan, neu mang[giua] LON hon so can tim, so do nam ben PHAI
            else if (mang[giua] > soCanTim) {
                trai = giua + 1;
            } 
            // Nguoc lai, neu mang[giua] NHO hon so can tim, so do nam ben TRAI
            else {
                phai = giua - 1;
            }
        }

        // 4. Dau ra: Hien thi ket qua tim kiem
        System.out.println("\n---------------- KET QUA TIM KIEM ----------------");
        
        // In ket qua tu tim kiem tuyen tinh
        if (viTriTuyenTinh != -1) {
            System.out.printf("[Tuyen tinh]: Tim thay so %d tai vi tri index: %d\n", soCanTim, viTriTuyenTinh);
        } else {
            System.out.printf("[Tuyen tinh]: Khong tim thay so %d trong mang.\n", soCanTim);
        }

        // In ket qua tu tim kiem nhi phan
        if (viTriNhiPhan != -1) {
            System.out.printf("[Nhi phan]  : Tim thay so %d tai vi tri index: %d\n", soCanTim, viTriNhiPhan);
        } else {
            System.out.printf("[Nhi phan]  : Khong tim thay so %d trong mang.\n", soCanTim);
        }
        System.out.println("--------------------------------------------------");

        scanner.close();
    }
}
