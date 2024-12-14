package UJIAN;

import java.util.Scanner;

public class ESSAY1 {
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

        double upahLembur = Math.round(gaji/150.0);
        int lebih1koma5jam = jamLembur - 5;

        if (jamLembur > 5) {
            upah = (5 * upahLembur) + (lebih1koma5jam * 1.5 * upahLembur);
        } else {
            upah = jamLembur * upahLembur;
        } 

        totalGaji = gaji + (int) upah;
         
        System.out.println("GAJI YANG DIDAPAT: " + totalGaji );

        sc.close();
    }
}
