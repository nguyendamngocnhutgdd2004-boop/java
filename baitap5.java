import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap thang (1-12): ");
        int thang = scanner.nextInt();

        System.out.print("Nhap nam (de kiem tra nam nhuan cho thang 2): ");
        int nam = scanner.nextInt();

        String tenThang;
        int soNgay;

        switch (thang) {
            case 1:
                tenThang = "Thang 1";
                soNgay = 31;
                break;
            case 2:
                tenThang = "Thang 2";
                // kiem tra nam nhuan
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                    soNgay = 29;
                } else {
                    soNgay = 28;
                }
                break;
            case 3:
                tenThang = "Thang 3";
                soNgay = 31;
                break;
            case 4:
                tenThang = "Thang 4";
                soNgay = 30;
                break;
            case 5:
                tenThang = "Thang 5";
                soNgay = 31;
                break;
            case 6:
                tenThang = "Thang 6";
                soNgay = 30;
                break;
            case 7:
                tenThang = "Thang 7";
                soNgay = 31;
                break;
            case 8:
                tenThang = "Thang 8";
                soNgay = 31;
                break;
            case 9:
                tenThang = "Thang 9";
                soNgay = 30;
                break;
            case 10:
                tenThang = "Thang 10";
                soNgay = 31;
                break;
            case 11:
                tenThang = "Thang 11";
                soNgay = 30;
                break;
            case 12:
                tenThang = "Thang 12";
                soNgay = 31;
                break;
            default:
                System.out.println("Thang khong hop le.");
                scanner.close();
                return; // ket thuc chuong trinh vi khong co thang hop le
        }

        System.out.println(tenThang + " co " + soNgay + " ngay.");
    }
}