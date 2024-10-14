package Latihan;
import java.util.Scanner;

public class BELANJA {
    public static void main(String[] args) {
        Double totalBelanja, totalBayar, diskon;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Total Belanja: ");
        totalBelanja = sc.nextDouble();
        if (totalBelanja > 200000){
            diskon = 12.0/100*totalBelanja;
            if (diskon > 50000)
            diskon = 50000.0;
        }
        // Diskon = diskon > 50000 ? 50000 : diskon; // dengan cara ternary
        else if (totalBelanja > 100000){
            diskon = 10.0/100;
            if (diskon > 15000)
                diskon = 15000.0;
        }
        else if (totalBelanja > 50000){
            diskon = 5.0/100*totalBelanja;
            if (diskon > 4000)
                diskon = 4000.0;
        }
        else
            diskon = 0.0;

        totalBayar = totalBelanja - diskon;
        System.out.println("TOTAL BELANJA: "+totalBelanja);
        System.out.println("TOTAL BAYAR: "+totalBayar);
        System.out.println("DISKON: "+diskon);
        sc.close();
    }
}