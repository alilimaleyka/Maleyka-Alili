import java.util.Scanner;

public class Tapsiriq8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Celsius dərəcəsini int dəyəri kimi qeyd edin: ");
        int celsius = sc.nextInt();

        double fahrenheitIntBolme = celsius * 9 / 5 + 32;
        double fahrenheitDoubleBolme = celsius * 9.0 / 5 + 32;

        System.out.println("9 / 5 ilə Fahrenheit nəticəsi: " + fahrenheitIntBolme); //Celsius dəyərinə 508 yazdım, burda nəticədə ondalıq hissə itir.
        System.out.println("9.0 / 5 ilə Fahrenheit nəticəsi: " + fahrenheitDoubleBolme); //Bunu yazmaq daha məntiqlidir çünki ondalıq hissə itirmir.

        sc.close();
    }
}
