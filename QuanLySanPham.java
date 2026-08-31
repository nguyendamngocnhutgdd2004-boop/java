import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySanPham {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Them san pham mau de tien kiem thu
        list.add(new Product("P01", "Dien thoai iPhone", 25000000));
        list.add(new Product("P02", "Laptop Dell", 18500000));

        while (true) {
            System.out.println("\n===== MENU QUAN LY SAN PHAM =====");
            System.out.println("1. Them moi san pham");
            System.out.println("2. Hien thi danh sach san pham");
            System.out.println("3. Cap nhat san pham theo ID");
            System.out.println("4. Xoa san pham theo ID");
            System.out.println("5. Thoat chuong trinh");
            System.out.print("Nhap lua chon cua ban (1-5): ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Xoa bo nho dem sau khi nhap so

            switch (choice) {
                case 1:
                    System.out.println("\n--- THEM MOI SAN PHAM ---");
                    System.out.print("Nhap ID san pham: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhap ten san pham: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhap gia san pham: ");
                    double price = scanner.nextDouble();
                    
                    list.add(new Product(id, name, price));
                    System.out.println("Them san pham thanh cong!");
                    break;

                case 2:
                    System.out.println("\n--- DANH SACH SAN PHAM ---");
                    if (list.isEmpty()) {
                        System.out.println("Danh sach hien tai dang trong.");
                    } else {
                        for (Product p : list) {
                            p.display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- CAP NHAT SAN PHAM ---");
                    System.out.print("Nhap ID san pham can sua: ");
                    String updateId = scanner.nextLine();
                    boolean isFoundUpdate = false;

                    for (Product p : list) {
                        if (p.getId().equalsIgnoreCase(updateId)) {
                            System.out.print("Nhap ten moi: ");
                            String newName = scanner.nextLine();
                            System.out.print("Nhap gia moi: ");
                            double newPrice = scanner.nextDouble();
                            
                            p.setName(newName);
                            p.setPrice(newPrice);
                            System.out.println("Cap nhat thong tin thanh cong!");
                            isFoundUpdate = true;
                            break;
                        }
                    }
                    if (!isFoundUpdate) {
                        System.out.println("Khong tim thay san pham co ID: " + updateId);
                    }
                    break;

                case 4:
                    System.out.println("\n--- XOA SAN PHAM ---");
                    System.out.print("Nhap ID san pham can xoa: ");
                    String deleteId = scanner.nextLine();
                    boolean isFoundDelete = false;

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getId().equalsIgnoreCase(deleteId)) {
                            list.remove(i);
                            System.out.println("Xoa san pham thanh cong!");
                            isFoundDelete = true;
                            break;
                        }
                    }
                    if (!isFoundDelete) {
                        System.out.println("Khong tim thay san pham co ID: " + deleteId);
                    }
                    break;

                case 5:
                    System.out.println("Cam on ban da su dung chuong trinh. Tam biet!");
                    scanner.close();
                    System.exit(0); // Thoat chuong trinh hoan toan

                default:
                    System.out.println("Lua chon khong hop le! Vui long nhap lai tu 1 den 5.");
            }
        }
    }
}
