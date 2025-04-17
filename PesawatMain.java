package praktikum170405;

public class PesawatMain {
    public static void main(String[] args) {
        // Membuat objek Pesawat dengan nama, tahun produksi, status mesin, dan muatan
        Pesawat p = new Pesawat("Air Asia", 2020, true, 130);
        
        // Mencetak informasi pesawat
        p.cetak();
        
        System.out.println();
        
        // Kondisi setelah reset
        System.out.println("Kondisi Setelah reset:");
        p.reset("Lion Air", 1998, true, 80); // Memperbaiki parameter untuk reset
        p.cetak(); // Mencetak informasi pesawat setelah reset
    }
}