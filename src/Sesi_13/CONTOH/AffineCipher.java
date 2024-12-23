package Sesi_13.CONTOH;

import java.util.Scanner;

public class AffineCipher {

    // Method untuk menghitung invers modular
    public static int modInverse(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1) {
                return x;
            }
        }
        return -1; // Tidak ada invers modular
    }

    // Method untuk enkripsi
    public static String encrypt(String plaintext, int a, int b) {
        StringBuilder ciphertext = new StringBuilder();
        int m = 26; // Jumlah huruf alfabet

        for (char character : plaintext.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                int encryptedChar = (a * (character - base) + b) % m + base;
                ciphertext.append((char) encryptedChar);
            } else {
                ciphertext.append(character); // Biarkan karakter non-alfabet tidak berubah
            }
        }

        return ciphertext.toString();
    }

    // Method untuk dekripsi
    public static String decrypt(String ciphertext, int a, int b) {
        StringBuilder plaintext = new StringBuilder();
        int m = 26; // Jumlah huruf alfabet
        int aInverse = modInverse(a, m); // Cari invers modular dari a

        if (aInverse == -1) {
            throw new IllegalArgumentException("Nilai a tidak memiliki invers modular. Pilih nilai lain.");
        }

        for (char character : ciphertext.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                int decryptedChar = (aInverse * ((character - base - b + m) % m)) % m + base;
                plaintext.append((char) decryptedChar);
            } else {
                plaintext.append(character); // Biarkan karakter non-alfabet tidak berubah
            }
        }

        return plaintext.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Affine Cipher ===");
        System.out.print("Masukkan teks: ");
        String text = scanner.nextLine();

        System.out.print("Masukkan nilai a (harus coprime dengan 26): ");
        int a = scanner.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();

        // Validasi nilai a
        if (modInverse(a, 26) == -1) {
            System.out.println("Nilai a tidak valid (tidak coprime dengan 26). Program dihentikan.");
            return;
        }

        String encryptedText = encrypt(text, a, b);
        System.out.println("Teks terenkripsi: " + encryptedText);

        String decryptedText = decrypt(encryptedText, a, b);
        System.out.println("Teks terdekripsi: " + decryptedText);

        scanner.close();
    }
}
