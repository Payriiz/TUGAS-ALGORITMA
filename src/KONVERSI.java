import java.util.Scanner;

public class KONVERSI {
    public static void main(String[] args) {
        int nilai;
        Scanner sc = new Scanner(System.in);
        System.out.print("MASUKKAN NILAI : ");
        nilai = sc.nextInt();

        if ( nilai >= 85){
            System.out.println("A");
        }
        else if ( nilai >= 75) {
            System.out.println("B");
        }
        else if ( nilai >= 65) {
            System.out.println("C");
        }
        else if ( nilai >= 55) {
            System.out.println("D");
        }
        else {
            System.out.println("E");
        }
        sc.close();

    }
}
