package Sesi_12;

public class SUMOFTHREE {
    public static int sumOfThree(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        } else {
            if (n == 1) {
                System.out.print(a);
            } else {
                System.out.print(a + ", ");
            }
            sumOfThree(n-1, b, c, a+b+c);
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 9;
        int a = 1;
        int b = 1;
        int c = 1;
        sumOfThree(n, a, b, c);
    }
}
