
package Perusahaan;

public class Karyawan {
    
    private String NIP;
    private String Nama;
    private String Divisi;
    
    public String getNIP(){
        return NIP;
    }
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    public String getNama(){
        return Nama;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public String getDivisi(){
        return Divisi;
    } 
    public void setDivisi(String DIvisi){
        this.Divisi = Divisi;
    }
}
