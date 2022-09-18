package Praktik;

public class Mobil {
    String warna, merk;
    public Mobil(String paramWarna, String paramMerk) {
        warna = paramWarna;
        merk  = paramMerk;
    }
    
    void maju() {
        System.out.println("Mobil " + merk + " warna " + warna + " bergerak maju");
    }
    
    void mundur() {
        System.out.println("Mobil " + merk + " warna " + warna + " bergerak mundur");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat object mobilSaya
        Mobil mobilSaya = new Mobil("Biru", "Toyota");
        
        // Memanggil object
        mobilSaya.maju();
        mobilSaya.mundur();
    }
}