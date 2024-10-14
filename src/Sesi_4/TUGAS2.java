package Sesi_4;

public class TUGAS2 {
    public static void main(String[] args) {

        // VERSI PANJANG:
        // int a = 1;
        // int b = 2;
        // int c = 3;
        // do {
        // System.out.print(a + " ");
        // a++;
        // }while (a <=6);
        // System.out.println();

        // do {
        // System.out.print(b + " ");
        // b++;
        // }while (b <= 7);
        // System.out.println();

        // do {
        // System.out.print(c + " ");
        // c++;
        // }while (c <= 8);

        // System.out.println();

        int a = 1;
        do {
            if (a == 1) {
                for (int b = 1; b <= 6; b++) {
                    System.out.print(b + " ");
                }
            } else if (a == 2) {
                for (int b = 2; b <= 7; b++) {
                    System.out.print(b + " ");
                }
            } else {
                for (int b = 3; b <= 8; b++) {
                    System.out.print(b + " ");
                }
            }

            System.out.println(" ");
            a++;
        } while (a <= 3);
    }
}
