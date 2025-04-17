package praktikum170405;

import java.util.Scanner;

public class PesawatMain4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlah;

        System.out.print("Masukkan banyak pesawat = ");
        jumlah = in.nextInt();
        in.nextLine();

        Pesawat[] daftarPesawat = new Pesawat[jumlah];

        // Mengisi data pesawat
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Input data pesawat ke " + (i + 1));
            System.out.print("Nama Pesawat: ");
            String nama = in.nextLine();
            System.out.print("Tahun Produksi: ");
            int tahunProduksi = in.nextInt();
            System.out.print("Menggunakan mesin? (true/false): ");
            boolean mesin = in.nextBoolean();
            System.out.print("Jumlah maksimum penumpang: ");
            int muatan = in.nextInt();
            in.nextLine();

            daftarPesawat[i] = new Pesawat(nama, tahunProduksi, mesin, muatan);
        }

        
        int pilihan;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Tampilkan Daftar Pesawat");
            System.out.println("2. Cari Pesawat dengan Muatan Terbesar");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1-3): ");
            pilihan = in.nextInt();
            in.nextLine();   

            switch (pilihan) {
                case 1:
                    System.out.println("\nDAFTAR PESAWAT :");
                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("\nData Pesawat ke " + (i + 1) + "==");
                        daftarPesawat[i].cetak();   
                    }
                    break;

                case 2:
                    int max = daftarPesawat[0].getMuatan();
                    String namaPesawatMax = daftarPesawat[0].getNama();   
                    for (int i = 1; i < jumlah; i++) {
                        if (daftarPesawat[i].getMuatan() > max) {
                            max = daftarPesawat[i].getMuatan();
                            namaPesawatMax = daftarPesawat[i].getNama();
                        }
                    }
                    System.out.println("\nPesawat "+ namaPesawatMax+" memiliki muatan terbesar ");
                    System.out.println("\nPesawat "+ namaPesawatMax+"dengan muatan Sebanyak: " + max);
                    break;

                case 3:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 3);

        in.close();
    }
}