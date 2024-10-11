import java.util.Scanner;

public class JERUK3 {
    public static void main(String[] args) {
        int jeruk;
        Scanner sc = new Scanner(System.in);
        System.out.print("JUMLAH JERUK: ");
        jeruk = sc.nextInt();

        int beliSatu = 3000, beliDua = 5000, beliLima = 10000;
        int total = 0;

        if (jeruk >= 5) {
            int limaJeruk = jeruk / 5;
            total += limaJeruk * beliLima;
            jeruk = jeruk % 5;
        }

        if (jeruk >= 2) {
            int duaJeruk = jeruk / 2;
            total += duaJeruk * beliDua;
            jeruk = jeruk % 2;
        }

        if (jeruk >= 1) {
            total = jeruk * beliSatu;
        }

        System.out.println("JUMLAH HARGA : " + total);

        sc.close();




    }
}
