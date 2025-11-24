
package Data;


public class TestKendaraan {
    public static void main(String[] args) {
        Kendaraan k = new Kendaraan();
        
        k.setnoPol("N 12343 PL");
        k.setMerk("Avanza");
        k.setTahun(2019);
        
        System.out.println("===DATA KENDARAAN===");
        System.out.println("NoPolisi : " + k.getnoPol());
        System.out.println("Merk     : " + k.getMerk());
        System.out.println("Tahun    : " + k.getTahun());
        
    }
}
