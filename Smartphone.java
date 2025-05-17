package uts2401083001;

public class Smartphone extends Elektronik{
    private int kapasitasBaterai;
    private int jumlahKamera;

    public Smartphone(int kapasitasBaterai, int jumlahKamera, String merek,int tahunProduksi,int garansi){
        super(merek,tahunProduksi,garansi);
        this.kapasitasBaterai = kapasitasBaterai;
        this.jumlahKamera = jumlahKamera;
    }

    public int getKapasitasBaterai(){
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai){
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public int getJumlahKamera(){
        return jumlahKamera;
    }

    public void setJumlahKamera(int jumlahKamera){
        this.jumlahKamera = jumlahKamera;
    }
}
