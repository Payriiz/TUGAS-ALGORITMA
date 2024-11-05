package Sesi_7;

public class TUGAS1 {
    public static void main(String[] args) {
        int a = 1;
        do {
            for (int b = 0; b < 4 - a; b++) {
                System.out.print("S ");
            }
            for (int c = 5 - a; c < 5; c++) {
                System.out.print("0 ");
            }
            System.out.println();
            a++;
        } while (a <= 4);

    }
}
