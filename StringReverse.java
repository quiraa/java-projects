import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String kata = scan.nextLine();
        String reverse = "";

        for (int i = kata.length() - 1; i >= 0; i--) {
            reverse = reverse + kata.charAt(i);
        }

        System.out.println("Kata yang dibalik: " + reverse);
    }
}
