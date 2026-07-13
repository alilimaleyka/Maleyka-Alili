import java.util.Scanner;

public class Tapsiriq7 {
    public static void main(String[] args) {

        final int gizliKod = 275;
        int cehdSayi = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Seyfin gizli kodunu (1-999 arasında) daxil edin: ");
        int kod = sc.nextInt();
        cehdSayi++;

        while (kod != gizliKod) {
            if (kod < 1 || kod > 999) {
                System.out.println(
                        "Seyf kodu 1-999 arasındadır, zəhmət olmasa uyğun kod daxil edin!");
            } else if (kod > gizliKod) {
                System.out.println("Böyükdür");
            } else {
                System.out.println("Kiçikdir");
            }

            System.out.print("Kodu yenidən daxil edin: ");
            kod = sc.nextInt(); cehdSayi++;
        }

        System.out.println("Seyf açıldı!");
        System.out.println("Cəhd sayı: " + cehdSayi);

        sc.close();
    }
}