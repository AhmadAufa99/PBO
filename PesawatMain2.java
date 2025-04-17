package praktikum170405;

public class PesawatMain2 {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan objek Pesawat
        Pesawat[] daftarPesawat = new Pesawat[3];
        
        // Menginisialisasi objek Pesawat
        daftarPesawat[0] = new Pesawat("Air Asia", 2015, true, 180); // Perbaiki titik menjadi koma
        daftarPesawat[1] = new Pesawat("Lion Air", 2018, true, 100);
        daftarPesawat[2] = new Pesawat("Merpati", 2010, true, 75);
        
        // Mencetak daftar pesawat
        System.out.println("Daftar Pesawat\n");
        for (int i = 0; i < daftarPesawat.length; i++) {
            System.out.println("\nData Pesawat ke " + (i + 1) + "==");
            daftarPesawat[i].cetak(); // Memanggil metode cetak dengan huruf kecil
            System.out.println("");
        }
    }
}