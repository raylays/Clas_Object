package Inheritance_tugas;
import java.io.*;

public class MainClass {
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader 
        (new InputStreamReader(System.in));
    //variable
    String bookingID = "", nik = "", nama="", jk="", tgl_berangkat="", tgl_kembali="",
            bandaraAsal="";
    int jumlahPenumpang, harga=0, total=0, temp=0;
    String tujuan="", nomorPesawat="", noKursi="";
    
    try {
        System.out.println("=== Pemesanan Tiket ===");
        //entry jumlah
        System.out.println("Masukkan Jumlah Penumpang : ");
        int jumlah = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Kota Asal: ");
        bandaraAsal = br.readLine();
        System.out.println("Pilih Rute Tujuan: ");
        System.out.println("Bali, Lombok, Surabaya, Yogyakarta, Balikpapan, Makassar, Jakarta");
        
        //object
        LionAir la[] = new LionAir[jumlah];
        Citilink c[] = new Citilink [jumlah];
        
        //input
        System.out.println(" ");
        System.out.println("Entry Tujuan : ");
        tujuan = br.readLine();
        System.out.println("Entry Tanggal Berangkat : ");
        tgl_berangkat = br.readLine();
        System.out.println("Pesan Pulang - Pergi? (Y/T): ");
        String PP = br.readLine();
        System.out.println("Entry Tanggal Kembali : ");
        tgl_kembali = br.readLine();
        
        System.out.println("\n");
        System.out.println("--Pilih Maskapai--");
        System.out.println("1. LionAir");
        System.out.println("2. Citilink");
        System.out.print("Pilih Maskapai: ");
        int pilih = Integer.parseInt(br.readLine());
        
        //masukan object
        if (pilih == 1) {
            System.out.println("SELAMAT DATANG DI LION AIR");
            System.out.println("Silahkan Isi Data Penumpang");
            for (int i = 0; i < la.length; i++){
                System.out.println("Entry Booking ID : ");
                bookingID = br.readLine();
                System.out.println("Entry NIK : ");
                nik = br.readLine();
                System.out.println("Entry Nama : ");
                nama = br.readLine();
                System.out.println("Entry Jenis Kelamin (P/L) : ");
                jk = br.readLine();
                System.out.println("Entry No Pesawat : ");
                nomorPesawat = br.readLine();
                System.out.println("Entry No Kursi : ");
                noKursi = br.readLine();
                System.out.println(" ");
                
                //MASUKKAN OBJECT
                la[i] = new LionAir (nomorPesawat, tujuan, noKursi,jumlah,nik,nama,jk,bookingID,tgl_berangkat, 
                tgl_kembali,bandaraAsal);
                
            }
        }
        if (pilih == 2) {
            System.out.println("SELAMAT DATANG DI CITILINK");
            System.out.println("Silahkan Isi Data Penumpang");
            for (int i = 0; i < c.length; i++){
                System.out.println("Entry Booking ID : ");
                bookingID = br.readLine();
                System.out.println("Entry NIK : ");
                nik = br.readLine();
                System.out.println("Entry Nama : ");
                nama = br.readLine();
                System.out.println("Entry Jenis Kelamin (P/L) : ");
                jk = br.readLine();
                System.out.println("Entry No Pesawat : ");
                nomorPesawat = br.readLine();
                System.out.println("Entry No Kursi : ");
                noKursi = br.readLine();
                System.out.println(" ");
                
                //masukkan object
                c[i] = new Citilink (nomorPesawat, tujuan, noKursi,jumlah,nik,nama,jk,bookingID,tgl_berangkat, 
                tgl_kembali,bandaraAsal);
                
            }
        }
        
        //output
        //lionair
        if(pilih == 1){
        for (int i = 0; i < la.length; i++) {
        la[i].getDataLengkap();
        }
        
        //hitung
        for(int i = 0; i < la.length; i++){
                        temp += la[i].getHarga();
                    } 
        System.out.println("Harga Total : " + temp);
        temp = 0;
        }
        
        //citilink
        if(pilih == 2){
        for (int i = 0; i < c.length; i++) {
          
        c[i].getDataLengkap();
        }
        
        //hitung total
        for(int i = 0; i < c.length; i++){
                        temp += c[i].getHarga();
                    } 
        //harga total
        System.out.println("Harga Total : " + temp);
        temp = 0;
        }
    } catch (Exception e) {
    }
      
    }
}
