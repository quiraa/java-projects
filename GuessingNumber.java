import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Tebak angka dari 1 sampai 100: ");
        int guess = input.nextInt();

        while (guess != randomNumber) {
            if (guess < randomNumber) {
                System.out.println("Angka terlalu kecil, coba lagi!");
            } else {
                System.out.println("Angka terlalu besar, coba lagi!");
            }
            guess = input.nextInt();
        }

        System.out.println("Tebakan kamu benar!");
    }
}
