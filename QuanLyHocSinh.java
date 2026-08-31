import java.util.ArrayList;
import java.util.Scanner;

// 1. Dinh nghia Enum Gender
enum Gender {
    MALE, FEMALE, OTHER
}

// 2. Dinh nghia lop Student
class Student {
    private int id;
    private String name;
    private int age;
    private Gender gender;
    private String address;
    private String phoneNumber;

    // Constructor khong tham so
    public Student() {
    }

    // Constructor co tham so day du
    public Student(int id, String name, int age, Gender gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Phuong thuc nhap thong tin sinh vien tu ban phim
    public void inputData(Scanner scanner) {
        System.out.print("Nhap ten sinh vien: ");
        this.name = scanner.nextLine();
        
        System.out.print("Nhap tuoi: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // Xoa bo nho dem sau khi nhap so int

        while (true) {
            System.out.print("Nhap gioi tinh (1: MALE, 2: FEMALE, 3: OTHER): ");
            int genderChoice = scanner.nextInt();
            scanner.nextLine(); // Xoa bo nho dem
            
            if (genderChoice == 1) {
                this.gender = Gender.MALE;
                break;
            } else if (genderChoice == 2) {
                this.gender = Gender.FEMALE;
                break;
            } else if (genderChoice == 3) {
                this.gender = Gender.OTHER;
                break;
            } else {
                System.out.println("Lua chon khong hop le! Vui long nhap lai.");
            }
        }

        System.out.print("Nhap dia chi: ");
        this.address = scanner.nextLine();
        
        System.out.print("Nhap so dien thoai: ");
        this.phoneNumber = scanner.nextLine();
    }

    // Phuong thuc hien thi thong tin sinh vien
    public void displayData() {
        System.out.println("ID: " + id + 
                           " | Ten: " + name + 
                           " | Tuoi: " + age + 
                           " | Gioi tinh: " + gender + 
                           " | Dia chi: " + address + 
                           " | SDT: " + phoneNumber);
    }

    // He thong cac Getter va Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}

// 3. Lop chay chinh chua phuong thuc main va Menu dieu khien
public class QuanLyHocSinh {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Them san 2 sinh vien mau de tien cho viec kiem thu chuong trinh
        studentList.add(new Student(1, "Nguyen Van An", 20, Gender.MALE, "Ha Noi", "0912345678"));
        studentList.add(new Student(2, "Tran Thi Binh", 19, Gender.FEMALE, "Da Nang", "0987654321"));

        while (true) {
            System.out.println("\n===== HE THONG QUAN LY SINH VIEN =====");
            System.out.println("1. Hien thi danh sach tat ca sinh vien");
            System.out.println("2. Them moi sinh vien");
            System.out.println("3. Sua thong tin sinh vien theo ID");
            System.out.println("4. Xoa sinh vien theo ID");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon cua ban (1-5): ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Xoa bo nho dem sau khi nhap so

            switch (choice) {
                case 1:
                    System.out.println("\n--- DANH SACH SINH VIEN ---");
                    if (studentList.isEmpty()) {
                        System.out.println("Danh sach sinh vien hien tai dang trong.");
                    } else {
                        for (Student s : studentList) {
                            s.displayData();
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- THEM MOI SINH VIEN ---");
                    System.out.print("Nhap ma HS (ID): ");
                    int newId = scanner.nextInt();
                    scanner.nextLine(); // Xoa bo nho dem

                    boolean isExisted = false;
                    for (Student s : studentList) {
                        if (s.getId() == newId) {
                            isExisted = true;
                            break;
                        }
                    }

                    if (isExisted) {
                        System.out.println("Loi: Ma sinh vien (ID) nay da ton tai!");
                    } else {
                        Student newStudent = new Student();
                        newStudent.setId(newId);
                        newStudent.inputData(scanner); // Goi ham nhap thong tin tu ban phim
                        studentList.add(newStudent);
                        System.out.println("Them moi sinh vien thanh cong!");
                    }
                    break;

                case 3:
                    System.out.println("\n--- SUA THONG TIN SINH VIEN ---");
                    System.out.print("Nhap ma sinh vien can sua: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine(); // Xoa bo nho dem
                    
                    boolean isFoundEdit = false;
                    for (Student s : studentList) {
                        if (s.getId() == editId) {
                            System.out.println("Thong tin cu cua sinh vien:");
                            s.displayData();
                            System.out.println("--- Nhap thong tin cap nhat moi ---");
                            s.inputData(scanner); // Cho phep nhap lai cac thuoc tinh qua ham co san
                            System.out.println("Cap nhat thong tin thanh cong!");
                            isFoundEdit = true;
                            break;
                        }
                    }
                    if (!isFoundEdit) {
                        System.out.println("Khong tim thay sinh vien co ID: " + editId);
                    }
                    break;

                case 4:
                    System.out.println("\n--- XOA SINH VIEN ---");
                    System.out.print("Nhap ma sinh vien can xoa: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine(); // Xoa bo nho dem

                    boolean isFoundDelete = false;
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getId() == deleteId) {
                            studentList.remove(i);
                            System.out.println("Xoa sinh vien thanh cong!");
                            isFoundDelete = true;
                            break;
                        }
                    }
                    if (!isFoundDelete) {
                        System.out.println("Khong tim thay sinh vien co ID: " + deleteId);
                    }
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
