public class Book {
    // Cac thuoc tinh private de thuc hien tinh bao dong
    private String title;
    private String author;
    private double price;

    // Constructor khong tham so
    public Book() {
    }

    // Constructor co tham so de khoi tao nhanh
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        setPrice(price); // Dung setter de kiem tra dieu kien gia ngay tu dau
    }

    // Getter va Setter cho 'title'
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter va Setter cho 'author'
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter cho 'price'
    public double getPrice() {
        return price;
    }

    // Setter cho 'price' co kiem tra logic du lieu
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Loi: Gia sach khong duoc am (< 0). Giu nguyen gia cu: " + this.price);
        }
    }
}
