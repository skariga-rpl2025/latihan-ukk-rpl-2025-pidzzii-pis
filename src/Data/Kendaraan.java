
package Data;

public class Kendaraan {
    private String noPol;
    private String merk;
    private int tahun;
    
    public String getnoPol(){
        return noPol;
    }
    public void setnoPol(String nnoPol){
        this.noPol = noPol;
    }
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public int getTahun(){
        return tahun;
    } 
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
}
