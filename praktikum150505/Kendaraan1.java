
package praktikum150505;

public class Kendaraan1 {
    protected int jmlRoda;
    protected String warna;
    
    public Kendaraan1(int jmlRoda, String warna){
    this.jmlRoda = jmlRoda;
    this.warna = warna;   
}
    public void setJmlRoda(int jmlRoda){
        this.jmlRoda = jmlRoda;
    }
    
    public int getJmlRoda(){
        return jmlRoda;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    public String getWarna(){
        return warna;
    }
    
    public void display(){
        System.out.println("Kelas Kendaraan");
        System.out.println("Jumlah Roda : "+this.jmlRoda);
        System.out.println("Warna : "+this.warna);
    }
}
