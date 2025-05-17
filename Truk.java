package praktikum150505;

public class Truk extends Mobil{
    protected int muatanMaks;
    
    public Truk(int muatanMaks, String bahanBakar, int kapasitasMesin,int jmlRoda,String warna){
        super(bahanBakar,kapasitasMesin,jmlRoda,warna);
        this.muatanMaks = muatanMaks;
    }
    
    public void setMuatanMaks(int muatanMaks){
        this.muatanMaks = muatanMaks;
    }
    
    public int getMuatanMaks(){
        return muatanMaks;
    }
    
    @Override
    public void display(){
        System.out.println("Kelas Truk");
        System.out.println("Jumlah Roda : "+this.jmlRoda);
        System.out.println("Warna : "+this.warna);
        System.out.println("Bahan Bakar : "+this.bahanBakar);
        System.out.println("Kapasitas Mesin : "+this.kapasitasMesin);
        System.out.println("Muatan Maks : "+this.muatanMaks);
    }
}
