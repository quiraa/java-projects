import java.util.Scanner;

public class LengthConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih Satuan yang ingin dikonversikan:");
        System.out.println("1. Centimeter");
        System.out.println("2. Meter");
        System.out.println("3. Inchi");
        System.out.println("4. Kaki");
        int choice = input.nextInt();

        if (choice == 1){
            System.out.println("Masukan satuan cm:");
            double centimeter = input.nextDouble();

            System.out.println("Pilih satuan konversi:");
            System.out.println("1. Meter");
            System.out.println("2. Inchi");
            System.out.println("3. Kaki");
            int choiceCm = input.nextInt();

            if (choiceCm == 1){
                double cmToMeter = centimeter / 100;
                System.out.println("Hasil konversi dari " + centimeter + " cm ke meter adalah: " + cmToMeter);
            } else if (choiceCm == 2){
                double cmToInchi = centimeter / 2.54;
                System.out.println("Hasil konversi dari " + centimeter + " cm ke inchi adalah: " + cmToInchi);
            } else if (choiceCm == 3){
                double cmToFeet = centimeter / 30.48;
                System.out.println("Hasil konversi dari " + centimeter + " cm ke kaki adalah: " + cmToFeet);
            } else {
                System.out.println("Tidak tersedia");
            }

        } else if (choice == 2) {

            System.out.println("Masukan satuan meter:");
            double meter = input.nextDouble();

            System.out.println("Pilih satuan konversi:");
            System.out.println("1. Centimeter");
            System.out.println("2. Inchi");
            System.out.println("3. Kaki");
            int choiceMeter = input.nextInt();

            if (choiceMeter == 1){
                double meterToCm = meter * 100;
                System.out.println("Hasil konversi dari " + meter + " meter ke centimeter adalah: " + meterToCm);
            } else if (choiceMeter == 2){
                double meterToInchi = meter / 39.37;
                System.out.println("Hasil konversi dari " + meter + " meter ke inchi adalah: " + meterToInchi);
            } else if (choiceMeter == 3){
                double meterToFeet = meter * 3.281;
                System.out.println("Hasil konversi dari " + meterToFeet + " meter ke kaki adalah: " + meterToFeet);
            } else {
                System.out.println("Tidak tersedia");
            }

        } else if (choice == 3) {

            System.out.println("Masukan satuan inchi:");
            double inchi = input.nextDouble();

            System.out.println("Pilih satuan konversi:");
            System.out.println("1. Centimeter");
            System.out.println("2. Meter");
            System.out.println("3. Kaki");
            int choiceInchi = input.nextInt();

            if (choiceInchi == 1){
                double inchiToCm = inchi * 2.54;
                System.out.println("Hasil konversi dari " + inchi + " inchi ke centimeter adalah: " + inchiToCm);
            } else if (choiceInchi == 2){
                double inchiToMeter = inchi / 39.37;
                System.out.println("Hasil konversi dari " + inchi + " inchi ke meter adalah: " + inchiToMeter);
            } else if (choiceInchi == 3){
                double inchiToFeet = inchi / 12;
                System.out.println("Hasil konversi dari " + inchi + " inchi ke kaki adalah: " + inchiToFeet);
            } else {
                System.out.println("Tidak tersedia");
            }

        } else if (choice == 4) {

            System.out.println("Masukan satuan kaki:");
            double feet = input.nextDouble();

            System.out.println("Pilih satuan konversi:");
            System.out.println("1. Centimeter");
            System.out.println("2. Meter");
            System.out.println("3. Inchi");
            int choiceFeet = input.nextInt();

            if (choiceFeet == 1){
                double feetToCm = feet * 30.48;
                System.out.println("Hasil konversi dari " + feet + " kaki ke centimeter adalah: " + feetToCm);
            } else if (choiceFeet == 2){
                double feetToMeter = feet / 3.281;
                System.out.println("Hasil konversi dari " + feet + " kaki ke meter adalah: " + feetToMeter);
            } else if (choiceFeet == 3){
                double feetToInchi = feet * 12;
                System.out.println("Hasil konversi dari " + feet + " kaki ke inchi adalah: " + feetToInchi);
            } else {
                System.out.println("Tidak tersedia");
            }

        } else {
            System.out.println("Pilihan Invalid!");
        }
    }
}

