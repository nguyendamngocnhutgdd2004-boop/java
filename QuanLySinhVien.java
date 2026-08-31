import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        // 1. Tao danh sach co san cac doi tuong Student
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Nguyen Van An", 20, "IT01", 8.5));
        list.add(new Student("Tran Thi Binh", 21, "IT02", 6.2));
        list.add(new Student("Le Hoang Cuong", 19, "IT01", 9.0));
        list.add(new Student("Pham Minh Duc", 22, "IT03", 5.5));
        list.add(new Student("Vu Thu Ha", 20, "IT02", 7.8));

        // 2. Nhap khoang diem min va max tu nguoi dung
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- KHAO SAT KHOANG DIEM TRUNG BINH ---");
        
        System.out.print("Nhap diem thap nhat (min): ");
        double min = scanner.nextDouble();
        
        System.out.print("Nhap diem cao nhat (max): ");
        double max = scanner.nextDouble();

        // 3. Loc va hien thi danh sach theo dieu kien
        System.out.println("\n--- DANH SACH SINH VIEN TRONG KHOANG DIEM [" + min + " - " + max + "] ---");
        boolean isFound = false;

        for (Student s : list) {
            // Kiem tra xem diem trung binh co nam trong khoang hop le khong
            if (s.getAvgScore() >= min && s.getAvgScore() <= max) {
                s.display(); // Goi ham hien thi cua lop Student
                isFound = true;
            }
        }

        // Truong hop khong co sinh vien nao thoa man
        if (!isFound) {
            System.out.println("Khong co sinh vien nao co diem trong khoang nay.");
        }

        scanner.close();
    }
}
