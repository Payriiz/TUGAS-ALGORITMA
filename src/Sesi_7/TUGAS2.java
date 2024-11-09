package Sesi_7;

import java.util.Scanner;

public class TUGAS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLagi = "y";
        String mahasiswa[] = new String[100];
        String keterangan[] = new String[100];
        String matakuliah[] = new String[100];
        double bobot[] = new double[100];
        int sks[] = new int[100];
        int semester[] = new int[100];
        int nilai[] = new int[100];
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
                nilai[i] = sc.nextInt();
                if (nilai[i] >= 85) {
                    keterangan[i] = "A";
                    bobot[i] = 4.0;
                } else if (nilai[i] >= 80) {
                    keterangan[i] = "A-";
                    bobot[i] = 3.7;
                } else if (nilai[i] >= 75) {
                    keterangan[i] = "B+";
                    bobot[i] = 3.3;
                } else if (nilai[i] >= 70) {
                    keterangan[i] = "B";
                    bobot[i] = 3.0;
                } else if (nilai[i] >= 65) {
                    keterangan[i] = "B-";
                    bobot[i] = 2.7;
                } else if (nilai[i] >= 60) {
                    keterangan[i] = "C+";
                    bobot[i] = 2.3;
                } else if (nilai[i] >= 55) {
                    keterangan[i] = "C";
                    bobot[i] = 2.0;
                } else if (nilai[i] >= 50) {
                    keterangan[i] = "C-";
                    bobot[i] = 1.7;
                } else if (nilai[i] >= 45){
                    keterangan[i] = "D";
                    bobot[i] = 1.0;
                }else{
                    keterangan[i] = "E";
                    bobot[i] = 0.0;
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
        System.out.printf("%-4s %-20s %-6s %-12s %-5s %-6s\n", "No", "Mata Kuliah", "SKS", "Huruf Mutu","Bobot", "Nilai");

        double totalBobot = 0;
        for (int j = 0; j < i; j++) {
            System.out.printf("%-4d %-20s %-6d %-12s %-6.1f %-5d\n", (j + 1), matakuliah[j], sks[j], keterangan[j], bobot[j], nilai[j]);
            totalBobot += bobot[j] * sks[j];
        }

        System.out.println("=".repeat(80));

        double IP = totalBobot / totalSKS;
        System.out.println("Jumlah SKS: " + sum);
        System.out.println("IP SEMESTER: " + IP);
        System.out.println("SKS MAKSIMAL YANG DAPAT DIAMBIL SEMESTER DEPAN: 24");

        sc.close();
    }
}
