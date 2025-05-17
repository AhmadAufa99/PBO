package praktikum150505;

public class Mobil extends Kendaraan {
    protected String bahanBakar;
    protected int kapasitasMesin;
    
    public Mobil(String bahanBakar, int kapasitasMesin, int jmlRoda, String warna) {
    super(jmlRoda, warna);
    this.bahanBakar = bahanBakar;
    this.kapasitasMesin = kapasitasMesin;
}
    
    public void setBahanBakar(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }
    
    public String getBahanBakar(){
        return bahanBakar;
    }
    
    public void setKapasitasMesin(int kapasitasMesin){
        this.kapasitasMesin = kapasitasMesin;
    }
    
    public int getKapasitasMesin(){
        return kapasitasMesin;
    }
    
    @Override
    public void display(){
        System.out.println("Kelas Mobil");
        System.out.println("Jumlah Roda : "+this.jmlRoda);
        System.out.println("Warna : "+this.warna);
        System.out.println("Bahan Bakar : "+this.bahanBakar);
        System.out.println("Kapasitas Mesin : "+this.kapasitasMesin);
    }
}
