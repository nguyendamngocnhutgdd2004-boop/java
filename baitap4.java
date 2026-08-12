import java.util.Scanner;
import java.util.InputMismatchException;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean hopLe = false;

        while (!hopLe) {
            System.out.print("Nhap tuoi cua ban: ");
            try {
                age = scanner.nextInt();
                if (age > 0) {
                    hopLe = true; // nhap dung, thoat vong lap
                } else {
                    System.out.println("Vui long nhap vao mot so nguyen va lon hon 0");
                }
            } catch (InputMismatchException e) {
                System.out.println("Vui long nhap vao mot so nguyen va lon hon 0");
                scanner.next(); // xoa du lieu sai (chuoi, ky tu...) khoi bo dem
            }
        }

        System.out.println("Tuoi cua ban la " + age + " !");
    }
}