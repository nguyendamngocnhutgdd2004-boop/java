import java.util.Scanner;

public class QuanLyMangSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Khoi tao mang ban dau rong (0 phan tu)
        int[] mang = new int[0];
        int luaChon = 0;

        // Su dung vong lap do-while de duy tri menu
        do {
            System.out.println("\n*************** MENU QUAN LY MANG ***************");
            System.out.println("1. Them mot phan tu vao mang");
            System.out.println("2. Xoa mot phan tu trong mang theo chi so (index)");
            System.out.println("3. Hien thi mang");
            System.out.println("4. Sap xep mang theo gia tri giam dan");
            System.out.println("5. Tim kiem mot phan tu trong mang");
            System.out.println("6. Thoat");
            System.out.print("Lua chon cua ban: ");
            
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    // --- CHUC NANG 1: THEM PHAN TU ---
                    System.out.print("Nhap so nguyen can them: ");
                    int soCanThem = scanner.nextInt();
                    
                    // Tao mang moi co kich thuoc lon hon mang cu 1 don vi
                    int[] mangThem = new int[mang.length + 1];
                    // Sao chep du lieu tu mang cu sang mang moi
                    for (int i = 0; i < mang.length; i++) {
                        mangThem[i] = mang[i];
                    }
                    // Dua phan tu moi vao vi tri cuoi cung
                    mangThem[mangThem.length - 1] = soCanThem;
                    // Cap nhat lai mang chinh
                    mang = mangThem;
                    System.out.println("-> Da them phan tu " + soCanThem + " vao mang.");
                    break;

                case 2:
                    // --- CHUC NANG 2: XOA PHAN TU THEO INDEX ---
                    if (mang.length == 0) {
                        System.out.println("Mang dang rong, khong co gi de xoa!");
                        break;
                    }
                    System.out.printf("Nhap chi so index can xoa (tu 0 den %d): ", mang.length - 1);
                    int indexXoa = scanner.nextInt();

                    // Kiem tra index hop le
                    if (indexXoa < 0 || indexXoa >= mang.length) {
                        System.out.println("Chi so index khong hop le!");
                    } else {
                        // Tao mang moi co kich thuoc nho hon mang cu 1 don vi
                        int[] mangXoa = new int[mang.length - 1];
                        int k = 0; // Bien chay cho mang moi
                        
                        for (int i = 0; i < mang.length; i++) {
                            // Bo qua phan tu tai index can xoa
                            if (i == indexXoa) {
                                continue;
                            }
                            mangXoa[k++] = mang[i];
                        }
                        // Cap nhat lai mang chinh
                        mang = mangXoa;
                        System.out.println("-> Da xoa phan tu tai index " + indexXoa);
                    }
                    break;

                case 3:
                    // --- CHUC NANG 3: HIEN THI MANG ---
                    System.out.print("Mang hien tai: ");
                    if (mang.length == 0) {
                        System.out.print("(Trong)");
                    } else {
                        for (int x : mang) {
                            System.out.print(x + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 4:
                    // --- CHUC NANG 4: SAP XEP GIAM DAN (Selection Sort) ---
                    if (mang.length == 0) {
                        System.out.println("Mang rong, khong the sap xep!");
                        break;
                    }
                    for (int i = 0; i < mang.length - 1; i++) {
                        int indexMax = i;
                        for (int j = i + 1; j < mang.length; j++) {
                            if (mang[j] > mang[indexMax]) {
                                indexMax = j;
                            }
                        }
                        if (indexMax != i) {
                            int tam = mang[i];
                            mang[i] = mang[indexMax];
                            mang[indexMax] = tam;
                        }
                    }
                    System.out.println("-> Da sap xep mang theo thu tu giam dan.");
                    break;

                case 5:
                    // --- CHUC NANG 5: TIM KIEM PHAN TU ---
                    if (mang.length == 0) {
                        System.out.println("Mang rong, khong co du lieu de tim!");
                        break;
                    }
                    System.out.print("Nhap so nguyen can tim: ");
                    int soCanTim = scanner.nextInt();
                    
                    boolean timThay = false;
                    System.out.print("Ket qua tim kiem: ");
                    for (int i = 0; i < mang.length; i++) {
                        if (mang[i] == soCanTim) {
                            System.out.printf("Tim thay tai index [%d] ", i);
                            timThay = true;
                        }
                    }
                    if (!timThay) {
                        System.out.print("Khong ton tai so nay trong mang.");
                    }
                    System.out.println();
                    break;

                case 6:
                    // --- CHUC NANG 6: THOAT ---
                    System.out.println("Chuong trinh ket thuc. Tam biet!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lua chon khong hop le! Vui long chon tu 1 den 6.");
                    break;
            }
        } while (luaChon != 6);
    }
}
