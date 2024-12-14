package UJIAN;

import java.util.Scanner;

public class ESSAY2 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        String inputLagi = "y";
        String mahasiswa[] = new String[100];
        int nilai[] = new int[100];
        String matakuliah[] = new String[100];
        int sks[] = new int[100];
        int semester[] = new int[100];
        String huruf[] = new String[100];
        int i = 0;
        int sum = 0;
        int totalSKS = 0;

        do {
            System.out.print("Masukan Nama Mahasiswa: ");
            mahasiswa[i] = sc.next();
            System.out.print("Masukkan Semester Mahasiswa: ");
            semester[i] = sc.nextInt();

            do {

                System.out.print("Masukkan Mata Kuliah: ");
                matakuliah[i] = sc.next();
                System.out.print("SKS: ");
                sks[i] = sc.nextInt();
                System.out.print("Masukan Nilai Mata Kuliah: ");
                huruf[i] = sc.next();

                if (huruf[i].equals("A")) {
                    nilai[i] = 4;
                }
                else if (huruf[i].equals("B")){
                    nilai[i] = 3;
                }
                else if (huruf[i].equals("C")){
                    nilai[i] = 2;
                }
                else if (huruf[i].equals("D")){
                    nilai[i] = 1;
                }
                else if (huruf[i].equals("E")){
                    nilai[i] = 0;
                }

                sum = sum + sks[i];
                totalSKS += sks[i];
                i++;
                sc.nextLine();
                System.out.print("Tambah Mata Kuliah Lagi? (y/n): ");
                inputLagi = sc.nextLine().toLowerCase();

            } while (i < matakuliah.length && inputLagi.equals("y"));

            System.out.print("Tambah Mahasiswa Lagi? (y/n): ");
            inputLagi = sc.nextLine().toLowerCase();

        } while (i < mahasiswa.length && inputLagi.equals("y"));

        System.out.println("=".repeat(80));
        System.out.printf("NAMA     : %s\n", mahasiswa[0]);
        System.out.printf("SEMESTER : %d\n", semester[0]);
        System.out.println("-".repeat(80));
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.printf("%-4s %-20s %-6s %-6s %-5s\n", "No", "Mata Kuliah", "SKS", "Nilai", "Bobot");

        double rata_rata = 0;
        double jumlahrata = 0;
        for (int j = 0; j < i; j++) {
            System.out.printf("%-4d %-20s %-5d %-6d %-5s\n", (j + 1), matakuliah[j], sks[j], nilai[j], huruf[j]);
            double totalrata = (sks[j] * nilai[j]);
            jumlahrata += totalrata;
            rata_rata = jumlahrata / totalSKS;
        }

        System.out.println("=".repeat(80));
        System.out.println("Jumlah SKS: " + sum);
        System.out.println("Rata-Rata: " + rata_rata);

        sc.close();
    }
}
