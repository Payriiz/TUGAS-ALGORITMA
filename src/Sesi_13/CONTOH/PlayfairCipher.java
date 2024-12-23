package Sesi_13.CONTOH;

import java.util.Scanner;

public class PlayfairCipher {

    private static char[][] keyMatrix = new char[5][5];

    // Method untuk membuat matriks kunci
    public static void generateKeyMatrix(String key) {
        StringBuilder matrixKey = new StringBuilder();
        boolean[] isAdded = new boolean[26];
        key = key.toUpperCase().replaceAll("[^A-Z]", "").replace("J", "I");

        // Tambahkan karakter dari kunci ke matriks
        for (char c : key.toCharArray()) {
            if (!isAdded[c - 'A']) {
                matrixKey.append(c);
                isAdded[c - 'A'] = true;
            }
        }

        // Tambahkan sisa alfabet ke matriks
        for (char c = 'A'; c <= 'Z'; c++) {
            if (!isAdded[c - 'A'] && c != 'J') {
                matrixKey.append(c);
            }
        }

        // Mengisi matriks kunci
        int index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                keyMatrix[i][j] = matrixKey.charAt(index++);
            }
        }
    }

    // Method untuk memproses teks
    public static String processText(String text) {
        text = text.toUpperCase().replaceAll("[^A-Z]", "").replace("J", "I");
        StringBuilder processedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            processedText.append(text.charAt(i));

            // Jika ada pasangan huruf yang sama, tambahkan 'X'
            if (i < text.length() - 1 && text.charAt(i) == text.charAt(i + 1)) {
                processedText.append('X');
            }
        }

        // Jika panjang teks ganjil, tambahkan 'X'
        if (processedText.length() % 2 != 0) {
            processedText.append('X');
        }

        return processedText.toString();
    }

    // Method untuk mengenkripsi
    public static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        text = processText(text);

        for (int i = 0; i < text.length(); i += 2) {
            char a = text.charAt(i);
            char b = text.charAt(i + 1);
            int[] posA = findPosition(a);
            int[] posB = findPosition(b);

            if (posA[0] == posB[0]) { // Sama baris
                encryptedText.append(keyMatrix[posA[0]][(posA[1] + 1) % 5]);
                encryptedText.append(keyMatrix[posB[0]][(posB[1] + 1) % 5]);
            } else if (posA[1] == posB[1]) { // Sama kolom
                encryptedText.append(keyMatrix[(posA[0] + 1) % 5][posA[1]]);
                encryptedText.append(keyMatrix[(posB[0] + 1) % 5][posB[1]]);
            } else { // Membentuk persegi panjang
                encryptedText.append(keyMatrix[posA[0]][posB[1]]);
                encryptedText.append(keyMatrix[posB[0]][posA[1]]);
            }
        }

        return encryptedText.toString();
    }

    // Method untuk mendekripsi
    public static String decrypt(String text) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i += 2) {
            char a = text.charAt(i);
            char b = text.charAt(i + 1);
            int[] posA = findPosition(a);
            int[] posB = findPosition(b);

            if (posA[0] == posB[0]) { // Sama baris
                decryptedText.append(keyMatrix[posA[0]][(posA[1] + 4) % 5]);
                decryptedText.append(keyMatrix[posB[0]][(posB[1] + 4) % 5]);
            } else if (posA[1] == posB[1]) { // Sama kolom
                decryptedText.append(keyMatrix[(posA[0] + 4) % 5][posA[1]]);
                decryptedText.append(keyMatrix[(posB[0] + 4) % 5][posB[1]]);
            } else { // Membentuk persegi panjang
                decryptedText.append(keyMatrix[posA[0]][posB[1]]);
                decryptedText.append(keyMatrix[posB[0]][posA[1]]);
            }
        }

        return decryptedText.toString();
    }

    // Method untuk mencari posisi huruf dalam matriks
    public static int[] findPosition(char c) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (keyMatrix[i][j] == c) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Playfair Cipher ===");
        System.out.print("Masukkan kunci: ");
        String key = scanner.nextLine();

        System.out.print("Masukkan teks: ");
        String text = scanner.nextLine();

        generateKeyMatrix(key);

        System.out.println("Matriks Kunci:");
        for (char[] row : keyMatrix) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        String encryptedText = encrypt(text);
        System.out.println("Teks terenkripsi: " + encryptedText);

        String decryptedText = decrypt(encryptedText);
        System.out.println("Teks terdekripsi: " + decryptedText);

        scanner.close();
    }
}

