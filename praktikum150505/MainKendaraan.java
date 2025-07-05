package praktikum150505;

import java.util.Scanner;

public class MainKendaraan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis kendaraan:");
        System.out.println("1 = Mobil");
        System.out.println("2 = Sepeda");
        System.out.println("3 = Truk");
        System.out.println("4 = Taksi");
        System.out.println("5 = Sepeda Listrik");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        Kendaraan1 kendaraan = null;

        switch (pilihan) {
            case 1:
                System.out.print("Jumlah Roda: ");
                int jmlRoda = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Warna: ");
                String warna = scanner.nextLine();
                System.out.print("Bahan Bakar: ");
                String bahanBakar = scanner.nextLine();
                System.out.print("Kapasitas Mesin: ");
                int kapasitasMesin = scanner.nextInt();
                scanner.nextLine();

                kendaraan = new Mobil(bahanBakar, kapasitasMesin, jmlRoda, warna);
                break;

            case 2:
                System.out.print("Jumlah Sadel: ");
                String jmlSadel = scanner.nextLine();
                System.out.print("Jumlah Gir: ");
                int jmlGir = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Jumlah Roda: ");
                jmlRoda = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Warna: ");
                warna = scanner.nextLine();

                kendaraan = new Sepeda(jmlSadel, jmlGir, jmlRoda, warna);
                break;

            case 3:
                System.out.print("Muatan Maksimum: ");
                int muatanMaks = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Bahan Bakar: ");
                bahanBakar = scanner.nextLine();
                System.out.print("Kapasitas Mesin: ");
                kapasitasMesin = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Jumlah Roda: ");
                jmlRoda = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Warna: ");
                warna = scanner.nextLine();

                kendaraan = new Truk(muatanMaks, bahanBakar, kapasitasMesin, jmlRoda, warna);
                break;

            case 4:
                System.out.print("Tarif Awal: ");
                int tarifAwal = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Tarif Per Km: ");
                int tarifPerKm = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Bahan Bakar: ");
                bahanBakar = scanner.nextLine();
                System.out.print("Kapasitas Mesin: ");
                kapasitasMesin = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Jumlah Roda: ");
                jmlRoda = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Warna: ");
                warna = scanner.nextLine();

                kendaraan = new Taksi(tarifAwal, tarifPerKm, bahanBakar, kapasitasMesin, jmlRoda, warna);
                break;

            case 5:
                System.out.print("Kecepatan Maksimum: ");
                int kecepatanMaks = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Jarak Tempuh: ");
                int jarakTempuh = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Jumlah Sadel: ");
                jmlSadel = scanner.nextLine();
                System.out.print("Jumlah Gir: ");
                jmlGir = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Jumlah Roda: ");
                jmlRoda = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Warna: ");
                warna = scanner.nextLine();

                kendaraan = new SepedaListrik(kecepatanMaks, jarakTempuh, jmlSadel, jmlGir, jmlRoda, warna);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                scanner.close();
                return;
        }

        System.out.println("\nData kendaraan yang dimasukkan:");
        kendaraan.display();

        scanner.close();
    }
}
