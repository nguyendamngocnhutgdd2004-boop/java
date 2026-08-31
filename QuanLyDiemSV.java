import java.util.Scanner;

public class QuanLyDiemSV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] diemSV = null; // Mang 1 chieu luu tru diem sinh vien
        int n = 0;             // So luong sinh vien
        int luaChon;

        do {
            // In menu chuong trinh
            System.out.println("\n******************QUAN LY DIEM SV****************");
            System.out.println("1. Nhap danh sach diem sinh vien");
            System.out.println("2. In danh sach diem");
            System.out.println("3. Tinh diem trung binh cua cac sinh vien");
            System.out.println("4. Tim diem cao nhat va thap nhat");
            System.out.println("5. Dem so luong sinh vien dat va truot");
            System.out.println("6. Sap xep diem tang dan");
            System.out.println("7. Thong ke so luong sinh vien gioi va xuat sac");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon cua ban (1-8): ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    System.out.print("Nhap so luong sinh vien: ");
                    n = scanner.nextInt();
                    diemSV = new double[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhap diem cho sinh vien thu " + (i + 1) + ": ");
                        diemSV[i] = scanner.nextDouble();
                    }
                    System.out.println("Nhap danh sach diem thanh cong!");
                    break;

                case 2:
                    if (diemSV == null || n == 0) {
                        System.out.println("Danh sach trong. Vui long nhap diem truoc!");
                    } else {
                        System.out.print("Danh sach diem sinh vien: ");
                        for (int i = 0; i < n; i++) {
                            System.out.print(diemSV[i] + "  ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (diemSV == null || n == 0) {
                        System.out.println("Danh sach trong!");
                    } else {
                        double tong = 0;
                        for (int i = 0; i < n; i++) {
                            tong += diemSV[i];
                        }
                        double diemTB = tong / n;
                        System.out.printf("Diem trung binh cua cac sinh vien: %.2f\n", diemTB);
                    }
                    break;

                case 4:
                    if (diemSV == null || n == 0) {
                        System.out.println("Danh sach trong!");
                    } else {
                        double max = diemSV[0];
                        double min = diemSV[0];
                        for (int i = 1; i < n; i++) {
                            if (diemSV[i] > max) max = diemSV[i];
                            if (diemSV[i] < min) min = diemSV[i];
                        }
                        System.out.println("Diem cao nhat: " + max);
                        System.out.println("Diem thap nhat: " + min);
                    }
                    break;

                case 5:
                    if (diemSV == null || n == 0) {
                        System.out.println("Danh sach trong!");
                    } else {
                        int countDat = 0;
                        int countTruot = 0;
                        for (int i = 0; i < n; i++) {
                            if (diemSV[i] >= 5) {
                                countDat++;
                            } else {
                                countTruot++;
                            }
                        }
                        System.out.println("So luong sinh vien dat (>= 5): " + countDat);
                        System.out.println("So luong sinh vien truot (< 5): " + countTruot);
                    }
                    break;

                case 6:
                    if (diemSV == null || n == 0) {
                        System.out.println("Danh sach trong!");
                    } else {
                        // Thuat toan Sap xep noi bot (Bubble Sort) de xep diem tang dan
                        for (int i = 0; i < n - 1; i++) {
                            for (int j = 0; j < n - i - 1; j++) {
                                if (diemSV[j] > diemSV[j + 1]) {
                                    double temp = diemSV[j];
                                    diemSV[j] = diemSV[j + 1];
                                    diemSV[j + 1] = temp;
                                }
                            }
                        }
                        System.out.println("Da sap xep diem tang dan. Chon chuc nang 2 de in ket qua.");
                    }
                    break;

                case 7:
                    if (diemSV == null || n == 0) {
                        System.out.println("Danh sach trong!");
                    } else {
                        int countGioiXuatSac = 0;
                        for (int i = 0; i < n; i++) {
                            if (diemSV[i] >= 8) {
                                countGioiXuatSac++;
                            }
                        }
                        System.out.println("So luong sinh vien gioi va xuat sac (>= 8): " + countGioiXuatSac);
                    }
                    break;

                case 8:
                    System.out.println("Cam on ban da su dung chuong trinh. Tam biet!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le! Vui long chon lai tu 1 den 8.");
            }
        } while (luaChon != 8);

        scanner.close();
    }
}
