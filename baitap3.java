import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        // Tao doi tuong Scanner de nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);

        // Nhap ban kinh tu nguoi dung
        System.out.print("Nhap ban kinh hinh tron: ");
        double banKinh = scanner.nextDouble();

        // Tinh dien tich theo cong thuc: Dien tich = PI * banKinh * banKinh
        // Trong do Math.PI la so PI (3.14159...) co san trong Java
        double dienTich = Math.PI * banKinh * banKinh;

        // In ket qua ra man hinh lay 2 so sau dau phay
        System.out.printf("Dien tich hinh tron la: %.2f\n", dienTich);
    }
}
