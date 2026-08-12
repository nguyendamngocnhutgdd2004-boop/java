import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen N: ");
        int n = scanner.nextInt();

        // Neu so am thi chuyen thanh so duong
        int soDuong = Math.abs(n);

        int tong = 0;
        int temp = soDuong;

        while (temp > 0) {
            int chuSo = temp % 10; // lay chu so cuoi cung
            tong += chuSo;         // cong don vao tong
            temp = temp / 10;      // bo chu so cuoi, chuan bi lay chu so tiep theo
        }

        System.out.println("Tong cac chu so cua " + n + " la: " + tong);
    }
}