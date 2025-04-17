package praktikum170405;

public class Kendaraan {
    private String nama; 
    private int tahunProduksi; 

   
    public Kendaraan() {
        this.nama = ""; // Inisialisasi nama dengan string kosong
        this.tahunProduksi = 0; // Inisialisasi tahun produksi dengan 0
    }

    // Konstruktor dengan parameter
    public Kendaraan(String nama, int tahunProduksi) {
        this.nama = nama; // Mengatur nama kendaraan
        this.tahunProduksi = tahunProduksi; // Mengatur tahun produksi
    }

    // Metode untuk mendapatkan nama kendaraan
    public String getNama() {
        return nama;
    }

    // Metode untuk mengatur nama kendaraan
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode untuk mendapatkan tahun produksi
    public int getTahunProduksi() {
        return tahunProduksi;
    }

    // Metode untuk mengatur tahun produksi
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    // Metode untuk mencetak informasi kendaraan
    public void cetak() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }
}