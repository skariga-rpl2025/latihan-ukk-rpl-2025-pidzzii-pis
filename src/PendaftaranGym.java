
import java.io.InputStreamReader;
import java.util.Scanner;


public class PendaftaranGym {
    public static void main(String[] args) {
        Scanner inp = new Scanner(new InputStreamReader(System.in));
        String a;
        int total = 0;
    do {
        System.out.println("Masukkan Nama Anggota : ");
    String nama = inp.nextLine();
    total++;
        System.out.println("Daftar Anggota lagi [y/t] > ");
        a = inp.nextLine();
    }while (a.equalsIgnoreCase("y"));
        System.out.println("Total Anggota Yang Daftar Hari Ini : " + total);
        
    }
            
        
    
            

    }