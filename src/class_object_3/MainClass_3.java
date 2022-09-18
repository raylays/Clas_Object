package class_object_3;

import java.io.*;

public class MainClass_3 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
        new InputStreamReader (System.in));
        
        Mahasiswa mhs = new Mahasiswa();
        Karyawan kry = new Karyawan();
        
        try{
        
            do{
                System.out.println("--PROGRAM CEK SPP DAN GAJI--");
                System.out.println("1. Cek SPP Mahasiswa");
                System.out.println("2. Cek Gaji Karyawan");
                System.out.println("3. Keluar Aplikasi");
                System.out.print("Pilih Menu: ");
                int pilih = Integer.parseInt(br.readLine());
                
                switch(pilih){
                    case 1:
                        System.out.println("--Isi Data--");
                        System.out.print("Masukkan NIM: ");
                        mhs.setNim(br.readLine());
                        System.out.print("Prodi: ");
                        mhs.setProdi(br.readLine());
                        System.out.print("Angkatan: ");
                        mhs.setAngkatan(Integer.parseInt(br.readLine()));
                        System.out.print("Semester: ");
                        mhs.setSemester(Integer.parseInt(br.readLine()));
                        
                        System.out.print("SPP Mahasiswa: Rp: "+ mhs.getSPP());
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("--Isi Data--");
                        System.out.print("Masukkan NIK: ");
                        kry.setNik(br.readLine());
                        System.out.print("Bagian: ");
                        kry.setBagian(br.readLine());
                        System.out.print("Kehadiran: ");
                        kry.setKehadiran(Integer.parseInt(br.readLine()));
                        System.out.print("Gaji Per Hari: ");
                        kry.setGaji_Per_Hari(Integer.parseInt(br.readLine()));
                        
                        System.out.print("Gaji Karyawan: Rp: "+ kry.getGaji());
                        System.out.println("");
                        
                        break;
                    case 3:
                        System.exit(0);
                }
            
            }while (true);
        
            
        } catch (Exception e) {
            System.out.println("Inputan salah / bukan angka");
                }
    }
    
}
