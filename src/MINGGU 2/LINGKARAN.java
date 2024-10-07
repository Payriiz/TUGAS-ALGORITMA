import java.util.Scanner;

public class LINGKARAN {
    public static void main(String[] args) {
        Scanner lingkaran = new Scanner(System.in);

        System.out.print("Jari-Jari : ");
        double jariJari = lingkaran.nextDouble();

        boolean KelipatanTujuh = (jariJari % 7 == 0);

        double keliling;

        if (KelipatanTujuh) {
            keliling = 2 * ( 22.0 / 7) * jariJari;
        } else {
            keliling = 2 * Math.PI * jariJari;
        }

        System.out.println("Keliling lingkaran : " + keliling);

        lingkaran.close();
    }
}
