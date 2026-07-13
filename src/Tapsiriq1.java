import java.util.Scanner;

public class Tapsiriq1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Havanın temperaturunu (°C, tam ədəd) daxil et: ");
        int temperatur = sc.nextInt();

        String status;

        if (temperatur > 25) {
            status = "İsti";
        } else if (temperatur >= 15) {
            status = "Mülayim";
        } else if (temperatur >= 0) {
            status = "Soyuq";
        } else {
            status = "Şaxta";
        }

        System.out.println("Temperatur: " + temperatur + "°C → Status: " + status);

        sc.close();
    }
}