import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyDanhMuc {
    public static void main(String[] args) {
        ArrayList<Category> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Them san danh muc mau de tien kiem thu
        list.add(new Category("C01", "Dien tu", "Cac thiet bi cong nghe, linh kien"));
        list.add(new Category("C02", "Thoi trang", "Quan ao, giay dep nam nu"));

        while (true) {
            System.out.println("\n===== MENU QUAN LY DANH MUC =====");
            System.out.println("1. Them moi danh muc");
            System.out.println("2. Hien thi danh sach danh muc");
            System.out.println("3. Cap nhat danh muc theo ID");
            System.out.println("4. Xoa danh muc theo ID");
            System.out.println("5. Tim kiem danh muc theo ten");
            System.out.println("6. Thoat chuong trinh");
            System.out.print("Nhap lua chon cua ban (1-6): ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Xoa bo nho dem sau khi nhap so

            switch (choice) {
                case 1:
                    System.out.println("\n--- THEM MOI DANH MUC ---");
                    System.out.print("Nhap ID danh muc: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhap ten danh muc: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhap mo ta danh muc: ");
                    String description = scanner.nextLine();
                    
                    list.add(new Category(id, name, description));
                    System.out.println("Them danh muc thanh cong!");
                    break;

                case 2:
                    System.out.println("\n--- DANH SACH DANH MUC ---");
                    if (list.isEmpty()) {
                        System.out.println("Danh sach hien tai dang trong.");
                    } else {
                        for (Category c : list) {
                            c.display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- CAP NHAT DANH MUC ---");
                    System.out.print("Nhap ID danh muc can sua: ");
                    String updateId = scanner.nextLine();
                    boolean isFoundUpdate = false;

                    for (Category c : list) {
                        if (c.getId().equalsIgnoreCase(updateId)) {
                            System.out.print("Nhap ten moi: ");
                            String newName = scanner.nextLine();
                            System.out.print("Nhap mo ta moi: ");
                            String newDescription = scanner.nextLine();
                            
                            c.setName(newName);
                            c.setDescription(newDescription);
                            System.out.println("Cap nhat thong tin thanh cong!");
                            isFoundUpdate = true;
                            break;
                        }
                    }
                    if (!isFoundUpdate) {
                        System.out.println("Khong tim thay danh muc co ID: " + updateId);
                    }
                    break;

                case 4:
                    System.out.println("\n--- XOA DANH MUC ---");
                    System.out.print("Nhap ID danh muc can xoa: ");
                    String deleteId = scanner.nextLine();
                    boolean isFoundDelete = false;

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getId().equalsIgnoreCase(deleteId)) {
                            list.remove(i);
                            System.out.println("Xoa danh muc thanh cong!");
                            isFoundDelete = true;
                            break;
                        }
                    }
                    if (!isFoundDelete) {
                        System.out.println("Khong tim thay danh muc co ID: " + deleteId);
                    }
                    break;

                case 5:
                    System.out.println("\n--- TIM KIEM DANH MUC THEO TEN ---");
                    System.out.print("Nhap tu khoa ten danh muc can tim: ");
                    String searchName = scanner.nextLine();
                    boolean isFoundSearch = false;

                    for (Category c : list) {
                        // Dung toLowerCase() va contains() de tim kiem gan dung, khong phan biet hoa thuong
                        if (c.getName().toLowerCase().contains(searchName.toLowerCase())) {
                            c.display();
                            isFoundSearch = true;
                        }
                    }
                    if (!isFoundSearch) {
                        System.out.println("Khong tim thay danh muc nao khop voi ten: " + searchName);
                    }
                    break;

                case 6:
                    System.out.println("Cam on ban da su dung chuong trinh. Tam biet!");
                    scanner.close();
                    System.exit(0); // Thoat chuong trinh hoan toan

                default:
                    System.out.println("Lua chon khong hop le! Vui long nhap lai tu 1 den 6.");
            }
        }
    }
}
