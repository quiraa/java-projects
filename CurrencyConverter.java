import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rate = 14500.0;

        System.out.println("Enter an amount of US dollars: $");
        double dollars = input.nextDouble();

        double idr = dollars * rate;
        System.out.println("$" + dollars + " is Equal to " + idr + " Indonesian Rupiah.");
    }
}
