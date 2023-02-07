import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit berhasil. Saldo saat ini: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Penarikan berhasil. Saldo saat ini: " + balance);
        } else {
            System.out.println("Penarikan gagal. Saldo tidak cukup.");
        }
    }

    public void checkBalance() {
        System.out.println("Saldo saat ini: " + balance);
    }
}

public class SimpleBankingApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount(0.0);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Pilih nomor menu: ");

            int menu = input.nextInt();
            if (menu == 1) {
                System.out.print("Masukkan jumlah deposit: ");
                double amount = input.nextDouble();
                account.deposit(amount);
            } else if (menu == 2) {
                System.out.print("Masukkan jumlah penarikan: ");
                double amount = input.nextDouble();
                account.withdraw(amount);
            } else if (menu == 3) {
                account.checkBalance();
            } else if (menu == 4) {
                break;
            } else {
                System.out.println("Masukkan pilihan yang benar.");
            }
        }
    }
}

