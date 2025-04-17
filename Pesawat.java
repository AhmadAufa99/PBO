package praktikum170405;

public class Pesawat extends Udara {
    private int muatan;

    
    public Pesawat() {
        super(); 
        this.muatan = muatan;
    }

    public Pesawat(String nama, int tahunProduksi, boolean mesin, int muatan) {
        super(nama, tahunProduksi, mesin);
        this.muatan = muatan;
    }


    public int getMuatan() {
        return muatan;
    }


    public void setMuatan(int muatan) {
        this.muatan = muatan; 
    }

   
    public void reset(String nama, int tahunProduksi, boolean mesin, int muatan) {
        setNama(nama);
        setTahunProduksi(tahunProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }

  
    public String kategori() {
        if (muatan <= 50) {
            return "Bobot kecil";
        } else if (muatan <= 100) {
            return "Bobot sedang";
        } else {
            return "Bobot besar";
        }
    }

    
    @Override
    public void cetak() {
        super.cetak(); 
        System.out.println("Muatan pesawat: " + muatan + " orang penumpang");
        System.out.println("Kategori: " + kategori()); 
    }
}