package uts2401083001;

public class SmartWatch extends Smartphone {
    private int ukuranLayar;
    private boolean tahanAir;

    public SmartWatch(int ukuranLayar, boolean tahanAir,int kapasitasBaterai, int jumlahKamera, String merek,int tahunProduksi,int garansi){
        super(kapasitasBaterai,jumlahKamera,merek,tahunProduksi,garansi);
        this.ukuranLayar = ukuranLayar;
        this.tahanAir = tahanAir;
    }

    public int getUkuranLayar(){
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar = ukuranLayar;
    }

    public boolean isTahanAir(){
        return tahanAir;
    }

    public void setTahanAir(boolean tahanAir){
        this.tahanAir = tahanAir;
    }
}