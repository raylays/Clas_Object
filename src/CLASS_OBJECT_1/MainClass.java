package CLASS_OBJECT_1;

public class MainClass {

    public static void main(String[] args) {
        
        /*untuk bisa mengakses clas hewan, buurng, ikan
        perlu membuat objek / instance of class*/
        
        //akses suara, tipe, dan usi dari class hewan
        Hewan burung = new Hewan();
        Hewan ikan = new Hewan();
        
        
        //akses method dari class burung, dan ikan
        Burung b = new Burung();
        Ikan i = new Ikan();
        
        //cara isi dari suara, tipe, dan usia menggunakan setter
        burung.setTipe("Kakatua");
        burung.setSuara("OEKKKK");
        burung.setUsia(1);
        
        ikan.setTipe("Lumba-Lumba");
        ikan.setSuara("BLELEPP");
        ikan.setUsia(0);
        
        
        
        //cara ambil dari setter hewan, ika, dan burung
        System.out.println("Aku "+ burung.getTipe()+ " Suaraku "+ burung.getSuara()+
        " Usiaku " + burung.getUsia() + ". ");
        b.terbang();
        
        System.out.println("Aku "+ ikan.getTipe()+ " Suaraku "+ ikan.getSuara()+
        " Usiaku " + ikan.getUsia() + ". ");
        i.berenang();
    }
    
}
