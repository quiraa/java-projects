import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.println("4. Reaumur");
        System.out.println("Pilih satuan suhu: ");
        int option = input.nextInt();
        double celsius, fahrenheit, kelvin, reaumur;
        System.out.println("Masukan jumlah suhu: ");
        double temperature = input.nextDouble();

        switch (option) {
            case 1:
                fahrenheit = (temperature * 9/5) + 32;
                kelvin = (temperature + 273.15);
                reaumur = (temperature * 4) / 5;
                System.out.println("Celsius to Fahrenheit = " + fahrenheit + " °F");
                System.out.println("Celsius to Kelvin = " + kelvin + " °K");
                System.out.println("Celsius to Reaumur = " + reaumur + " °R");
                break;
            case 2:
                celsius = (temperature * 5/9) + 32;
                kelvin = (temperature + 459.67) * 5/9;
                reaumur = (temperature - 32) * 4/9;
                System.out.println("Fahrenheit to Celsius = " + celsius + " °C");
                System.out.println("Fahrenheit to Kelvin = " + kelvin + " °K");
                System.out.println("Fahrenheit to Reaumur = " + reaumur + " °R");
                break;
            case 3:
                celsius = temperature - 273.15;
                fahrenheit = (temperature * 9/5) - 459.67;
                reaumur = (temperature - 273.15) * 4/5;
                System.out.println("Kelvin to Celsius = " + celsius + " °C");
                System.out.println("Kelvin to Fahrenheit = " + fahrenheit + " °F");
                System.out.println("Kelvin to Reaumur = " + reaumur + " °R");
                break;
            case 4:
                celsius = temperature / 0.8;
                fahrenheit = (temperature * 2.25) + 32;
                kelvin = (temperature / 0.8) + 273.15;
                System.out.println("Reaumur to Celsius = " + celsius + " °C");
                System.out.println("Reaumur to Fahrenheit = " + fahrenheit + " °F");
                System.out.println("Reaumur to Kelvin = " + kelvin + " °K");
                break;
            default:
                System.out.println("Pilihan Invalid!");
                break;
        }
    }
}
