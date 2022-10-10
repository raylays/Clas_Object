package Inheritance_tugas;

public class LionAir extends Tiket {

    //atribute
    private String nomorPesawat;
    private String tujuan;
    private String noKursi;
    private int harga;
    private int jumlahPenumpang;
    private int total;
    
    //constructor
    public LionAir(String nomorPesawat, String tujuan, String noKursi,int jumlah, 
    String nik, String nama, String jk, String bookingID, String tgl_berangkat, 
    String tgl_kembali, String bandaraAsal) {
        super(nik, nama, jk, bookingID, tgl_berangkat, tgl_kembali, bandaraAsal);
        //surabaya
        if(bandaraAsal.equalsIgnoreCase("Surabaya")){
        if(tujuan.equalsIgnoreCase("Bali") || tujuan.equalsIgnoreCase("Lombok")){
            this.harga = 500000;
            }
        if (tujuan.equalsIgnoreCase("jakarta")||tujuan.equalsIgnoreCase("yogyakarta")){
            this.harga = 600000;
            }
        if (tujuan.equalsIgnoreCase("balikpapan") || tujuan.equalsIgnoreCase("makassar")){
            this.harga = 700000;
            }
        }
        //asal jakarta
        if(bandaraAsal.equalsIgnoreCase("jakarta")){
        if(tujuan.equalsIgnoreCase("Bali") || tujuan.equalsIgnoreCase("Lombok")){
            this.harga = 700000;
            }
        if (tujuan.equalsIgnoreCase("jakarta") || tujuan.equalsIgnoreCase("yogyakarta")){
            this.harga = 750000;
            }
        if (tujuan.equalsIgnoreCase("balikpapan") || tujuan.equalsIgnoreCase("makassar")){
            this.harga = 800000;
            }
        }
        this.nomorPesawat = nomorPesawat;
        this.tujuan = tujuan;
        this.noKursi = noKursi;
        this.jumlahPenumpang = jumlahPenumpang;
        this.total = total;
    }

    

    public String getNomorPesawat() {
        return nomorPesawat;
        
    }

    public int getJumlahPenumpang() {
       return jumlahPenumpang;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getNoKursi() {
        return noKursi;
    }

    public int getHarga() {
        return harga;
                    
               
    }
    

    int getTotal() {
        total = getHarga()*getJumlahPenumpang();
        return total;
        
    }
  

    public void getDataLengkap() {
        System.out.println("==Citilink==");
        System.out.println("BOOKING ID: "+super.getBookingID());
        System.out.println("NIK: "+super.getNik());
        System.out.println("NAMA: "+super.getNama());
        System.out.println("BANDARA ASAL: "+super.getBandaraAsal());
        System.out.println("KOTA TUJUAN: "+getTujuan());
        System.out.println("TGL BERANGKAT: "+super.getTgl_berangkat());
        System.out.println("TGL KEMBALI: "+super.getTgl_kembali());
        System.out.println("NO. PESAWAT: "+getNomorPesawat());
        System.out.println("NO. KURSI: "+getNoKursi());
        System.out.println("Harga Tiket : "+getHarga());
        System.out.println(" ");
        
        
    }
}
