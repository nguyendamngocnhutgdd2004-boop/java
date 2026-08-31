import java.util.Scanner;

// 1. Lop Category represent mot danh muc
class Category {
    private int id;
    private String name;
    private String description;

    // Constructor khong tham so
    public Category() {
    }

    // Constructor full tham so
    public Category(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Cac phuong thuc getter va setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}

// 2. Interface ICRUD dinh nghia cac phuong thuc CRUD bang mang phan tu
interface ICRUD {
    Category[] findAll();
    void addCategory(Category category);
    void updateCategory(Category category);
    void deleteById(int id);
}

// 3. Lop CategoryManagement thuc thi interface ICRUD dung mang co dinh
class CategoryManagement implements ICRUD {
    // Thuoc tinh mang danh sach co dinh chua toi da 100 danh muc
    private Category[] categories = new Category[100];
    private int size = 0; // Bien theo doi so luong danh muc thuc te dang co

    // Tra ve mang danh sach cac danh muc hien co (loai bo phan tu null)
    @Override
    public Category[] findAll() {
        Category[] currentList = new Category[size];
        for (int i = 0; i < size; i++) {
            currentList[i] = categories[i];
        }
        return currentList;
    }

    // Them mot danh muc moi vao mang
    @Override
    public void addCategory(Category category) {
        if (size < categories.length) {
            categories[size] = category;
            size++;
            System.out.println("Them danh muc thanh cong!");
        } else {
            System.out.println("Loi: Bo nho mang da day, khong the them!");
        }
    }

    // Cap nhat mot danh muc da ton tai dua vao ID
    @Override
    public void updateCategory(Category category) {
        boolean isFound = false;
        for (int i = 0; i < size; i++) {
            if (categories[i].getId() == category.getId()) {
                categories[i].setName(category.getName());
                categories[i].setDescription(category.getDescription());
                System.out.println("Cap nhat danh muc thanh cong!");
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Khong tim thay danh muc co ID: " + category.getId());
        }
    }

    // Xoa danh muc khoi mang theo ID va don dich phan tu xuong
    @Override
    public void deleteById(int id) {
        int indexFound = -1;
        for (int i = 0; i < size; i++) {
            if (categories[i].getId() == id) {
                indexFound = i;
                break;
            }
        }

        if (indexFound != -1) {
            // Thuc hien ghi de va don dich cac phan tu phia sau len
            for (int i = indexFound; i < size - 1; i++) {
                categories[i] = categories[i + 1];
            }
            categories[size - 1] = null; // Xoa phan tu cuoi cung du thua
            size--;
            System.out.println("Xoa danh muc thanh cong!");
        } else {
            System.out.println("Khong tim thay danh muc co ID: " + id);
        }
    }
    
    // Ham ho tro kiem tra trung lap ID
    public boolean checkIdExisted(int id) {
        for (int i = 0; i < size; i++) {
            if (categories[i].getId() == id) {
                return true;
            }
        }
        return false;
    }
}

// 4. Lop chay chinh (Da doi ten tu Main thanh QuanLyDanhMucGiaoDien)
public class QuanLyDanhMucGiaoDien {
    public static void main(String[] args) {
        CategoryManagement management = new CategoryManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Them truoc 2 danh muc gia lap de tien kiem thu
        management.addCategory(new Category(1, "Dien tu", "Do cong nghe"));
        management.addCategory(new Category(2, "Gia dung", "Thiet bi nha bep"));

        while (true) {
            System.out.println("\n===== CHUONG TRINH QUAN LY DANH MUC =====");
            System.out.println("1. Them danh muc moi");
            System.out.println("2. Hien thi tat ca danh muc");
            System.out.println("3. Cap nhat danh muc");
            System.out.println("4. Xoa danh muc");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon cua ban (1-5): ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Xoa bo nho dem sau khi nhap so

            switch (choice) {
                case 1:
                    System.out.println("\n--- THEM DANH MUC MOI ---");
                    System.out.print("Nhap ID danh muc: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Xoa bo nho dem

                    if (management.checkIdExisted(id)) {
                        System.out.println("Loi: ID danh muc nay da ton tai!");
                    } else {
                        System.out.print("Nhap ten danh muc: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhap mo ta danh muc: ");
                        String description = scanner.nextLine();
                        
                        Category newCat = new Category(id, name, description);
                        management.addCategory(newCat);
                    }
                    break;

                case 2:
                    System.out.println("\n--- DANH SACH DANH MUC ---");
                    Category[] list = management.findAll();
                    if (list.length == 0) {
                        System.out.println("Danh sach hien tai dang trong.");
                    } else {
                        for (Category c : list) {
                            System.out.println("ID: " + c.getId() + " | Ten: " + c.getName() + " | Mo ta: " + c.getDescription());
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- CAP NHAT DANH MUC ---");
                    System.out.print("Nhap ID danh muc can cap nhat: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Xoa bo nho dem

                    System.out.print("Nhap ten moi: ");
                    String newName = scanner.nextLine();
                    System.out.print("Nhap mo ta moi: ");
                    String newDescription = scanner.nextLine();

                    Category updatedCat = new Category(updateId, newName, newDescription);
                    management.updateCategory(updatedCat);
                    break;

                case 4:
                    System.out.println("\n--- XOA DANH MUC ---");
                    System.out.print("Nhap ID danh muc can xoa: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine(); // Xoa bo nho dem

                    management.deleteById(deleteId);
                    break;

                case 5:
                    System.out.println("Cam on ban da su dung chuong trinh. Tam biet!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Lua chon khong hop le! Vui long nhap tu 1 den 5.");
            }
        }
    }
}
