import java.util.Scanner;

public class ThayTheKyTuTrongChuoi {
    public static void main(String[] args) {
        // 1. Khoi tao Scanner de nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap vao mot chuoi: ");
        String input = scanner.nextLine();
        
        // 2. Thay the tat ca cac ky tu so (0-9) bang *
        // \\d dai dien cho cac chu so tu 0 den 9 trong Regular Expression
        String result = input.replaceAll("\\d", "*");
        
        // 3. In ket qua ra man hinh
        System.out.println("Chuoi sau khi thay the: " + result);
        
        // Dong scanner sau khi su dung xong
        scanner.close();
    }
}
