package praktikum150505;


public class Taksi extends Mobil{
    protected int tarifAwal;
    protected int tarifPerKm;
    
    public Taksi(int tarifAwal,int tarifPerKm,String bahanBakar, int kapasitasMesin,int jmlRoda,String warna){
        super(bahanBakar,kapasitasMesin,jmlRoda,warna);
        this.tarifAwal = tarifAwal;
        this.tarifPerKm = tarifPerKm;
    }
    
    public void setTarifAwal(int tarifAwal){
        this.tarifAwal = tarifAwal;
    }
    
    public int getTarifAwal(){
        return tarifAwal;
    }
    
    public void setTarifPerKm(int TarifPerKm){
        this.tarifPerKm = tarifPerKm;
    }
    
    public int getTarifPerKm(){
        return tarifPerKm;
    }
    
    @Override
    public void display(){
        System.out.println("Kelas Taksi");
        System.out.println("Jumlah Roda : "+this.jmlRoda);
        System.out.println("Warna : "+this.warna);
        System.out.println("Bahan Bakar : "+this.bahanBakar);
        System.out.println("Tarif Awal : "+this.tarifAwal);
        System.out.println("Tarif PerKm : "+this.tarifPerKm);
        System.out.println("Kapasitas mesin : "+this.kapasitasMesin);
    }
}
