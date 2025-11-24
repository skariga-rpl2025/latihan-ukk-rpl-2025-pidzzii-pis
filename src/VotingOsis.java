
import java.io.InputStreamReader;
import java.util.Scanner;

public class VotingOsis {

    public static void main(String[] args) {
        Scanner inp = new Scanner(new InputStreamReader(System.in));
        String pilih;
        int A = 0;
        int B = 0;

        while (true) {
            System.out.println("Masukkan Pilihan Anda A/B : ");
            pilih = inp.nextLine();

        if (pilih.equalsIgnoreCase("selesai")) {
            break;
        } else if (pilih.equalsIgnoreCase("A")) {
            A++;
        } else if (pilih.equalsIgnoreCase("B")) {
            B++;
        } else {
            System.out.println("Pilihan Anda Tidak Valid!!");
        }

        System.out.println("===HASIL VOTING===");
        System.out.println("Hasil Voting Kandidat A : " + A + "Suara");
        System.out.println("Hasil Voting Kandidat B : " + B + "Suara");
        }
    }
}
