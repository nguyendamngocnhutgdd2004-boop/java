import java.util.Scanner;

public class KiemTraDinhDangEmail {
    public static void main(String[] args) {
        // 1. Khoi tao Scanner de nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap vao dia chi email: ");
        String email = scanner.nextLine();
        
        // 2. Loai bo cac khoang trang thua o hai dau chuoi
        email = email.trim();
        
        // 3. Dinh nghia chuoi bieu thuc chinh quy (Regex) cho email
        // ^[a-zA-Z0-9._]+ : Username bat dau bang chu cai, so, dau cham, hoac gach duoi
        // @               : Bat buoc phai co ky tu @
        // [a-zA-Z0-9.]+   : Domain chua chu cai, so, hoac dau cham
        // \\.             : Bat buoc phai co dau cham truoc duoi mien (TLD)
        // [a-zA-Z]{2,6}$  : Duoi mien chi chua chu cai, do dai tu 2 den 6 ky tu
        String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}$";
        
        // 4. Kiem tra dinh dang va in ket qua
        if (email.matches(emailRegex)) {
            System.out.println("Email hop le");
        } else {
            System.out.println("Email khong hop le");
        }
        
        // Dong scanner
        scanner.close();
    }
}
