import java.util.Scanner;

public class XoayMaTran90Do {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhap kich thuoc ma tran vuong va kiem tra tinh hop le
        System.out.print("Nhap kich thuoc ma tran vuong (n x n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ma tran khong hop le");
            scanner.close();
            return;
        }

        int[][] matrix = new int[n][n];
        System.out.println("Nhap cac phan tu cua ma tran:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Phan tu [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        // In ma tran ban dau de de so sanh
        System.out.println("\n--- Ma tran ban dau ---");
        inMaTran(matrix, n);

        // 2. Xu ly xoay ma tran 90 do theo chieu kim dong ho
        
        // Buoc 2.1: Chuyen vi ma tran (Hoan doi phan tu hang va cot qua duong cheo chinh)
        for (int i = 0; i < n; i++) {
            // j bat dau tu i + 1 de chi hoan doi cac phan tu phia tren duong cheo chinh
            for (int j = i + 1; j < n; j++) {
                int tam = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tam;
            }
        }

        // Buoc 2.2: Dao nguoc cac cot tren tung hang cua ma tran chuyen vi
        for (int i = 0; i < n; i++) {
            // Chi duyet den giua cac cot (n / 2) de hoan doi doi xung trai - phai
            for (int j = 0; j < n / 2; j++) {
                int tam = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = tam;
            }
        }

        // 3. In ket qua ma tran sau khi xoay 90 do
        System.out.println("\n--- Ma tran sau khi xoay 90 do ---");
        inMaTran(matrix, n);

        scanner.close();
    }

    // Phuong thuc phu dung de in ma tran ra console theo dang bang
    public static void inMaTran(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); // Xuong dong khi het 1 hang
        }
    }
}
