import java.util.Scanner;

public class KiemTraMatKhau {
    public static void main(String[] args) {
        // 1. Khoi tao Scanner de nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap vao mat khau can kiem tra: ");
        String password = scanner.nextLine();
        
        // 2. Dinh nghia bieu thuc chinh quy (Regex) kiem tra mat khau
        // (?=.*[A-Z])   : Co it nhat mot chu cai viet hoa
        // (?=.*[a-z])   : Co it nhat mot chu cai viet thuong
        // (?=.*[0-9])   : Co it nhat mot ky tu so
        // (?=.*[@#$%!]) : Co it nhat mot ky tu dac biet trong tap hop [@, #, $, %, !]
        // .{8,}         : Do dai it nhat 8 ky tu ban ky
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$";
        
        // 3. Kiem tra tinh hop le va in ket qua
        if (password.matches(passwordRegex)) {
            System.out.println("Mat khau hop le");
        } else {
            System.out.println("Mat khau khong hop le");
        }
        
        // Dong scanner
        scanner.close();
    }
}
