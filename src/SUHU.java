import java.util.Scanner;

public class SUHU {
    public static void main(String[] args) throws Exception {
       Scanner suhu = new Scanner(System.in);
       System.out.print("Suhu Dalam Bentuk Celsius: ");
       double Celcius = suhu.nextDouble();

       double fahrenheit = Celcius * 9/5 + 32;
       System.out.println("Suhu Fahrenheit : " + fahrenheit + " F");

       suhu.close();
    }
}
