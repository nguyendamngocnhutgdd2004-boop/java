// 1. Dinh nghia interface Colorable
interface Colorable {
    // Phuong thuc truu tuong thiet lap mau sac (Mac dinh la public abstract)
    void setColor(String color);
}

// 2. Lop Circle trien khai interface Colorable
class Circle implements Colorable {
    private double radius;
    private String color = "White"; // Mac dinh ban dau la mau trang

    public Circle(double radius) {
        this.radius = radius;
    }

    // Bat buoc ghi de phuong thuc cua interface Colorable
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("[Hinh Tron] Ban kinh: " + radius + " | Mau sac: " + color);
    }

    // Getter va Setter cho 'radius'
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
    public String getColor() { return color; }
}

// 3. Lop Rectangle trien khai interface Colorable
class Rectangle implements Colorable {
    private double length;
    private double width;
    private String color = "White"; // Mac dinh ban dau la mau trang

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Bat buoc ghi de phuong thuc cua interface Colorable
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("[Hinh Chu Nhat] Chieu dai: " + length + " | Chieu rong: " + width + " | Mau sac: " + color);
    }

    // Getter va Setter cho 'length' va 'width'
    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public String getColor() { return color; }
}

// 4. Lop Square trien khai interface Colorable
class Square implements Colorable {
    private double side;
    private String color = "White"; // Mac dinh ban dau la mau trang

    public Square(double side) {
        this.side = side;
    }

    // Bat buoc ghi de phuong thuc cua interface Colorable
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("[Hinh Vuong] Canh: " + side + " | Mau sac: " + color);
    }

    // Getter va Setter cho 'side'
    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }
    public String getColor() { return color; }
}

// 5. Lop chay chinh chua phuong thuc main (Da doi ten tu Main thanh QuanLyToMau)
public class QuanLyToMau {
    public static void main(String[] args) {
        // Khoi tao cac doi tuong hinh hoc cu the
        Circle tron = new Circle(5.5);
        Rectangle chuNhat = new Rectangle(4.0, 6.0);
        Square vuong = new Square(3.5);

        System.out.println("--- THONG TIN BAN DAU (MAC DINH) ---");
        tron.displayInfo();
        chuNhat.displayInfo();
        vuong.displayInfo();

        System.out.println("\n--- TIEN HANH TO MAU (DUNG INTERFACE) ---");
        // Goi phuong thuc tu interface Colorable de thiet lap mau sac moi
        tron.setColor("Red");
        chuNhat.setColor("Blue");
        vuong.setColor("Yellow");

        System.out.println("--- THONG TIN SAU KHI TO MAU ---");
        tron.displayInfo();
        chuNhat.displayInfo();
        vuong.displayInfo();
    }
}
