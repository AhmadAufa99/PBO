
package praktikum170405;

public class Anjing extends Hewan {
    public Anjing(String nama){
        super(nama);
    }
    
    @Override
    public void bersuara(){
        System.out.println(nama+"Anjing bersuara gok gok gok");
    }
}
