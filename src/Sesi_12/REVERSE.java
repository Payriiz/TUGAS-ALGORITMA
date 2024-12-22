package Sesi_12;

public class REVERSE {
    public static void printReverse(int n) {
        for (int i = n; i > 0; i--) {
            System.out.print(i);
            if (i > 1)
            System.out.print(", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printReverse(5);
    }
}
