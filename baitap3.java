import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        // Tao doi tuong Scanner de nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);

        // Nhap so nguyen duong N tu nguoi dung
        System.out.print("Nhap mot so nguyen duong N: ");
        int n = scanner.nextInt();

        // Kiem tra dieu kien hop le cua N (N phai lon hon 0)
        if (n <= 0) {
            System.out.println("So nhap vao khong hop le");
        } else {
            // Khai bao bien de luu tru gia tri tong cong don
            int tong = 0;

            // Su dung vong lap for de chay tu 1 den N
            for (int i = 1; i <= n; i++) {
                tong = tong + i; // Cong don gia tri cua i vao bien tong
            }

            // In ket qua tong ra man hinh
            System.out.printf("Tong cac so tu 1 den %d la: %d\n", n, tong);
        }
    }
}
