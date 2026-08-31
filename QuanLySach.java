public class QuanLySach {
    public static void main(String[] args) {
        // 1. Khoi tao doi tuong Book ban dau
        System.out.println("--- Khoi tao quyen sach dau tien ---");
        Book book = new Book("Lap trinh Java", "Nguyen Van A", 150000);
        
        // Hien thi thong tin thong qua cac phuong thuc getter
        System.out.println("Ten sach: " + book.getTitle());
        System.out.println("Tac gia: " + book.getAuthor());
        System.out.println("Gia ban: " + book.getPrice());
        System.out.println();

        // 2. Thay doi gia sach hop le bang phuong thuc setter
        System.out.println("--- Cap nhat gia moi hop le ---");
        book.setPrice(180000);
        System.out.println("Gia ban moi: " + book.getPrice());
        System.out.println();

        // 3. Thu nghiem thay doi gia KHONG hop le (gia am)
        System.out.println("--- Thu nghiem nhap gia am (< 0) ---");
        book.setPrice(-50000); // He thong se tu dong bao loi va ngan chan
        System.out.println("Gia ban sau khi thu nghiem loi: " + book.getPrice());
    }
}
