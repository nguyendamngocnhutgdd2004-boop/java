import java.util.Scanner;

public class QuanLyBienSoXe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] danhSachBienSo = null;
        int soLuong = 0;
        int luaChon;

        do {
            System.out.println("\n******************QUAN LY BIEN SO XE****************");
            System.out.println("1. Them cac bien so xe");
            System.out.println("2. Hien thi danh sach bien so xe");
            System.out.println("3. Tim kiem bien so xe");
            System.out.println("4. Tim bien so xe theo ma tinh");
            System.out.println("5. Sap xep bien so xe tang dan");
            System.out.println("6. Thoat");
            System.out.print("Lua chon cua ban: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Doc bo dong trong sau khi nhap so

            switch (luaChon) {
                case 1:
                    System.out.print("Nhap so luong bien so xe muon them: ");
                    soLuong = scanner.nextInt();
                    scanner.nextLine();
                    danhSachBienSo = new String[soLuong];
                    
                    // Regex kiem tra dinh dang bien so xe (VD: 30F-123.45)
                    // \\d{2}   : 2 chu so ma tinh
                    // [A-Z]    : 1 chu cai seri
                    // -        : Dau gach ngang
                    // \\d{3}   : 3 chu so
                    // \\.      : Dau cham
                    // \\d{2}   : 2 chu so cuoi
                    String bienSoRegex = "^\\d{2}[A-Z]-\\d{3}\\.\\d{2}$";

                    for (int i = 0; i < soLuong; i++) {
                        while (true) {
                            System.out.print("Nhap bien so xe thu " + (i + 1) + " (Dinh dang XXY-XXX.XX): ");
                            String input = scanner.nextLine().trim().toUpperCase();
                            
                            if (input.matches(bienSoRegex)) {
                                danhSachBienSo[i] = input;
                                break;
                            } else {
                                System.out.println("Sai dinh dang! Vi du dung: 30F-123.45. Vui long nhap lai.");
                            }
                        }
                    }
                    System.out.println("Them cac bien so xe thanh cong!");
                    break;

                case 2:
                    if (danhSachBienSo == null || soLuong == 0) {
                        System.out.println("Danh sach trong. Vui long them bien so truoc!");
                    } else {
                        System.out.println("--- DANH SACH BIEN SO XE ---");
                        for (int i = 0; i < soLuong; i++) {
                            System.out.println((i + 1) + ". " + danhSachBienSo[i]);
                        }
                    }
                    break;

                case 3:
                    if (danhSachBienSo == null || soLuong == 0) {
                        System.out.println("Danh sach trong!");
                    } else {
                        System.out.print("Nhap bien so xe can tim chinh xac: ");
                        String target = scanner.nextLine().trim().toUpperCase();
                        boolean timThay = false;

                        for (int i = 0; i < soLuong; i++) {
                            if (danhSachBienSo[i].equals(target)) {
                                System.out.println("Tim thay bien so '" + target + "' tai vi tri thu " + (i + 1));
                                timThay = true;
                                break;
                            }
                        }
                        if (!timThay) {
                            System.out.println("Khong tim thay bien so xe nay trong danh sach.");
                        }
                    }
                    break;

                case 4:
                    if (danhSachBienSo == null || soLuong == 0) {
                        System.out.println("Danh sach trong!");
                    } else {
                        System.out.print("Nhap ma tinh can tim (VD: 29, 30, 51): ");
                        String maTinh = scanner.nextLine().trim();
                        boolean coMaTinh = false;

                        System.out.println("--- Cac bien so xe thuoc ma tinh " + maTinh + " ---");
                        for (int i = 0; i < soLuong; i++) {
                            // Kiem tra xem bien so xe co bat dau bang ma tinh nhap vao khong
                            if (danhSachBienSo[i].startsWith(maTinh)) {
                                System.out.println(danhSachBienSo[i]);
                                coMaTinh = true;
                            }
                        }
                        if (!coMaTinh) {
                            System.out.println("Khong co bien so xe nao thuoc ma tinh nay.");
                        }
                    }
                    break;

                case 5:
                    if (danhSachBienSo == null || soLuong == 0) {
                        System.out.println("Danh sach trong!");
                    } else {
                        // Dung thuat toan Sap xep noi bot (Bubble Sort) va phuong thuc compareTo() cua String
                        for (int i = 0; i < soLuong - 1; i++) {
                            for (int j = 0; j < soLuong - i - 1; j++) {
                                if (danhSachBienSo[j].compareTo(danhSachBienSo[j + 1]) > 0) {
                                    String temp = danhSachBienSo[j];
                                    danhSachBienSo[j] = danhSachBienSo[j + 1];
                                    danhSachBienSo[j + 1] = temp;
                                }
                            }
                        }
                        System.out.println("Da sap xep bien so xe tang dan. Chon chuc nang 2 de kiem tra.");
                    }
                    break;

                case 6:
                    System.out.println("Da thoat chuong trinh. Tam biet!");
                    break;

                default:
                    System.out.println("Lua chon sai! Vui long chon lai tu 1 den 6.");
            }
        } while (luaChon != 6);

        scanner.close();
    }
}
