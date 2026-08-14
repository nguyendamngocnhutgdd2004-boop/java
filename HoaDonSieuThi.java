import java.util.Scanner;

public class HoaDonSieuThi {
    public static void main(String[] args) {
        // 1. Khai bao Bo quet du lieu (Scanner)
        Scanner scanner = new Scanner(System.in);

        // 2. Nhap du lieu tu ban phim
        System.out.print("Nhap ten khach hang: ");
        String tenKhachHang = scanner.nextLine();

        System.out.print("Nhap ten san pham: ");
        String tenSanPham = scanner.nextLine();

        System.out.print("Nhap gia san pham: ");
        double giaSanPham = scanner.nextDouble();

        System.out.print("Nhap so luong mua: ");
        int soLuong = scanner.nextInt();

        System.out.print("Khach co the thanh vien khong? (true/false): ");
        boolean laThanhVien = scanner.nextBoolean();

        // 3. Tinh toan hoa don
        double thanhTien = giaSanPham * soLuong;
        
        // Neu la thanh vien thi giam gia 10%
        double giamGia = laThanhVien ? thanhTien * 0.10 : 0.0;
        
        // Tinh VAT 8% tren so tien sau khi giam
        double thueVAT = (thanhTien - giamGia) * 0.08;
        
        // Tong thanh toan theo cong thuc
        double tongThanhToan = thanhTien - giamGia + thueVAT;

        // 4. In hoa don ra man hinh
        System.out.println("\n==========================================");
        System.out.println("             HOA DON SIEU THI             ");
        System.out.println("==========================================");
        System.out.printf("Khach hang:      %s\n", tenKhachHang);
        System.out.printf("San pham:        %s\n", tenSanPham);
        System.out.printf("So luong:        %d\n", soLuong);
        System.out.printf("Don gia:         %,.2f VND\n", giaSanPham);
        System.out.println("------------------------------------------");
        System.out.printf("Thanh tien:      %,.2f VND\n", thanhTien);
        System.out.printf("Giam gia (10%%):  %,.2f VND\n", giamGia);
        System.out.printf("Tien VAT (8%%):   %,.2f VND\n", thueVAT);
        System.out.println("------------------------------------------");
        System.out.printf("TONG THANH TOAN: %,.2f VND\n", tongThanhToan);
        System.out.println("==========================================");

    }
}
