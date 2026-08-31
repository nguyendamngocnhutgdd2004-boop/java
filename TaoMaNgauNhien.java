import java.util.Random;
import java.util.Scanner;

public class TaoMaNgauNhien {
    public static void main(String[] args) {
        // 1. Khoi tao Scanner de nhap do dai n tu ban phim
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap do dai n (1 <= n <= 1000): ");
        int n = scanner.nextInt();

        // Kiem tra dieu kien dau vao cua n
        if (n < 1 || n > 1000) {
            System.out.println("Do dai n khong hop le!");
            scanner.close();
            return;
        }

        // 2. Tap hop cac ky tu cho phep: A-Z, a-z, 0-9
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        // 3. Su dung StringBuilder de xay dung chuoi ngau nhien dat hieu suat cao
        StringBuilder sb = new StringBuilder(n);
        Random random = new Random();

        // Vong lap chay n lan de lay ngau nhien n ky tu
        for (int i = 0; i < n; i++) {
            // Lay mot chi so ngau nhien tu 0 den do dai cua chuoi characters - 1
            int randomIndex = random.nextInt(characters.length());
            
            // Lay ky tu tai chi so do va them va StringBuilder
            char randomChar = characters.charAt(randomIndex);
            sb.append(randomChar);
        }

        // 4. In ket qua chuoi ngau nhien ra man hinh
        System.out.println("Chuoi ngau nhien tao ra la: " + sb.toString());

        // Dong scanner
        scanner.close();
    }
}
