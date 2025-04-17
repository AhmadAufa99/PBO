package praktikum170405;

import java.util.Scanner;

public class PesawatMain3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlah;

        System.out.print("Masukkan banyak pesawat = ");
        jumlah = in.nextInt();
        in.nextLine();

        Pesawat[] daftarPesawat = new Pesawat[jumlah];

        for (int i = 0; i < jumlah; i++) { // Perbaiki sintaks for
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

        
        System.out.println("\nDAFTAR PESAWAT :");
        System.out.println("\nData pesawat ke 1 == ");
        daftarPesawat[0].cetak();
        int max= daftarPesawat[0].getMuatan();
        String namamax=daftarPesawat[0].getNama();
        for (int i = 1; i < jumlah; i++) {
            System.out.println("\nData Pesawat ke " + (i + 1) + "==");
            daftarPesawat[0].cetak();
            if(daftarPesawat[i].getMuatan()>max)
                max=daftarPesawat[i].getMuatan();
            namamax =daftarPesawat[i].getNama();
            System.out.println();
        }
        
        System.out.println("/nPesawat dengan muatan terbesar sebanyak = "+namamax);
        System.out.println("/nMuatan terbesar = "+max);

        in.close();
    }
}