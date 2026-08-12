import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        // Tao doi tuong Scanner de nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);

        // Nhap phan so thu nhat (tu1/mau1)
        System.out.print("Nhap tu so cua phan so thu nhat: ");
        int tu1 = scanner.nextInt();
        System.out.print("Nhap mau so cua phan so thu nhat: ");
        int mau1 = scanner.nextInt();

        // Nhap phan so thu hai (tu2/mau2)
        System.out.print("Nhap tu so cua phan so thu hai: ");
        int tu2 = scanner.nextInt();
        System.out.print("Nhap mau so cua phan so thu hai: ");
        int mau2 = scanner.nextInt();

        // Tinh tong hai phan so theo cong thuc quy dong
        // Tu so moi = tu1 * mau2 + tu2 * mau1
        // Mau so moi = mau1 * mau2
        int tuTong = tu1 * mau2 + tu2 * mau1;
        int mauTong = mau1 * mau2;

        // In ket qua ra man hinh duoi dang phan so (a/b)
        System.out.printf("Tong hai phan so la: %d/%d\n", tuTong, mauTong);

    }
}
