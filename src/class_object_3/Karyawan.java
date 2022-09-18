package class_object_3;
public class Karyawan {
    private String nik, bagian;
    private int kehadiran, gaji_per_hari, totalGaji;
    
    //setter
    public void setNik(String n){
        nik = n;
    }
    
    public void setBagian(String b){
        bagian = b;
    }
    
    public void setKehadiran(int k){
        kehadiran = k;
    }
    
    public void setGaji_Per_Hari(int g){
        gaji_per_hari = g;
    }
    
    public void setTotalGaji(int t){
        totalGaji = t;
    }
    
    //getter
    public String getNik(){
        return this.nik;
    }
    
    public String getBagian(){
        return this.bagian;
    }
    
    public int getKehadiran(){
        return this.kehadiran;
    }
    
    public int getGaji_Per_Hari(){
        return this.gaji_per_hari;
    }
    
    public int getTotalGaji(){
        return this.totalGaji;
    }
    
    //custom
    public int getGaji(){
        totalGaji = getKehadiran() * getGaji_Per_Hari();
        return totalGaji;
    }
    
}
