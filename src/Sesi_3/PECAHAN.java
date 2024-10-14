package Sesi_3;
import java.util.Scanner;

public class PECAHAN {
    public static void main(String[] args) {
        int uang, seratusRibuan, limapuluhRibuan, duapuluhRibuan, sepuluhRibuan, limaRibuan, duaRibuan, seribuan, limaratusRupiah, seratusRupiah;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai Uang : ");
        uang = sc.nextInt();

        if (uang >= 100000 ) {
            seratusRibuan = uang / 100000;
            uang = uang % 100000;
            System.out.println(seratusRibuan + " LEMBAR SERATUS RIBUAN");
        }
        if (uang >= 50000) {
            limapuluhRibuan = uang / 50000;
            uang = uang % 50000;
            System.out.println(limapuluhRibuan + " LEMBAR LIMA PULUH RIBUAN");
        }
        if (uang >= 20000) {
            duapuluhRibuan = uang / 20000;
            uang = uang % 20000;
            System.out.println(duapuluhRibuan + " LEMBAR DUA PULUH RIBUAN");
        }
        if (uang >= 10000) {
            sepuluhRibuan = uang / 10000;
            uang = uang % 10000;
            System.out.println(sepuluhRibuan + " LEMBAR SEPULUH RIBUAN");
        }
        if (uang >= 5000) {
            limaRibuan = uang / 5000;
            uang = uang % 5000;
            System.out.println(limaRibuan + " LEMBAR LIMA RIBUAN");
        }
        if (uang >= 2000){
            duaRibuan = uang / 2000;
            uang = uang % 2000;
            System.out.println(duaRibuan + " LEMBAR DUA RIBUAN");
        }
        if (uang >= 1000){
            seribuan = uang / 1000;
            uang = uang % 1000;
            System.out.println(seribuan + " LEMBAR UANG SERIBUAN");
        }
        if (uang >= 500) {
            limaratusRupiah = uang / 500;
            uang = uang % 500;
            System.out.println(limaratusRupiah + " KEPING LIMA RATUSAN");
        }
        if (uang >= 100) {
            seratusRupiah = uang / 100;
            uang = uang % 100;
            System.out.println(seratusRupiah + " KEPING SERATUSAN");
        }

        sc.close();
        
        
    }
}
