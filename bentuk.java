
package superclass;


public class bentuk {
  private String warna;
  
  public bentuk(String warna){
      this.warna = warna;
  }
  
  public String getWarna(){
      return warna;
  }
  
  public void setWarna(String warna){
      this.warna = warna;
  }
  
  public void info(){
      System.out.println("Bentuk warna = " +warna );
  }
}
