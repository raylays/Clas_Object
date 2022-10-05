package Inheritance;
import java.io.*;
public class MainClass {
public static void main(String[] args) {
    BufferedReader br = new BufferedReader 
        (new InputStreamReader(System.in));
        // TODO code application logic here
        
        //object sub blass
        Sub_Class sub = new Sub_Class("","",0);
        
        try {
            //input data
        System.out.print("Isi nama: ");
        String n = br.readLine();
        System.out.print("Isi Keterangan: ");
        String k = br.readLine();
        System.out.print("Isi Tinggi: ");
        int t = Integer.parseInt(br.readLine());
        
        //masukkan variable ke dalam
        sub = new Sub_Class(n, k, t);
        
        //cetak data lengkap
        sub.dataLengkap();
        
        //panggil method cetak
        sub.cetak();
        
    } catch (Exception e) {
        System.out.println(e);
    }
        
    }
    
}
