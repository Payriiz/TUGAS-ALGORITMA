import java.util.Scanner;

public class TELUR {
    public static void main(String[] args) throws Exception {
        Double jumlah,uangDibayar,totalHarga,kembalian;
        Double harga = (double) 28000;
    
        Scanner keyboard = new Scanner(System.in);
    
        System.out.print("Jumlah kilo Telur yang dibeli: ");
        jumlah = keyboard.nextDouble();
        System.out.print("Uang yang dibayarkan: ");
        uangDibayar = keyboard.nextDouble();
    
        totalHarga = jumlah*harga;
        kembalian = uangDibayar-totalHarga;
    
        System.out.println("Total kilo yang dibeli :"+jumlah);
        System.out.println("Uang yang dibayarkan: "+uangDibayar);
        System.out.println("Harga keseluruhan: "+totalHarga);
        System.out.println("Kembaliannya: "+kembalian);

        keyboard.close();
    }
}
