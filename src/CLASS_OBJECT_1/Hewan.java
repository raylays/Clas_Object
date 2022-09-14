package CLASS_OBJECT_1;

public class Hewan {
    //atribute / data
    private String tipe, suara;
    private int usia;
    
    //setter dari semua variable / atribute/ data
    //setter memiliki parameter
    public void setTipe(String t){
        tipe = t;
    }
    
    public void setSuara(String suara){
        this.suara = suara;
    }
    
    public void setUsia(int usia){
        this.usia = usia;
    }
    
    
    //getter dari semua variable / atribute / data
    /*getter bisanya tidak memiliki parameter
    karena lngsng mengambil data dari setter*/
    
    public String getTipe(){
        return this.tipe;
    }
    
    public String getSuara(){
        return this.suara;
    }
    
    public int getUsia(){
        return this.usia;
        
    }
    
}
