
package superclass;


public class testclass {


    public static void main(String[] args) {
        bentuk warna = new bentuk("warna netral\n");
        bujursangkar bs = new bujursangkar("putih", 10);
        lingkaran l = new lingkaran("hitam" , 7);
        lingkaran sl = new silinder("hitam kekuningan" , 7, 10); 
        
        System.out.println("berikut adalah hasilnya:\n");
        warna.info();
        bs.info();
        l.info();
        sl.info();
    }
    
}
