import java.util.Scanner;

public class Tapsiriq4 {
    public static void main(String[] args) {

        // Scannerdə istifadəçidən il alınır.
        // İlin uyğun il olub-olmadığı ternary operator ilə yoxlanılır.

        Scanner eded = new Scanner(System.in);

        System.out.print("İli daxil edin: ");
        int il = eded.nextInt();

        System.out.println((il % 4 == 0 && il % 100 != 0) || il % 400 == 0 ? "Uyğun il" : "Uyğun deyil");
    }
}