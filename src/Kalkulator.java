
import java.io.InputStreamReader;
import java.util.Scanner;


public class Kalkulator {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(new InputStreamReader(System.in));
        System.out.println("===MENU KALKULATOR SEDERHANA===");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        System.out.println("Pilih Menu : ");
        int pilih = inp.nextInt();
        
        System.out.println("Masukkan Angka Ke-1 : ");
        double p = inp.nextDouble();
        System.out.println("Masukkan Angka Ke-2 : ");
        double q = inp.nextDouble();
        
        double hasil = 0;
        switch (pilih) {
            case 1 :
                hasil = p+q;
                break;
            case 2 : 
                hasil = p-q;
                break;
            case 3 :
                hasil = p*q;
                break;
            case 4 :
                hasil = p/q;
                break;
            default : 
                System.out.println("Pilihan Tidak Valid");
        }
        System.out.println("Hasil : " + hasil);
    }
}
