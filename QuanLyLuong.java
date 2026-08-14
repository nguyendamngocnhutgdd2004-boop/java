import java.util.Scanner;

public class QuanLyLuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Cac bien luu tru du lieu thong ke toan cuc
        int tongSoNhanVien = 0;
        double tongLuong = 0;
        double luongCaoNhat = -1;
        double luongThapNhat = 500000001; // Lon hon muc toi da (500 trieu) de so sanh
        double tongThuong = 0;

        int luaChon = 0;

        // Vong lap do-while de duy tri menu chinh
        do {
            System.out.println("\n***************MENU NHAP LUONG***************");
            System.out.println("1. Nhap luong nhan vien");
            System.out.println("2. Hien thi thong ke");
            System.out.println("3. Tinh tong so tien thuong cho nhan vien");
            System.out.println("4. Thoat");
            System.out.print("Lua chon cua ban: ");
            
            luaChon = scanner.nextInt();

            // Cau lenh switch-case phan nhanh menu
            switch (luaChon) {
                case 1:
                    System.out.println("\n--- NHAP LUONG NHAN VIEN (Nhap -1 de dung) ---");
                    
                    // Vong lap while(true) de nhap lien tuc
                    while (true) {
                        System.out.print("Nhap luong nhan vien (VND): ");
                        double luong = scanner.nextDouble();

                        // Cau lenh nhay break de dung nhap khi gap -1
                        if (luong == -1) {
                            System.out.println("-> Da dung qua trinh nhap luong.");
                            break;
                        }

                        // Kiem tra gia tri hop le (0 den 500 trieu)
                        if (luong < 0 || luong > 500000000) {
                            System.out.println("Canh bao: Luong phai tu 0 den 500.000.000 VND. Vui long nhap lai!");
                            continue; // Cau lenh nhay de bo qua, yeu cau nhap lai
                        }

                        // Phan loai thu nhap bang if-else
                        String phanLoai = "";
                        if (luong < 5000000) {
                            phanLoai = "Thu nhap thap";
                        } else if (luong >= 5000000 && luong < 15000000) {
                            phanLoai = "Thu nhap trung binh";
                        } else if (luong >= 15000000 && luong <= 50000000) {
                            phanLoai = "Thu nhap kha";
                        } else {
                            phanLoai = "Thu nhap cao";
                        }
                        System.out.println("-> Phan loai: " + phanLoai);

                        // Tinh toan tien thuong dua tren tung muc luong de cong don
                        double phanTramThuong = 0;
                        if (luong >= 0 && luong < 5000000) {
                            phanTramThuong = 0.05;
                        } else if (luong >= 5000000 && luong < 15000000) {
                            phanTramThuong = 0.10;
                        } else if (luong >= 15000000 && luong < 50000000) {
                            phanTramThuong = 0.15;
                        } else if (luong >= 50000000 && luong <= 100000000) {
                            phanTramThuong = 0.20;
                        } else {
                            phanTramThuong = 0.25;
                        }
                        tongThuong += luong * phanTramThuong;

                        // Cap nhat cac bien thong ke luong
                        tongSoNhanVien++;
                        tongLuong += luong;

                        if (luong > luongCaoNhat) {
                            luongCaoNhat = luong;
                        }
                        if (luong < luongThapNhat) {
                            luongThapNhat = luong;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- HIEN THI THONG KE ---");
                    if (tongSoNhanVien == 0) {
                        System.out.println("Chua co du lieu");
                    } else {
                        double luongTrungBinh = tongLuong / tongSoNhanVien;
                        System.out.printf("So nhan vien da nhap: %d\n", tongSoNhanVien);
                        System.out.printf("Luong trung binh:    %,.2f VND\n", luongTrungBinh);
                        System.out.printf("Luong cao nhat:     %,.2f VND\n", luongCaoNhat);
                        System.out.printf("Luong thap nhat:    %,.2f VND\n", luongThapNhat);
                        System.out.printf("Tong tien luong:    %,.2f VND\n", tongLuong);
                    }
                    break;

                case 3:
                    System.out.println("\n--- TONG SO TIEN THUONG CHO NHAN VIEN ---");
                    if (tongSoNhanVien == 0) {
                        System.out.println("Chua co du lieu de tinh thuong!");
                    } else {
                        System.out.printf("Tong so tien thuong cho tat ca nhan vien: %,.2f VND\n", tongThuong);
                    }
                    break;

                case 4:
                    System.out.println("Chuong trinh ket thuc. Tam biet!");
                    scanner.close();
                    System.exit(0); // Cau lenh nhay thoat chuong trinh
                    
                default:
                    System.out.println("Lua chon khong hop le! Vui long chon tu 1 den 4.");
                    break;
            }
        } while (luaChon != 4);
    }
}
