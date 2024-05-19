
package superclass;


public class silinder extends lingkaran{
    private double t;
    
    public silinder(String warna, double r, double t){
        super(warna, r);
        this.t = t;
    }
    
    public double getT(){
        return t;
    }
    
    public void setT(double t){
        this.t = t;
    }
    
    public double volumeSilinder(double r, double t){
        return Math.PI * r * r * t;
    }
    
    public void info(){
        System.out.println("luas lingkaran = " +luasLingkaran(r) + "\n");
        super.info();
        System.out.println("Volume silinder = " + volumeSilinder(r, t)+ "\n");
    }
}
