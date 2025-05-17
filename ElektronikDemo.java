package uts2401083001;

import java.util.Scanner;

public class ElektronikDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== MENU ELEKTRONIK ===");
            System.out.println("1. Input dan Tampilkan Data Laptop");
            System.out.println("2. Input dan Tampilkan Data Smartphone");
            System.out.println("3. Input dan Tampilkan Data Gaming");
            System.out.println("4. Input dan Tampilkan Data SmartWatch");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== Input Data Laptop ===");
                    System.out.print("Masukkan Merek: ");
                    String merek = scanner.nextLine();

                    System.out.print("Masukkan Tahun Produksi: ");
                    int tahunProduksi = scanner.nextInt();

                    System.out.print("Masukkan Masa Garansi (tahun): ");
                    int garansi = scanner.nextInt();

                    System.out.print("Masukkan Ukuran Layar (inch): ");
                    int ukuranLayar = scanner.nextInt();

                    System.out.print("Masukkan Kapasitas RAM (GB): ");
                    int kapasitasRAM = scanner.nextInt();
                    scanner.nextLine();

                    Laptop laptop = new Laptop(ukuranLayar, kapasitasRAM, merek, tahunProduksi, garansi);

                    System.out.println("\nData Laptop");
                    System.out.println("Merek : " + laptop.getMerek());
                    System.out.println("Tahun Produksi : " + laptop.getTahunProduksi());
                    System.out.println("Garansi : " + laptop.getGaransi() + " tahun");
                    System.out.println("Ukuran Layar : " + laptop.getUkuranLayar() + " inch");
                    System.out.println("Kapasitas RAM : " + laptop.getKapasitasRAM() + " GB");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("\nData Smartphone");
                    System.out.print("Masukkan Merek : ");
                    merek = scanner.nextLine();

                    System.out.print("Masukkan Tahun Produksi : ");
                    tahunProduksi = scanner.nextInt();

                    System.out.print("Masukkan Masa Garansi : ");
                    garansi = scanner.nextInt();

                    System.out.print("Masukkan Kapasitas Baterai : ");
                    int kapasitasBaterai = scanner.nextInt();

                    System.out.print("Masukkan Jumlah Kamera : ");
                    int jumlahKamera = scanner.nextInt();
                    scanner.nextLine();

                    Smartphone smartphone = new Smartphone(kapasitasBaterai, jumlahKamera, merek, tahunProduksi, garansi);

                    System.out.println("\nData Smartphone");
                    System.out.println("Merek : " + smartphone.getMerek());
                    System.out.println("Tahun Produksi : " + smartphone.getTahunProduksi());
                    System.out.println("Garansi : " + smartphone.getGaransi() + " tahun");
                    System.out.println("Kapasitas Baterai : " + smartphone.getKapasitasBaterai());
                    System.out.println("Jumlah Kamera : " + smartphone.getJumlahKamera());
                    System.out.println();
                    break;

                case 3:
                    System.out.println("\nData Gaming");
                    System.out.print("Masukkan Merek : ");
                    merek = scanner.nextLine();

                    System.out.print("Masukkan Tahun Produksi : ");
                    tahunProduksi = scanner.nextInt();

                    System.out.print("Masukkan Masa Garansi : ");
                    garansi = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukkan Ukuran Layar : ");
                    ukuranLayar = scanner.nextInt();

                    System.out.print("Masukkan Kapasitas RAM : ");
                    kapasitasRAM = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukkan Kartu Grafis : ");
                    String kartuGrafis = scanner.nextLine();

                    System.out.print("Masukkan Refresh Rate : ");
                    int refreshRate = scanner.nextInt();
                    scanner.nextLine();

                    Gaming gaming = new Gaming(kartuGrafis, refreshRate, ukuranLayar, kapasitasRAM, merek, tahunProduksi, garansi);

                    System.out.println("\nData Gaming");
                    System.out.println("Merek : " + gaming.getMerek());
                    System.out.println("Tahun Produksi : " + gaming.getTahunProduksi());
                    System.out.println("Garansi : " + gaming.getGaransi() + " tahun");
                    System.out.println("Ukuran Layar : " + gaming.getUkuranLayar() + " inch");
                    System.out.println("Kapasitas RAM : " + gaming.getKapasitasRAM() + " GB");
                    System.out.println("Kartu Grafis : " + gaming.getKartuGrafis());
                    System.out.println("Refresh Rate : " + gaming.getRefreshRate());
                    System.out.println();
                    break;

                case 4:
                    System.out.println("\nInput Data SmartWatch");
                    System.out.print("Masukkan Merek : ");
                    merek = scanner.nextLine();

                    System.out.print("Masukkan Tahun Produksi : ");
                    tahunProduksi = scanner.nextInt();

                    System.out.print("Masukkan Masa Garansi : ");
                    garansi = scanner.nextInt();

                    System.out.print("Masukkan Kapasitas Baterai : ");
                    kapasitasBaterai = scanner.nextInt();

                    System.out.print("Masukkan Jumlah Kamera: ");
                    jumlahKamera = scanner.nextInt();

                    System.out.print("Masukkan Ukuran Layar : ");
                    ukuranLayar = scanner.nextInt();

                    System.out.print("Apakah tahan air? (true/false): ");
                    boolean tahanAir = scanner.nextBoolean();
                    scanner.nextLine();

                    SmartWatch smartWatch = new SmartWatch(ukuranLayar, tahanAir, kapasitasBaterai, jumlahKamera, merek, tahunProduksi, garansi);

                    System.out.println("\nData SmartWatch : ");
                    System.out.println("Merek : " + smartWatch.getMerek());
                    System.out.println("Tahun Produksi : " + smartWatch.getTahunProduksi());
                    System.out.println("Garansi : " + smartWatch.getGaransi() + " tahun");
                    System.out.println("Kapasitas Baterai : " + smartWatch.getKapasitasBaterai() + " mAh");
                    System.out.println("Jumlah Kamera : " + smartWatch.getJumlahKamera());
                    System.out.println("Ukuran Layar : " + smartWatch.getUkuranLayar() + " inch");
                    System.out.println("Tahan Air : " + (smartWatch.isTahanAir() ? "Ya" : "Tidak"));
                    System.out.println();
                    break;

                case 5:
                    System.out.println("exit.");
                    break;

                default:
                    System.out.println("Anomali ! Pilih Ulang\n");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
