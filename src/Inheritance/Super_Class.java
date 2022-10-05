package Inheritance;
public class Super_Class {
    
    //atribut
    private String nama, keterangan;
    
    //constructor
    public Super_Class(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }
    
    //getter
    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }
    
            
public void cetak(){
    System.out.println(getNama() + " " + getKeterangan());
}
 
    
}
