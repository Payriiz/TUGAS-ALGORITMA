package Sesi_11;

public class EXPONENTIAL {
     
     public static int binarySearch(int[] arr, int left, int right, int key) {
        while (left <= right) {
            int mid = left + (right - left) / 2; 
            if (arr[mid] == key) {
                return mid; 
            } else if (arr[mid] < key) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return -1; 
    }

    
    public static int exponentialSearch(int[] arr, int n, int key) {
        if (arr[0] == key) {
            return 0; 
        }

        int i = 1;
        while (i < n && arr[i] <= key) {
            i *= 2;
        }

        
        return binarySearch(arr, i / 2, Math.min(i, n - 1), key);
    }

    public static void main(String[] args) {
        int[] arr = {9, 16, 40, 57, 79, 84, 89, 92, 94, 99, 101, 104, 200, 999}; 
        int key = 79; 
        int result = exponentialSearch(arr, arr.length, key);

        if (result != -1) {
            System.out.println("Elemen ditemukan pada indeks: " + result);
        } else {
            System.out.println("Elemen tidak ditemukan");
        }
    }
}
