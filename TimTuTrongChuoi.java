import java.util.Scanner;

public class TimTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhap chuoi van ban goc tu nguoi dung
        System.out.print("Nhap vao chuoi van ban: ");
        String chuoiGoc = scanner.nextLine();

        // 2. Nhap tu hoac cum tu can tim kiem
        System.out.print("Nhap vao tu can tim: ");
        String tuCanTim = scanner.nextLine();

        // Kiem tra neu nguoi dung nhap rong thi dung chuong trinh
        if (chuoiGoc.trim().isEmpty() || tuCanTim.trim().isEmpty()) {
            System.out.println("Chuoi van ban hoac tu can tim khong duoc de trong!");
            scanner.close();
            return;
        }

        // 3. Xu ly tim kiem bang phuong thuc indexOf()
        // indexOf() tra ve chi so (index) dau tien tim thay, neu khong thay se tra ve -1
        int viTri = chuoiGoc.indexOf(tuCanTim);

        // 4. In ket qua ra man hinh theo cac test case
        System.out.println("\n---------------- KET QUA TIM KIEM ----------------");
        if (viTri != -1) {
            System.out.printf("Tu \"%s\" co xuat hien trong chuoi.\n", tuCanTim);
            System.out.printf("Vi tri (index) dau tien cua tu trong chuoi la: %d\n", viTri);
        } else {
            System.out.printf("Tu \"%s\" khong xuat hien trong chuoi van ban.\n", tuCanTim);
        }
        System.out.println("--------------------------------------------------");

        scanner.close();
    }
}
