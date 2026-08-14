import java.util.Scanner;

public class QuanLyDiem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Cac bien luu tru thong ke toan cuc
        int tongSoHocVien = 0;
        double tongDiem = 0;
        double diemCaoNhat = -1; 
        double diemThapNhat = 11; // Khoi tao gia tri lon hon diem toi da de de so sanh
        
        int luaChon = 0;

        // Su dung vong lap do-while de duy tri menu cho den khi nguoi dung chon thoat
        do {
            System.out.println("\n***************MENU NHAP DIEM***************");
            System.out.println("1. Nhap diem hoc vien");
            System.out.println("2. Hien thi thong ke");
            System.out.println("3. Thoat");
            System.out.print("Lua chon cua ban: ");
            
            luaChon = scanner.nextInt();

            // Su dung switch-case de xu ly lua chon tu menu
            switch (luaChon) {
                case 1:
                    System.out.println("\n--- NHAP DIEM HOC VIEN (Nhap -1 de dung) ---");
                    
                    // Su dung vong lap while de nhap diem lien tuc
                    while (true) {
                        System.out.print("Nhap diem cua hoc vien tiep theo: ");
                        double diem = scanner.nextDouble();

                        // Cau lenh nhay break de dung nhap khi gap -1
                        if (diem == -1) {
                            System.out.println("-> Da dung qua trinh nhap diem.");
                            break; 
                        }

                        // Kiem tra dieu kien diem hop le (0 den 10)
                        if (diem < 0 || diem > 10) {
                            System.out.println("Canh bao: Diem phai trong khoang tu 0 den 10. Vui long nhap lai!");
                            continue; // Cau lenh nhay luot qua phan con lai de nhap lai
                        }

                        // Phau loai hoc luc bang cau lenh dieu kien if-else
                        String xepLoai = "";
                        if (diem >= 0 && diem < 5) {
                            xepLoai = "Yeu";
                        } else if (diem >= 5 && diem < 7) {
                            xepLoai = "Trung Binh";
                        } else if (diem >= 7 && diem < 8) {
                            xepLoai = "Kha";
                        } else if (diem >= 8 && diem < 9) {
                            xepLoai = "Gioi";
                        } else {
                            xepLoai = "Xuat sac";
                        }
                        System.out.println("-> Xep loai hoc luc: " + xepLoai);

                        // Cap nhat du lieu thong ke
                        tongSoHocVien++;
                        tongDiem += diem;

                        if (diem > diemCaoNhat) {
                            diemCaoNhat = diem;
                        }
                        if (diem < diemThapNhat) {
                            diemThapNhat = diem;
                        }
                    }
                    break; // break cua switch-case

                case 2:
                    System.out.println("\n--- HIEN THI THONG KE ---");
                    // Cau lenh dieu kien kiem tra du lieu da co hay chua
                    if (tongSoHocVien == 0) {
                        System.out.println("Chua co du lieu");
                    } else {
                        double diemTrungBinh = tongDiem / tongSoHocVien;
                        System.out.printf("So hoc vien da nhap: %d\n", tongSoHocVien);
                        System.out.printf("Diem trung binh:    %,.2f\n", diemTrungBinh);
                        System.out.printf("Diem cao nhat:     %,.2f\n", diemCaoNhat);
                        System.out.printf("Diem thap nhat:    %,.2f\n", diemThapNhat);
                    }
                    break;

                case 3:
                    System.out.println("Chuong trinh ket thuc. Tam biet!");
                    scanner.close();
                    System.exit(0); // Cau lenh nhay thoat chuong trinh lap tuc
                    
                default:
                    System.out.println("Lua chon khong hop le! Vui long chon tu 1 den 3.");
                    break;
            }
        } while (luaChon != 3);
    }
}
