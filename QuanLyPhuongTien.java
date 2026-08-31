// 1. Lop truu tuong Vehicle
abstract class Vehicle {
    // Cac thuoc tinh cua phuong tien
    protected String name;
    protected int speed;

    // Constructor de khoi tao phuong tien
    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // Phuong thuc thong thuong (Concrete method)
    public void start() {
        System.out.println(name + " is starting...");
    }

    // Phuong thuc truu tuong (Abstract method) - Khong co than ham
    public abstract void displayInfo();

    // Cac phuong thuc Getter va Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }
}

// 2. Lop Car ke thua tu Vehicle
class Car extends Vehicle {
    
    // Constructor cho Car goi lai constructor cua Vehicle
    public Car(String name, int speed) {
        super(name, speed);
    }

    // Bat buoc phai ghi de (implement) phuong thuc truu tuong tu lop cha
    @Override
    public void displayInfo() {
        System.out.println("[Xe Hoi] Ten: " + name + " | Van toc toi da: " + speed + " km/h");
    }
}

// 3. Lop Bike ke thua tu Vehicle
class Bike extends Vehicle {
    
    // Constructor cho Bike goi lai constructor cua Vehicle
    public Bike(String name, int speed) {
        super(name, speed);
    }

    // Bat buoc phai ghi de (implement) phuong thuc truu tuong tu lop cha
    @Override
    public void displayInfo() {
        System.out.println("[Xe May] Ten: " + name + " | Van toc toi da: " + speed + " km/h");
    }
}

// 4. Lop chay chinh chua phuong thuc main (Da doi ten tu Main thanh QuanLyPhuongTien)
public class QuanLyPhuongTien {
    public static void main(String[] args) {
        System.out.println("--- KHOI TAO CAC PHUONG TIEN ---");
        // Khoi tao cac doi tuong tu lop con (Ap dung tinh da hinh)
        Vehicle myCar = new Car("Toyota Camry", 240);
        Vehicle myBike = new Bike("Honda Wave Alpha", 110);

        System.out.println("\n--- VAN HANH VA KIEM TRA PHUONG TIEN ---");
        
        // Kiem tra hanh vi cua Xe Hoi
        myCar.start();
        myCar.displayInfo();
        System.out.println();

        // Kiem tra hanh vi cua Xe May
        myBike.start();
        myBike.displayInfo();
    }
}
