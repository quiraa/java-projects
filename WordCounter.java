import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kata-kata: ");
        String word = scan.nextLine();
        int counter = 1;

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == ' ' && word.charAt(i + 1) != ' ') {
                counter++;
            }
        }

        System.out.println("Jumlah kata: " + counter);
    }
}
