package uts2401083001;

public class Elektronik{
    private String merek;
    private int tahunProduksi;
    private int garansi;

   
    public Elektronik(String merek,int tahunProduksi,int garansi){
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.garansi = garansi;
    }

    public String getMerek(){
        return merek;
    }

    public void setMerek(String merek){
        this.merek = merek;
    }

    public int getTahunProduksi(){
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi){
        this.tahunProduksi = tahunProduksi;
    }

    public int getGaransi(){
        return garansi;
    }

    public void setGaransi(int garansi){
        this.garansi = garansi;
    }
}   
