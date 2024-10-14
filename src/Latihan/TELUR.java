package Latihan;
import java.util.Scanner;

public class TELUR {
    public static void main(String[] args) throws Exception {
        Double jumlah,uangDibayar,totalHarga,kembalian,diskon,subtotal;
        Double harga = (double) 28000;
        diskon = 0.1;
    
        Scanner keyboard = new Scanner(System.in);
    
        System.out.print("Jumlah kilo Telur yang dibeli: ");
        jumlah = keyboard.nextDouble();
        System.out.print("Uang yang dibayarkan: ");
        uangDibayar = keyboard.nextDouble();
        
        totalHarga = jumlah*harga;
        if (jumlah > 3)
            diskon = totalHarga * diskon;
        subtotal = totalHarga - diskon;
        kembalian = uangDibayar - subtotal;
        
        System.out.println("Total kilo yang dibeli :"+jumlah);
        System.out.println("Uang yang dibayarkan: "+uangDibayar);
        System.out.println("Harga keseluruhan: "+subtotal);
        System.out.println("Kembaliannya: "+kembalian);
        System.out.println("Diskonnya: "+diskon);
        

        keyboard.close();
    }
}
