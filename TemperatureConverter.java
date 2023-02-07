import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("Temperature Converter");
        System.out.println("Pilih satuan suhu untuk dikonversikan:");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.println("4. Reaumur");
        System.out.println("Masukkan pilihan: ");
        int choice = input.nextInt();
        System.out.println("Masukkan suhu: ");
        double temperature = input.nextDouble();
        double celcius, fahrenheit, kelvin, reaumur;

        switch (choice) {
            case 1:
                System.out.println("Pilih suhu konversi: ");
                System.out.println("1. Fahrenheit");
                System.out.println("2. Kelvin");
                System.out.println("3. Reaumur");
                System.out.println("Masukkan pilihan: ");
                int choiceC = input.nextInt();
                switch (choiceC) {
                    case 1:
                        fahrenheit = (temperature * 9 / 5) + 32;
                        System.out.println("Hasil dari " + temperature + "°C ke Fahrenheit = " + fahrenheit + " °F");
                        break;
                    case 2:
                        kelvin = (temperature + 273.15);
                        System.out.println("Hasil dari " + temperature + " °C ke Kelvin = " + kelvin + " °K");
                        break;
                    case  3:
                        reaumur = (temperature*4)/5;
                        System.out.println("Hasil dari " + temperature + " °C ke Reaumur = " + reaumur + " °R");
                        break;
                    default:
                        System.out.println("Pilihan Invalid!");
                        break;
                }

            case 2:
                System.out.println("Pilih suhu konversi: ");
                System.out.println("1. Celcius");
                System.out.println("2. Kelvin");
                System.out.println("3. Reaumur");
                System.out.println("Masukkan pilihan: ");
                int choiceF = input.nextInt();
                switch (choiceF){
                    case 1:
                        celcius = (temperature - 32) * 5/9;
                        System.out.println("Hasil dari " + temperature + "°F ke Celcius = " + celcius + " °C");
                        break;
                    case 2:
                        kelvin = (temperature - 32) * 5/9 + 273.15;
                        System.out.println("Hasil dari " + temperature + "°F ke Kelvin = " + kelvin + " °K");
                        break;
                    case 3 :
                        reaumur = (temperature*9/4)+ 32;
                        System.out.println("Hasil dari " + temperature + "°F ke Reaumur = " + reaumur + " °R");
                        break;
                    default:
                        System.out.println("Pilihan Invalid!");
                        break;
                }

            case 3:
                System.out.println("Pilih suhu konversi: ");
                System.out.println("1. Celcius");
                System.out.println("2. Fahrenheit");
                System.out.println("3. Reaumur");
                System.out.println("Masukkan pilihan: ");
                int choiceK = input.nextInt();

                switch (choiceK) {
                    case 1 :
                        celcius = temperature - 273.15;
                        System.out.println("Hasil dari " + temperature + "°K ke Celcius = " + celcius + " °C");
                        break;
                    case 2 :
                        fahrenheit = (temperature - 273.15) * 9/5 + 32;
                        System.out.println("Hasil dari " + temperature + "°K ke Fahrenheit = " + fahrenheit + " °F");
                        break;
                    case 3:
                        reaumur = (temperature*5/4) + 273.15;
                        System.out.println("Hasil dari " + temperature + "°K ke Reaumur = " + reaumur + " °R");
                        break;
                    default:
                        System.out.println("Pilihan Invalid!");
                        break;
                }
            case 4 :
                System.out.println("Pilih suhu konversi: ");
                System.out.println("1. Celcius");
                System.out.println("2. Fahrenheit");
                System.out.println("3. Kelvin");
                System.out.println("Masukkan pilihan: ");
                int choiceR = input.nextInt();
                switch (choiceR){
                    case 1:
                        celcius = temperature * 1.25;
                        System.out.println("Hasil dari " + temperature + "°R ke Celcius = " + celcius + " °C");
                        break;
                    case 2:
                        fahrenheit = (temperature * 9/4) + 32;
                        System.out.println("Hasil dari " + temperature + "°R ke Fahrenheit = " + fahrenheit + " °F");
                        break;
                    case 3:
                        kelvin = (temperature * 5/4) + 273.15;
                        System.out.println("Hasil dari " + temperature + "°R ke Kelvin = " + kelvin + " °K");
                        break;
                    default:
                        System.out.println("Pilihan Invalid!");
                        break;
                }
            default:
                System.out.println("Pilihan Invalid!");
                break;
            }
        }
    }

