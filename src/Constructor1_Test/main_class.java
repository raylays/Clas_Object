package Constructor1_Test;
import java.io.*;
public class main_class {
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader
                (new InputStreamReader(System.in));
        
        //object (instance of class)
        //karena ada 2 constructor
        //1. Admin
        //2. Akun Baru
        Akun admin = new Akun();
        Akun akunBaru = new Akun("","");
        
        
        //variable
        String username, password, temp;
        
        //Menu
        do{
            System.out.println("--Login--");
            System.out.println("1. Login Admin");
            System.out.println("2. Buat Akun Baru");
            System.out.println("3. Lihat Akun");
            System.out.println("4. Ubah Password");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            int menu = Integer.parseInt(br.readLine());
            switch(menu){
            case 1:
                System.out.println("--Login Admin--");
                System.out.print("Masukkan username: ");
                username = br.readLine();
                System.out.print("Masukkan password: ");
                password = br.readLine();
                
                //mencocokan username dan password
                if(username.equalsIgnoreCase(admin.getUsername())
                        && password.equals(admin.getPassword())){
                    System.out.println("Sukses");
                }else {
                    System.out.println("Gagal");
                }
            break;
            case 2:
                System.out.println("--Buat Akun--");
                 System.out.print("Masukkan username: ");
                username = br.readLine();
                System.out.print("Masukkan password: ");
                password = br.readLine();
                
                //memasukkan variabel kedalam constructor
                akunBaru = new Akun(username, password);
            break;
            case 3:
                System.out.println("--Lihat Akun--");
                System.out.println("1. Admin");
                System.out.println("Username : "+ admin.getUsername());
                System.out.println("Password : "+ admin.getPassword());
                System.out.println("");
                System.out.println("2. Akun Baru");
                System.out.println("Username : "+ akunBaru.getUsername());
                System.out.println("Username : "+ akunBaru.getPassword() 
                + "\n");
                
                //variable
                
            break;
            case 4:
                //masukkan pass lama 
                        System.out.print("masukkan password lama : ");
                        password = br.readLine();
                        System.out.print("masukkan password baru : ");
                        temp = br.readLine();
                        
                        //mencocokkan password  
                        if (password.equalsIgnoreCase(akunBaru.getPassword()))
                                {
                            akunBaru.setPassword(temp);
                            System.out.println("password telah diubah");
                        }else{
                            System.err.println("password tidak sesuai!");
                        }     
            break;
            case 5:
                System.exit(0);
            break;
            
        }
        
        }while (true);
    }
    
}
