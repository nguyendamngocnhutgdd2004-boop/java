import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        // Tao doi tuong Scanner de nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);

        // Nhap so nguyen n tu nguoi dung
        System.out.print("Nhap mot so nguyen n: ");
        int n = scanner.nextInt();

        // Su dung cau lenh if-else de kiem tra cac dieu kien theo yeu cau
        if (n == 0) {
            // Truong hop so nhap vao la 0
            System.out.println("So khong phai chan cung khong phai le");
        } else if (n % 2 == 0) {
            // Truong hop so chia het cho 2 (so chan)
            System.out.printf("So %d la so chan\n", n);
        } else {
            // Truong hop con lai (so le)
            System.out.printf("So %d la so le\n", n);
        }
    }
}
