package uts2401083001;

public class Gaming extends Laptop{
    private String kartuGrafis;
    private int refreshRate;
  
    
    public Gaming(String kartuGrafis, int refreshRate,int ukuranLayar, int kapasitasRAM, String merek,int tahunProduksi,int garansi){
        super(ukuranLayar,kapasitasRAM,merek,tahunProduksi,garansi);
        this.kartuGrafis = kartuGrafis;
        this.refreshRate = refreshRate;
    }

    public String getKartuGrafis(){
        return kartuGrafis;
    }

    public void setKartuGrafis(String kartuGrafis){
        this.kartuGrafis = kartuGrafis;
    }

    public int getRefreshRate(){
        return refreshRate;
    }
    
    public void setRefreshRate(int refreshRate){
        this.refreshRate = refreshRate;
    }
}