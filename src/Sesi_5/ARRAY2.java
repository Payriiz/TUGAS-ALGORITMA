package Sesi_5;

import java.util.Scanner;

public class ARRAY2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String inputLagi = "y";
        String mahasiswa [] = new String[10];
        int i = 0;
        do {
            System.out.print("Maskkan Nama: ");
            mahasiswa[i] = sc.nextLine();
            System.out.print("Ingin menambahkan lagi? (y/n)");
            inputLagi = sc.nextLine().toLowerCase();
            i++;
        } while (i < mahasiswa.length && inputLagi.equals("y"));
        System.out.println("DAFTAR MAHASISWA");

        for (int j = 0; j < mahasiswa.length; j++) {
            if (mahasiswa[j] == null) {
                break;
            }
            System.out.println((j+1) + ". " + mahasiswa[j]);
        }
        sc.close();
    }
}
