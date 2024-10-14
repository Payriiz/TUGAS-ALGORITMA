package Sesi_2;
import java.util.Scanner;

public class KUBUS {
    public static void main(String[] args) {
        Scanner kubus = new Scanner(System.in);

        System.out.print("Panjang Sisi : ");
        double sisi = kubus.nextDouble();
        
        double volume = sisi * sisi * sisi;
        System.out.print("Volume Kubus : " + volume);

        kubus.close();
    }
}
