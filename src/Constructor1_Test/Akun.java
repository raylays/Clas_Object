package Constructor1_Test;

public class Akun {
    
    //inisialisasi username, password
    private String username, password;
    
    
    //constructor non parameter untuk admin
    public Akun(){
        //user admin sudah ditentukan username dan password nya
        username = "admin";
        password = "admin";
    }
    
    //dan constructor untuk akun baru
    public Akun(String u, String p){
        username = u;
        password = p;
        
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
   
    
    
}
