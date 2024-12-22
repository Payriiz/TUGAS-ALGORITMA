package Sesi_12;

import java.util.Scanner;

public class PALINDROME {
    public static boolean isPalindrome(String str, int start, int end) {
        if (start == end) {
            System.out.print(str + " adalah Palindrome");
            return true;
        }
        if (str.charAt(start) == str.charAt(end))
            return isPalindrome(str, start + 1, end - 1);
        System.out.print(str + " bukan Palindrome");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kata: ");
        String str = sc.nextLine();
        isPalindrome(str, 0, str.length() - 1);

        sc.close();
    }
}
