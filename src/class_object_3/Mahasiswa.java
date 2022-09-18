package class_object_3;
public class Mahasiswa {
    private String nim, prodi;
    private int spp, angkatan, semester, bayar_spp_semester;
    
    //setter
    public void setNim(String n){
        nim = n;
    }
    
    public void setProdi(String p){
        prodi = p;
    }
    
    public void setSpp(int s){
        spp = s;
    }
    
    public void setAngkatan(int a){
        angkatan = a;
    }
    
    public void setSemester(int r){
        semester = r;
    }
    
    public void setBayar_Spp_Semester(int b){
        bayar_spp_semester = b;
    }
    
    //getter
    public String getNim(){
        return this.nim;
    }
    public String getProdi(){
        return this.prodi;
    }
    public int getSpp(){
        return this.spp;
    }
    public int getAngkatan(){
        return this.angkatan;
    }
    public int getSemester(){
        return this.semester;
    }
    public int getBayar_Spp_semester(){
        return this.bayar_spp_semester;
    }
    
    //custom
    public int getSPP(){
        if (this.angkatan>17){
            spp = 15000000;
            bayar_spp_semester = getSpp() * getSemester();
        }else{
            spp = 12000000;
            bayar_spp_semester = getSpp() * getSemester();
        
        }
        return bayar_spp_semester;
    }
    
    
}
