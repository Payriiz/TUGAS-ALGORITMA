package Sesi_11;

public class EXPONENTIAL {
     // Fungsi untuk melakukan pencarian biner
     public static int binarySearch(int[] arr, int left, int right, int key) {
        while (left <= right) {
            int mid = left + (right - left) / 2; // Hitung indeks tengah
            if (arr[mid] == key) {
                return mid; // Kunci ditemukan
            } else if (arr[mid] < key) {
                left = mid + 1; // Cari di sebelah kanan
            } else {
                right = mid - 1; // Cari di sebelah kiri
            }
        }
        return -1; // Kunci tidak ditemukan
    }

    // Fungsi untuk melakukan pencarian eksponensial
    public static int exponentialSearch(int[] arr, int n, int key) {
        if (arr[0] == key) {
            return 0; // Jika elemen pertama adalah kunci
        }

        int i = 1;
        // Mencari rentang yang mengandung kunci
        while (i < n && arr[i] <= key) {
            i *= 2; // Meningkatkan indeks secara eksponensial
        }

        // Melakukan pencarian biner dalam rentang yang ditemukan
        return binarySearch(arr, i / 2, Math.min(i, n - 1), key);
    }

    public static void main(String[] args) {
        int[] arr = {6, 11, 19, 24, 33, 54, 67, 81, 94, 99}; // Array terurut
        int key = 67; // Elemen yang dicari
        int result = exponentialSearch(arr, arr.length, key);

        if (result != -1) {
            System.out.println("Elemen ditemukan pada indeks: " + result);
        } else {
            System.out.println("Elemen tidak ditemukan");
        }
    }
}
