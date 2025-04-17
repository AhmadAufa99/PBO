
package praktikum170405;

public class Hewan {
    protected String nama;
   
    public Hewan(String nama){
        this.nama=nama;
    }
    public void bersuara(){
        System.out.println("Hewan bersuara.....");
    }
    public void tampilkanNama(){
        System.out.println("Nama Hewan : "+nama);
    }
}
