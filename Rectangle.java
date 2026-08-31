public class Rectangle {
    // 1. Cac thuoc tinh (Fields)
    private double length;
    private double width;

    // 2. Constructor mac dinh (Khong tham so)
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // 3. Constructor co tham so
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 4. Phuong thuc tinh dien tich
    public double getArea() {
        return this.length * this.width;
    }

    // 5. Phuong thuc tinh chu vi
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    // 6. Phuong thuc hien thi thong tin
    public void display() {
        System.out.println("--- Thong tin Hinh Chu Nhat ---");
        System.out.println("Chieu dai: " + this.length);
        System.out.println("Chieu rong: " + this.width);
        System.out.println("Dien tich: " + this.getArea());
        System.out.println("Chu vi: " + this.getPerimeter());
        System.out.println();
    }

    // 7. Phuong thuc main de kiem tra logic
    public static void main(String[] args) {
        // Tao doi tuong bang constructor mac dinh
        System.out.println("Tao hcn1 bang constructor mac dinh:");
        Rectangle hcn1 = new Rectangle();
        hcn1.display();

        // Tao doi tuong bang constructor co tham so
        System.out.println("Tao hcn2 bang constructor co tham so (5.5, 3.2):");
        Rectangle hcn2 = new Rectangle(5.5, 3.2);
        hcn2.display();
    }
}
