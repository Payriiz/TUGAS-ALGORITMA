import java.util.Scanner;

public class PERSEGIPANJANG {
    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);

        System.out.print("Panjang: ");
        double Panjang = pp.nextDouble();
        System.out.print("Lebar: ");
        double Lebar = pp.nextDouble();

        double luas = Panjang * Lebar ;

        System.out.print("Luas Persegi Panjang : " + luas);

        pp.close();

    }
}
