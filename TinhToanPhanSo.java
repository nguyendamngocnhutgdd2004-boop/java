public class TinhToanPhanSo { // Da doi ten tu Main thanh TinhToanPhanSo
    public static void main(String[] args) {
        try {
            // Khoi tao 2 phan so dau vao
            Fraction f1 = new Fraction(1, 2);  // Phan so 1/2
            Fraction f2 = new Fraction(3, 4);  // Phan so 3/4

            System.out.println("Phan so thu nhat (f1): " + f1);
            System.out.println("Phan so thu hai (f2): " + f2);
            System.out.println("--------------------------------");

            // Thuc hien cac phep toan va in ket qua da rut gon
            Fraction sum = f1.add(f2);
            System.out.println("Ket qua phep Cong (f1 + f2) = " + sum);

            Fraction diff = f1.subtract(f2);
            System.out.println("Ket qua phep Tru (f1 - f2)  = " + diff);

            Fraction prod = f1.multiply(f2);
            System.out.println("Ket qua phep Nhan (f1 * f2) = " + prod);

            Fraction quot = f1.divide(f2);
            System.out.println("Ket qua phep Chia (f1 / f2) = " + quot);

            // Thu nghiem khoi tao loi de kiem tra tinh bat loi (Ngoai le)
            System.out.println("\n--- Thu nghiem khoi tao phan so mau so = 0 ---");
            Fraction errorFraction = new Fraction(5, 0);

        } catch (IllegalArgumentException e) {
            // Bat va hien thi thong bao loi mau so = 0
            System.out.println(e.getMessage());
        }
    }
}
