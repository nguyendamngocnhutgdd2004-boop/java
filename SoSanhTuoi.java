import java.util.Scanner;

public class SoSanhTuoi { // Da doi ten lop Main thanh SoSanhTuoi
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhap thong tin cho nguoi thu nhat
        Person p1 = new Person();
        System.out.println("--- Nhap thong tin Nguoi thu nhat ---");
        System.out.print("Nhap ten: ");
        String name1 = scanner.nextLine();
        p1.setName(name1);
        
        System.out.print("Nhap tuoi: ");
        int age1 = scanner.nextInt();
        p1.setAge(age1);
        scanner.nextLine(); // Xoa bo nho dem

        // 2. Nhap thong tin cho nguoi thu hai
        Person p2 = new Person();
        System.out.println("\n--- Nhap thong tin Nguoi thu hai ---");
        System.out.print("Nhap ten: ");
        String name2 = scanner.nextLine();
        p2.setName(name2);
        
        System.out.print("Nhap tuoi: ");
        int age2 = scanner.nextInt();
        p2.setAge(age2);

        // 3. So sanh tuoi va in ket qua
        System.out.println("\n--- Ket qua so sanh ---");
        if (p1.getAge() > p2.getAge()) {
            System.out.println(p1.getName() + " lon tuoi hon " + p2.getName());
        } else if (p1.getAge() < p2.getAge()) {
            System.out.println(p2.getName() + " lon tuoi hon " + p1.getName());
        } else {
            System.out.println(p1.getName() + " va " + p2.getName() + " bang tuoi nhau.");
        }

        scanner.close();
    }
}
