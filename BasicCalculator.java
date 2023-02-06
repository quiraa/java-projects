import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan angka pertama: ");
        double num1 = input.nextDouble();
        System.out.println("Masukan angka kedua: ");
        double num2 = input.nextDouble();

        System.out.println("Pilih salah satu metode penghitungan.\n1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian");
        int methodSelector = input.nextInt();
        double hasil;

        switch (methodSelector){
            case 1:
                hasil = num1 + num2;
                break;
            case 2:
                hasil = num1 - num2;
                break;
            case 3:
                hasil = num1 * num2;
                break;
            case 4:
                hasil = num1 / num2;
                break;
            default:
                System.out.println("Invalid!");
                return;
        }

        System.out.println("Hasil: "+ hasil);
    }
}
