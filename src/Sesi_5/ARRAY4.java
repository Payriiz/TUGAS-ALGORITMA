package Sesi_5;

import java.util.ArrayList;
import java.util.Scanner;

class Buah {
    String nama;
    int harga;

    Buah (String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    int Harga(int jumlah) {
        return this.harga;
    }
}

class Belanjaan {
    Buah buah;
    int jumlah;

    Belanjaan (Buah buah, int jumlah){
        this.buah = buah;
        this.jumlah = jumlah;
    }

    int Total() {
        return buah.Harga(jumlah) * jumlah;
    }
    int hargaPerItem() {
        return buah.Harga(jumlah);
    }
}


public class ARRAY4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ArrayList untuk buah-buah yang tersedia
        ArrayList<Buah> daftarBuah = new ArrayList<>();

        //Daftar buah yang dimasukkan kedalam ArrayList
        daftarBuah.add(new Buah("Apel", 35000));
        daftarBuah.add(new Buah("Jeruk", 50000));
        daftarBuah.add(new Buah("Mangga", 25000));
        daftarBuah.add(new Buah("Duku", 15000));
        daftarBuah.add(new Buah("Semangka", 20000));

        //menyimpan barang belanjaan kedalam Arraylist 
        ArrayList <Belanjaan> keresek = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("MENU:");
            System.out.println("1. BELI BUAH");
            System.out.println("2. STRUK BELANJA");
            System.out.println("3. KELUAR");
            System.out.print("MEMILIH: ");
            pilihan = sc.nextInt();

            if (pilihan == 1) {
                String lanjut;
                do {
                    System.out.println("PILIH BUAH 1-5: ");
                    for (int i = 0; i < daftarBuah.size(); i++) {
                        System.out.printf("%-3d %-10s Rp%-10d\n", i + 1, daftarBuah.get(i).nama, daftarBuah.get(i).harga);
                    }

                    System.out.print("PILIHAN BUAH: ");
                    int pilihanBuah = sc.nextInt();
                    System.out.print("JUMLAH YANG DIBELI: ");
                    int jumlah = sc.nextInt();

                    //memasukkan ke keresek
                    keresek.add(new Belanjaan(daftarBuah.get(pilihanBuah - 1), jumlah));

                    System.out.print("INPUT LAGI? (y/n): ");
                    lanjut = sc.next();
                } while (lanjut.equalsIgnoreCase("y"));

            }else if (pilihan == 2) {
                if (keresek.isEmpty()) {
                    System.out.println("KERSEK MASIH KSOSONG BAGAIKAN HATI");
                } else {
                    System.out.println("DAFTAR BELANJAAN ANDA:");
                    System.out.println("=".repeat(73));
                    System.out.printf("%-3s %-10s %-7s %-10s %-10s\n", "No", "Nama Buah", "Jumlah", "Harga", "Total");

                    int totalHarga = 0;
                    for (int i = 0; i < keresek.size(); i++) {
                        Belanjaan belanja = keresek.get(i);
                        int hargaPerItem = belanja.hargaPerItem();
                        int Total = belanja.Total();
                        System.out.printf("%-3d %-10s %-7d Rp.%-7d Rp.%-10d\n", (i + 1), belanja.buah.nama, belanja.jumlah, hargaPerItem, Total);
                        totalHarga += Total;
                    }

                    System.out.println("=".repeat(73));
                    System.out.printf("Total harga\t: Rp.%d\n", totalHarga);

                    int diskon = totalHarga * 15 / 100;
                    int totalBayar = totalHarga - diskon;
                    System.out.printf("Diskon (15%%)\t: Rp.%d\n", diskon);
                    System.out.printf("Total bayar\t: Rp.%d\n", totalBayar);
                    System.out.println("-".repeat(73));
                }
            }else if (pilihan == 3) {
                System.out.println("PILIHAN TIDAK VALID");
            }
        } while (pilihan != 3);

            System.out.println("HATUR NUHUN!");
            sc.close();
    }
}
