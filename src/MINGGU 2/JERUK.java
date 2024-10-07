import java.util.Scanner;

public class JERUK {
    public static void main(String[] args) throws Exception {
    int jumlah,uangDibayar,totalHarga,kembalian;
    int harga = 24000;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Jumlah kilo jeruk yang dibeli: ");
    jumlah = keyboard.nextInt();
    System.out.print("Uang yang dibayarkan: ");
    uangDibayar = keyboard.nextInt();

    totalHarga = jumlah*harga;
    kembalian = uangDibayar-totalHarga;

    System.out.println("Total kilo yang dibeli :"+jumlah);
    System.out.println("Uang yang dibayarkan: "+uangDibayar);
    System.out.println("Harga keseluruhan: "+totalHarga);
    System.out.println("Kembaliannya: "+Math.abs(kembalian));

    keyboard.close();
    }
}
