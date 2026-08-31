// 1. Dinh nghia interface IBank
interface IBank {
    void deposit(double amount);  // Nhan tien vao tai khoan
    void withdraw(double amount); // Rut tien tu tai khoan
}

// 2. Lop BankAccount trien khai interface IBank
class BankAccount implements IBank {
    private String accountId;
    private double balance;
    private String userName;
    private String phoneNumber;

    // Constructor khoi tao tai khoan
    public BankAccount(String accountId, String userName, String phoneNumber, double balance) {
        this.accountId = accountId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        // Dam bao so du ban dau khong bi am
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Ghi de phuong thuc nap tien tu interface IBank
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("[" + userName + "] Da nap thanh cong: " + amount + " VND");
        } else {
            System.out.println("Loi: So tien nap phai lon hon 0.");
        }
    }

    // Ghi de phuong thuc rut tien tu interface IBank
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Loi: So tien rut phai lon hon 0.");
        } else if (amount > this.balance) {
            System.out.println("Loi: Tai khoan [" + userName + "] khong du so du de rut " + amount + " VND");
        } else {
            this.balance -= amount;
            System.out.println("[" + userName + "] Da rut thanh cong: " + amount + " VND");
        }
    }

    // Phuong thuc rieng: Thuc hien chuyen tien sang tai khoan khac
    public void transferTo(BankAccount targetAccount, double amount) {
        System.out.println("--- KHOI TAO GIAO DICH CHUYEN TIEN ---");
        if (amount <= 0) {
            System.out.println("Loi: So tien chuyen phai lon hon 0.");
            return;
        }
        
        // Kiem tra xem tai khoan nguon co du tien de chuyen khong
        if (amount > this.balance) {
            System.out.println("Loi: Giao dich that bai! Tai khoan cua [" + this.userName + "] khong du so du.");
        } else {
            // Rut tien tu tai khoan nay (tai khoan nguon)
            this.withdraw(amount);
            // Nap tien vao tai khoan doi tac (tai khoan dich)
            targetAccount.deposit(amount);
            System.out.println("=> Giao dich thanh cong: Chuyen " + amount + " VND tu [" + this.userName + "] sang [" + targetAccount.getUserName() + "].");
        }
        System.out.println("--------------------------------------");
    }

    // Phuong thuc hien thi so du tai khoan
    public void displayBalance() {
        System.out.println("Tai khoan: " + accountId + " | Chu TK: " + userName + " | So du: " + balance + " VND");
    }

    // Cac phuong thuc Getter va Setter
    public String getAccountId() { return accountId; }
    public void setAccountId(String accountId) { this.accountId = accountId; }

    public double getBalance() { return balance; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}

// 3. Lop chay chinh (Da doi ten tu Main thanh GiaoDichNganHang)
public class GiaoDichNganHang {
    public static void main(String[] args) {
        // Khoi tao hai tai khoan ngan hang ban dau
        BankAccount accountA = new BankAccount("TK001", "Nguyen Van An", "0912345678", 500000);
        BankAccount accountB = new BankAccount("TK002", "Tran Thi Binh", "0987654321", 200000);

        System.out.println("--- SO DU BAN DAU CUA HAI TAI KHOAN ---");
        accountA.displayBalance();
        accountB.displayBalance();
        System.out.println();

        // Tinh huong 1: Chuyen tien hop le (Chuyen 150,000 VND tu A sang B)
        accountA.transferTo(accountB, 150000);
        
        System.out.println("\n--- SO DU SAU GIAO DICH THU NHAT ---");
        accountA.displayBalance();
        accountB.displayBalance();
        System.out.println();

        // Tinh huong 2: Thu nghiem loi (A muon chuyen tiep 400,000 VND nhung khong du so du)
        accountA.transferTo(accountB, 400000);

        System.out.println("\n--- SO DU CUOI CUNG ---");
        accountA.displayBalance();
        accountB.displayBalance();
    }
}
