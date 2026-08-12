import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        // Tao doi tuong Scanner de nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);

        // Khai bao cac bien kieu float theo dung yeu cau de bai
        float width, height, area, circumference;

        // Nhap chieu rong tu ban phim
        System.out.print("Nhap chieu rong (width): ");
        width = scanner.nextFloat();

        // Nhap chieu cao tu ban phim
        System.out.print("Nhap chieu cao (height): ");
        height = scanner.nextFloat();

        // Tinh dien tich: area = width * height
        area = width * height;

        // Tinh chu vi: circumference = 2 * (width + height)
        circumference = 2 * (width + height);

        // In ket qua dien tich va chu vi ra man hinh (lay 2 so sau dau phay)
        System.out.printf("Dien tich hinh chu nhat la: %.2f\n", area);
        System.out.printf("Chu vi hinh chu nhat la: %.2f\n", circumference);

    }
}
