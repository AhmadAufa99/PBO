package uts2401083001;

public class Laptop extends Elektronik{
    private int ukuranLayar;
    private int kapasitasRAM;

    public Laptop(int ukuranLayar, int kapasitasRAM, String merek,int tahunProduksi,int garansi){
        super(merek,tahunProduksi,garansi);
        this.ukuranLayar = ukuranLayar;
        this.kapasitasRAM = kapasitasRAM;
    }

    public int getUkuranLayar(){
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar = ukuranLayar;
    }

    public int getKapasitasRAM(){
        return kapasitasRAM;
    }

    public void setKapasitasRAM(int kapasitasRAM){
        this.kapasitasRAM = kapasitasRAM;
    }
}
