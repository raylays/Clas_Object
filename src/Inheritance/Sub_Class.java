package Inheritance;
public class Sub_Class extends Super_Class {
   
    //atribute sub class
    private int tinggi;
    
    //construtor berparameter dari super dan subclass
    public Sub_Class(String nama, String keterangan, int tinggi){
        super(nama, keterangan);
        this.tinggi = tinggi;
    }
    
    //getter

    public int getTinggi() {
        return tinggi;
    }
    
    //custom method
    public void dataLengkap(){
        System.out.println
        (super.getNama() + " " + super.getKeterangan() + " " + getTinggi());
    }
    
    @Override
    public void cetak(){
        super.cetak();
        
    }
    
}
