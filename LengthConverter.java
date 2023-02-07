import java.util.Scanner;

public class LengthConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length Converter");
        System.out.println("1. Centimeter");
        System.out.println("2. Meter");
        System.out.println("3. Inchi");
        System.out.println("4. Kaki");
        System.out.println("Pilih satuan panjang: ");
        int option = input.nextInt();
        double centimeter, meter, inch, foot;
        System.out.println("Masukan satuan panjang: ");
        double length = input.nextDouble();

        switch (option){
            case 1:
                inch = length / 2.54;
                meter = length / 100;
                foot = length / 30.48;
                System.out.println(length + " centimeter = " + inch + " inchi");
                System.out.println(length + " centimeter = " + meter + " meter");
                System.out.println(length + " centimeter = " + foot + " foot");
                break;
            case 2:
                centimeter = length * 100;
                inch = length * 39.37;
                foot = length * 3.281;
                System.out.println(length + " meter = " + centimeter + " centimeter");
                System.out.println(length + " meter = " + inch + " inch");
                System.out.println(length + " meter = " + foot + " foot");
                break;
            case 3:
                centimeter = length * 2.54;
                meter = length * 39.37;
                foot = length / 12;
                System.out.println(length + " inchi = " + centimeter + " centimeer");
                System.out.println(length + " inchi = " + meter + " meter");
                System.out.println(length + " inchi = " + foot + " foot");
                break;
            case 4:
                centimeter = length * 30.48;
                meter = length / 3.281;
                inch = length * 12;
                System.out.println(length + " foot = " + centimeter + " centimeer");
                System.out.println(length + " foot = " + meter + " meter");
                System.out.println(length + " foot = " + inch + " inchi");
                break;
            default:
                System.out.println("Pilihan Invalid!");
                break;
        }
    }
}
