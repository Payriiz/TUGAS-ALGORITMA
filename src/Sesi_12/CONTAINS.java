package Sesi_12;

public class CONTAINS {
   public static boolean contains(int[] arr, int n, int target) {
    if (n == arr.length) {
        return false;
    }
    if (arr[n] == target) {
        return true;
    }
    return contains(arr, n + 1, target);
   }

   public static void main(String[] args) {
    int arr[] = {1, 3, 5, 9, 10, 14, 20, 29, 50};
    int target = 10;
    int n = 0;
    boolean result = contains(arr, n, target);
    System.out.println("Array ditemukan: " + result);
   }
}
