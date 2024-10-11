import java.util.Scanner;

public class LULUS {
    public static void main(String[] args) {
        int nilai;
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Nilai : ");
        nilai = sc.nextInt();

        if (nilai >= 75)
            System.out.println("ANDA DINYATAKAN LULUS");
        else
            System.out.println("ANDA DINYATAKAN TIDAK LULUS");
        
        sc.close();


    }
}
