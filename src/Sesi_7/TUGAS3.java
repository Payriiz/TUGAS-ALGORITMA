package Sesi_7;

import java.util.Scanner;

public class TUGAS3 {
    public static void main(String[] args) {
        int gaji;
        int jamLembur;
        int totalGaji;
        double upah;

        Scanner sc = new Scanner(System.in);
        System.out.print("MASUKKAN GAJI: ");
        gaji = sc.nextInt();
        System.out.print("MASUKKAN JAM LEMBUR: ");
        jamLembur = sc.nextInt();

        double upahLembur = Math.round(gaji/173.0);
        int lebih4jam = jamLembur - 4;

        if (jamLembur > 4) {
            upah = (4 * upahLembur) + (lebih4jam * 2 * upahLembur);
        } else {
            upah = jamLembur * upahLembur;
        } 

        totalGaji = gaji + (int) upah;
         
        System.out.println("GAJI YANG DIDAPAT: " + totalGaji );

        sc.close();
   }
}
