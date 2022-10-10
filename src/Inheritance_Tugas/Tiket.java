package Inheritance_tugas;

public class Tiket {
    
    //atribute
    private String nik;
    private String nama;
    private String jk;
    private String bookingID;
    String bandaraAsal;
    private String tgl_berangkat;
    private String tgl_kembali;
    
    //constructor
    public Tiket(String nik, String nama, String jk, String bookingID, String tgl_berangkat, String tgl_kembali, String bandaraAsal) {
        this.nik = nik;
        this.nama = nama;
        this.jk = jk;
        this.bookingID = bookingID;
        this.tgl_berangkat = tgl_berangkat;
        this.tgl_kembali = tgl_kembali;
        this.bandaraAsal = bandaraAsal;
    }

    

    public String getNik() {
        return nik;
        
    }

    public String getNama() {
        return nama;
        
    }

    public String getJk() {
        return jk;
        
    }

    public String getBookingID() {
        return bookingID;
    }

    public String getTgl_berangkat() {
        return tgl_berangkat;
    }

    public String getTgl_kembali() {
        return tgl_kembali;
    }

    public String getBandaraAsal() {
        return bandaraAsal;
    }

    String nik() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
