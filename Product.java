public class Product {
    private String id;
    private String name;
    private double price;

    // Constructor khong tham so
    public Product() {
    }

    // Constructor co tham so
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Phuong thuc hien thi thong tin san pham
    public void display() {
        System.out.println("ID: " + id + " | Ten: " + name + " | Gia: " + price);
    }

    // Cac phuong thuc Getter va Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
