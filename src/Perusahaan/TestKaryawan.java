
package Perusahaan;

public class TestKaryawan {
    public static void main(String[] args) {
        
    
    Karyawan k = new Karyawan();
    
    k.setNIP("B987");
    k.setNama("Fulan");
    k.setDivisi("Manager");
    
        System.out.println("===DATA KARYAWAN===");
        System.out.println("NIP    : " + k.getNIP());
        System.out.println("Nama   : " + k.getNama());
        System.out.println("Divisi : " + k.getDivisi());

    }
}
