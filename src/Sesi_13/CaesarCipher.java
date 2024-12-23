package Sesi_13;

import java.util.Scanner;

public class CaesarCipher {

    // Method untuk enkripsi
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        shift = shift % 26; // Menghindari pergeseran lebih dari alfabet

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                char encryptedChar = (char) ((character - base + shift) % 26 + base);
                result.append(encryptedChar);
            } else {
                result.append(character); // Biarkan karakter non-alfabet tidak berubah
            }
        }

        return result.toString();
    }

    // Method untuk dekripsi
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - (shift % 26)); // Menggunakan kebalikan dari pergeseran
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Caesar Cipher ===");
        System.out.print("Masukkan teks: ");
        String text = scanner.nextLine();

        System.out.print("Masukkan kunci pergeseran (shift): ");
        int shift = scanner.nextInt();

        String encryptedText = encrypt(text, shift);
        System.out.println("Teks terenkripsi: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Teks terdekripsi: " + decryptedText);

        scanner.close();
    }
}
