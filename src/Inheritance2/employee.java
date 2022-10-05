package Inheritance2;
import java.io.*;
public class employee extends person {
    
    //atribute employee
    private String departement, title;
    
    //construtor berparameter dari super dan subclass
    public employee
        (String id, String name, String addres, String departement, String title) {
        super(id, name, addres);
        this.departement = "IT";
        this.title = title;
    }
    
    //getter

    public String getDepartement() {
        return departement;
    }

    public String getTitle() {
        return title;
    }
    
    //custom method
    public void getDataLengkap(){
        System.out.println
        (super.getId() + " " + super.getName() + " " + super.getAddres() + 
         " " + getDepartement() + " " + getTitle());
    
    }
    
    
    
    
}
