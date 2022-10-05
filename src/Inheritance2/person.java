package Inheritance2;
public class person {
    //atribute
    private String id, name, addres;
    
    //constructor
    public person (String id, String name, String addres){
    this.id = id;
    this.name = name;
    this.addres = addres;
    }
    
    //getter

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddres() {
        return addres;
    }
    
}
