package Latihan;

public class S0S {
    public static void main(String[] args) {
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 6; b++) {
                if (a % 2 == 0) {
                    if (b % 2 == 0) {
                        System.out.print("S ");
                    } else {
                        System.out.print("0 ");
                    }
                } else {
                    if (b % 2 == 1) {
                        System.out.print("S ");
                    } else {
                        System.out.print("0 ");
                    }
                }
            }
            System.out.println();
        }
    }
}
