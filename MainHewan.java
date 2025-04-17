
package praktikum170405;

public class MainHewan {

    public static void main(String[] args) {
        Hewan hewanku=new Hewan("Makhluk hidup");
        Kucing kucingku=new Kucing("Shiroko");
        Anjing anjingku=new Anjing("bahlil");
        
        System.out.println("\nTampilkan akses superclass Hewan");
        hewanku.tampilkanNama();
        hewanku.bersuara();
        
        System.out.println("\nTampilkan akses subclass kucing");
        kucingku.tampilkanNama();
        kucingku.bersuara();
        
        System.out.println("\nTampilkan akses subclass Anjing");
        anjingku.tampilkanNama();
        anjingku.bersuara();
        
    }
    
} 
