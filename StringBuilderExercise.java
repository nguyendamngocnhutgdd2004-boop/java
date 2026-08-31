public class StringBuilderExercise {
    public static void main(String[] args) {
        // 1. Khoi tao chuoi ban dau
        StringBuilder sb = new StringBuilder("Hello, Java World!");
        System.out.println("Chuoi ban dau: " + sb.toString());

        // 2. Xoa cac ky tu tu vi tri 5 den 9
        sb.delete(5, 9);
        System.out.println("Chuoi sau khi xoa: " + sb.toString());

        // 3. Thay the doan "World" bang "Universe"
        sb.replace(7, 12, "Universe");
        System.out.println("Chuoi sau khi thay the: " + sb.toString());
    }
}
