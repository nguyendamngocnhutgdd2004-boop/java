import java.util.Scanner;

public class baitap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap canh a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap canh b: ");
        int b = scanner.nextInt();
        System.out.print("Nhap canh c: ");
        int c = scanner.nextInt();

        // Kiem tra tam giac hop le: tong 2 canh bat ky phai lon hon canh con lai
        if (a + b > c && a + c > b && b + c > a) {
            // Tam giac hop le, tien hanh phan loai

            if (a == b && b == c) {
                System.out.println("Day la tam giac deu.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Day la tam giac can.");
            } else if (isVuong(a, b, c)) {
                System.out.println("Day la tam giac vuong.");
            } else {
                System.out.println("Day la tam giac thuong.");
            }

        } else {
            System.out.println("Ba canh khong tao thanh tam giac.");
        }

        scanner.close();
    }

    // Ham kiem tra tam giac vuong: binh phuong canh lon nhat = tong binh phuong hai canh con lai
    public static boolean isVuong(int a, int b, int c) {
        int aa = a * a;
        int bb = b * b;
        int cc = c * c;

        return (aa + bb == cc) || (aa + cc == bb) || (bb + cc == aa);
    }
}