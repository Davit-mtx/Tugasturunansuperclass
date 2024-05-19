
package superclass;


public class lingkaran extends bentuk{
    protected double r;
    
    
    public lingkaran(String warna, double r){
        super(warna);
        this.r = r;
    }
    
    public double getR(){
        return r;
    }
    
    public void setR(double r){
        this.r = r;
    }
    
    public double luasLingkaran(double r){
        return Math.PI *r*r;
    }
    
    public void info(){
        super.info();
    }
    
}
