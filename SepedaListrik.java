package praktikum150505;

public class SepedaListrik extends Sepeda{
    protected int kecepatanMaks;
    protected int jarakTempuh;
    
    public SepedaListrik(int kecepatanMaks,int jarakTempuh,String jmlSadel, int jmlGir, int jmlRoda, String warna){
        super(jmlSadel, jmlGir, jmlRoda, warna);
        this.kecepatanMaks = kecepatanMaks;
        this.jarakTempuh = jarakTempuh;
    }
    
    public void setKecepatanMaks(int kecepatanMaks){
        this.kecepatanMaks = kecepatanMaks;
    }
    
    public int getKecepatanMaks(){
        return kecepatanMaks;
    }
    
    public void setJarakTempuh(int jarakTempuh){
        this.jarakTempuh = jarakTempuh;
    }
    
    public int getJarakTempuh(){
        return jarakTempuh;
    }
    
    @Override
    public void display(){
        System.out.println("Kelas Sepeda Listrik");
        System.out.println("Jumlah Roda : "+this.jmlRoda);
        System.out.println("Warna : "+this.warna);
        System.out.println("Jumlah Sadel : "+this.jmlSadel);
        System.out.println("Jumlah Gir : "+this.jmlGir);
        System.out.println("Kecepatan Maksimum : "+this.kecepatanMaks);
        System.out.println("Jarak Tempuh : "+this.jarakTempuh);
    }
}
