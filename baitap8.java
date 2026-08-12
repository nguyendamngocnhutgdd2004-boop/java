import java.util.Scanner;

public class baitap8 {

    // Mang chua ten cac chu so tu 0 den 9
    static String[] chuSo = {
        "khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen tu 100 den 999: ");
        int n = scanner.nextInt();

        if (n < 100 || n > 999) {
            System.out.println("So nhap vao khong hop le");
        } else {
            // Tach so thanh 3 chu so
            int hundreds = n / 100;        // hang tram
            int tens = (n / 10) % 10;      // hang chuc
            int units = n % 10;            // hang don vi

            String ketQua = docSo(hundreds, tens, units);
            System.out.println("Ket qua: " + ketQua);
        }

        scanner.close();
    }

    public static String docSo(int hundreds, int tens, int units) {
        StringBuilder sb = new StringBuilder();

        // Doc hang tram (luon co vi so tu 100-999)
        sb.append(chuSo[hundreds]).append(" tram");

        // Xu ly hang chuc va hang don vi
        if (tens == 0 && units == 0) {
            // Vi du: 100 -> "mot tram"
            // khong them gi ca
        } else if (tens == 0 && units != 0) {
            // Vi du: 105 -> "mot tram linh nam"
            sb.append(" linh ").append(chuSo[units]);
        } else if (tens == 1) {
            // Vi du: 110 -> "mot tram muoi"
            sb.append(" muoi");
            if (units == 5) {
                sb.append(" lam"); // 115 -> "mot tram muoi lam"
            } else if (units != 0) {
                sb.append(" ").append(chuSo[units]); // 111 -> "mot tram muoi mot"
            }
        } else {
            // tens tu 2 den 9
            sb.append(" ").append(chuSo[tens]).append(" muoi");
            if (units == 1) {
                sb.append(" mot"); // co the doc la "mot" hoac "mot" tuy vung mien, giu don gian la "mot"
            } else if (units == 5) {
                sb.append(" lam"); // Vi du: 125 -> "mot tram hai muoi lam"
            } else if (units != 0) {
                sb.append(" ").append(chuSo[units]); // Vi du: 123 -> "mot tram hai muoi ba"
            }
        }

        return sb.toString();
    }
}