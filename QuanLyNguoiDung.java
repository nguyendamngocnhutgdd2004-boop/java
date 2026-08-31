import java.util.Scanner;

public class QuanLyNguoiDung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Bien luu tru thong tin nguoi dung
        String hoTen = "";
        String email = "";
        String soDienThoai = "";
        String matKhau = "";
        
        int luaChon;

        do {
            System.out.println("\n******************QUAN LY NGUOI DUNG****************");
            System.out.println("1. Nhap thong tin nguoi dung");
            System.out.println("2. Chuan hoa ho ten");
            System.out.println("3. Kiem tra email hop le");
            System.out.println("4. Kiem tra so dien thoai hop le");
            System.out.println("5. Kiem tra mat khau hop le");
            System.out.println("6. Thoat");
            System.out.print("Lua chon cua ban: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Doc bo dong trong sau khi nhap so

            switch (luaChon) {
                case 1:
                    System.out.print("Nhap ho va ten: ");
                    hoTen = scanner.nextLine();
                    System.out.print("Nhap email: ");
                    email = scanner.nextLine();
                    System.out.print("Nhap so dien thoai: ");
                    soDienThoai = scanner.nextLine();
                    System.out.print("Nhap mat khau: ");
                    matKhau = scanner.nextLine();
                    System.out.println("Nhap thong tin thanh cong!");
                    break;

                case 2:
                    if (hoTen.isEmpty()) {
                        System.out.println("Chua co thong tin ho ten. Vui long nhap chuc nang 1!");
                    } else {
                        // Xoa khoang trang thua va cat chuoi thanh cac tu
                        String[] words = hoTen.trim().split("\\s+");
                        StringBuilder sb = new StringBuilder();
                        
                        for (String word : words) {
                            if (!word.isEmpty()) {
                                // Viet hoa chu cai dau, viet thuong cac chu cai sau
                                String firstChar = word.substring(0, 1).toUpperCase();
                                String remainingChars = word.substring(1).toLowerCase();
                                sb.append(firstChar).append(remainingChars).append(" ");
                            }
                        }
                        hoTen = sb.toString().trim(); // Cap nhat lai ho ten da chuan hoa
                        System.out.println("Ho ten sau khi chuan hoa: " + hoTen);
                    }
                    break;

                case 3:
                    if (email.isEmpty()) {
                        System.out.println("Chua co thong tin email!");
                    } else {
                        String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}$";
                        if (email.trim().matches(emailRegex)) {
                            System.out.println("Email '" + email + "' HOP LE.");
                        } else {
                            System.out.println("Email '" + email + "' KHONG HOP LE!");
                        }
                    }
                    break;

                case 4:
                    if (soDienThoai.isEmpty()) {
                        System.out.println("Chua co thong tin so dien thoai!");
                    } else {
                        // Regex SDT Viet Nam: Bat dau bang 0, theo sau la cac dau 3, 5, 7, 8, 9 va co 8 so tiep theo
                        String sdtRegex = "^0[35789][0-9]{8}$";
                        if (soDienThoai.trim().matches(sdtRegex)) {
                            System.out.println("So dien thoai '" + soDienThoai + "' HOP LE.");
                        } else {
                            System.out.println("So dien thoai '" + soDienThoai + "' KHONG HOP LE!");
                        }
                    }
                    break;

                case 5:
                    if (matKhau.isEmpty()) {
                        System.out.println("Chua co thong tin mat khau!");
                    } else {
                        String passRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!^&*()_+\\-=\\[\\]{};':\",./<>?]).{8,}$";
                        if (matKhau.matches(passRegex)) {
                            System.out.println("Mat khau HOP LE.");
                        } else {
                            System.out.println("Mat khau KHONG HOP LE! (Phai co it nhat 8 ky tu, gom chu hoa, chu thuong, so va ky tu dac biet)");
                        }
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
