import java.util.HashMap;
import java.util.Scanner;

public class InventoryManagement {

    private static HashMap<String, Integer> dataBarang = new HashMap<>();
    private static HashMap<String, Double> dataHarga = new HashMap<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            System.out.println("================================");
            System.out.println("Program Manajemen Inventaris");
            System.out.println("1. Tambah atau Update jumlah barang");
            System.out.println("2. Tambah atau Update harga barang");
            System.out.println("3. Lihat barang");
            System.out.println("4. Keluar");
            System.out.println("Pilihan: ");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1){
                updateQuantity();
            } else if (choice == 2){
                updatePrice();
            } else if (choice == 3){
                viewItems();
            } else if (choice ==  4){
                break;
            } else {
                System.out.println("Maaf, tidak tersedia");
            }
        }
        System.out.println("Program Selesai");
    }
    private static void updateQuantity(){
        System.out.println("Nama barang: ");
        String barang = input.nextLine();

        System.out.println("Jumlah item:");
        int jumlahBarang = input.nextInt();
        input.nextLine();

        dataBarang.put(barang, jumlahBarang);
        if (!dataHarga.containsKey(barang)){
            dataHarga.put(barang, 0.0);
        }
        System.out.println("Jumlah barang: " + barang + " berhasil diupdate menjadi: " + jumlahBarang);
    }

    public static void updatePrice (){
        System.out.println("Nama barang: ");
        String barang = input.nextLine();

        System.out.println("Harga barang baru: ");
        double harga = input.nextDouble();
        input.nextLine();

        int prices;
        dataHarga.put(barang, harga);
        System.out.println("Harga barang: " + barang + " berhasil diperbarui menjadi " + harga);
    }

    public static void viewItems(){
        System.out.println("Daftar barang: ");
        for (String item : dataBarang.keySet()){
            if (!dataHarga.containsKey(item)){
                dataHarga.put(item, 0.0);
            }
            System.out.println("Nama barang: " + item + ", Jumlah barang: " + dataBarang.get(item) + ", Harga barang: " + dataHarga.get(item));
        }
    }
}

// TODO: 06/02/2023 Bug di Opsi Lihat Inventaris
