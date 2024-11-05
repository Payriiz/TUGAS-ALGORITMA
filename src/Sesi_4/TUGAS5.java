package Sesi_4;

public class TUGAS5 {
    public static void main(String[] args) {
        int a = 1;
        do {
            for (int b = 0; b < 6 - a; b++) {
                System.out.print("* ");
            }
            for (int c = 6 - a; c < 6; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
            a++;
        } while (a <= 6);

    }
}
