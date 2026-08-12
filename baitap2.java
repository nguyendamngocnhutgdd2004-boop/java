import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        // Tao doi tuong Scanner de nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);

        // Nhap so nguyen tu nguoi dung
        System.out.print("Nhap mot so nguyen (1-7): ");
        int ngay = scanner.nextInt();

        // Su dung cau lenh switch-case de kiem tra gia tri
        switch (ngay) {
            case 1:
                System.out.println("Chu nhat");
                break;
            case 2:
                System.out.println("Thu hai");
                break;
            case 3:
                System.out.println("Thu ba");
                break;
            case 4:
                System.out.println("Thu tu");
                break;
            case 5:
                System.out.println("Thu nam");
                break;
            case 6:
                System.out.println("Thu sau");
                break;
            case 7:
                System.out.println("Thu bay");
                break;
            default:
                // Xu ly cac truong hop gia tri nam ngoai khoang 1 den 7
                System.out.println("So nhap vao khong hop le");
                break;
        }
    }
}
