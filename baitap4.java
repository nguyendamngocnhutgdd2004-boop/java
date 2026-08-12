public class baitap4 {
    public static void main(String[] args) {
        // Khai bao va khoi tao gia tri bat ky cho hai so nguyen a va b
        int a = 15;
        int b = 4;

        // Thuc hien cac phep toan so hoc
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = a / b;       // Chia lay phan nguyen
        int phanDu = a % b;      // Chia lay phan du

        // In gia tri cua a, b va ket qua cac phep tinh ra man hinh
        System.out.printf("Gia tri cua a = %d, b = %d\n", a, b);
        System.out.printf("Tong cua a va b la: %d\n", tong);
        System.out.printf("Hieu cua a va b la: %d\n", hieu);
        System.out.printf("Tich cua a va b la: %d\n", tich);
        System.out.printf("Thuong cua a chia cho b la: %d\n", thuong);
        System.out.printf("Phan du khi chia a cho b la: %d\n", phanDu);
    }
}
