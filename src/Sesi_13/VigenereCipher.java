package Sesi_13;

import java.util.Scanner;

public class VigenereCipher {

    // Method untuk menghasilkan kunci sepanjang teks
    public static String generateKey(String text, String key) {
        StringBuilder keyBuilder = new StringBuilder(key);
        while (keyBuilder.length() < text.length()) {
            keyBuilder.append(key);
        }
        return keyBuilder.substring(0, text.length());
    }

    // Method untuk enkripsi
    public static String encrypt(String text, String key) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                int shift = key.charAt(i) - base;
                char encryptedChar = (char) ((character - base + shift) % 26 + base);
                encryptedText.append(encryptedChar);
            } else {
                encryptedText.append(character); // Biarkan karakter non-alfabet tidak berubah
            }
        }

        return encryptedText.toString();
    }

    // Method untuk dekripsi
    public static String decrypt(String text, String key) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                int shift = key.charAt(i) - base;
                char decryptedChar = (char) ((character - base - shift + 26) % 26 + base);
                decryptedText.append(decryptedChar);
            } else {
                decryptedText.append(character); // Biarkan karakter non-alfabet tidak berubah
            }
        }

        return decryptedText.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Vigenère Cipher ===");
        System.out.print("Masukkan teks: ");
        String text = scanner.nextLine();

        System.out.print("Masukkan kata kunci: ");
        String key = scanner.nextLine();

        // Membuat kunci sepanjang teks
        String generatedKey = generateKey(text, key);

        String encryptedText = encrypt(text, generatedKey);
        System.out.println("Teks terenkripsi: " + encryptedText);

        String decryptedText = decrypt(encryptedText, generatedKey);
        System.out.println("Teks terdekripsi: " + decryptedText);

        scanner.close();
    }
}

