package Inheritance2;
import java.io.*;
public class MainClass {
public static void main(String[] args) {
        BufferedReader br = new BufferedReader 
        (new InputStreamReader(System.in));
        
        //object employee
        // employee emp[] = new employee[2]; 
        
        
        //deklarasi
        String Id, Name, Addres, title;
        
        try {
            //jumlah array ditentukan oleh user
            //1. Entry julah array
            System.out.print("Masukkan Jumlah: ");
            int jumlah = Integer.parseInt(br.readLine());
            
            //buat object
            employee emp[] = new employee[jumlah];
            
            //input
            for (int i = 0; i < emp.length; i++) {
                System.out.println("Entry ID: ");
                Id = br.readLine();
                System.out.println("Entry Name: ");
                Name = br.readLine();
                System.out.println("Entry Addres: ");
                Addres = br.readLine();
                System.out.println("Entry Title: ");
                title = br.readLine();
                
                //masuk ke object
                emp[i] = new employee(Id, Name, Addres,"", title);
                
            }
            
            
            //output
            for(int i = 0; i < emp.length; i++) {
             emp[i].getDataLengkap();
            }
    } catch (Exception e) {
        System.out.println(e);
    }
              
    }
    
}
