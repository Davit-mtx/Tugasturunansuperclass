
package superclass;


public class bujursangkar extends bentuk{
    private double sisi;
    
    public bujursangkar (String warna, double sisi){
        super(warna);
        this.sisi = sisi;
    }
    
    public double getSisi(){
        return sisi;
    }
    
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    
    public double luasBujursangkar(double sisi){
        return sisi*sisi;
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("luas bujursangkar = "+ luasBujursangkar(sisi) + "\n");
    }
}
