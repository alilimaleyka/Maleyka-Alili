import java.util.Scanner;

public class Tapsiriq7 {
    public static void main(String[] args) {

        // Scannerdə istifadəçidən lazımi məlumatlar alınır, daha sonra kredit uyğunluğu avtomstik tapılır.

        Scanner eded = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int yas = eded.nextInt();
        System.out.print("Aylıq gəlirinizi daxil edin: ");
        double gelir = eded.nextDouble();
        System.out.print("Kredit məbləğini daxil edin: ");
        double kreditMeblegi = eded.nextDouble();

        if (yas < 21 || yas > 65) {
            System.out.println("Rədd edildi: yaş uyğun deyil");
        } else if (gelir <= 800) {
            System.out.println("Rədd edildi: gəlir uyğun deyil");
        } else if (kreditMeblegi < 300 || kreditMeblegi > 50000) {
            System.out.println("Rədd edildi: kredit məbləği uyğun deyil");
        } else {
            System.out.println("TƏSDİQ EDİLDİ");
        }
    }
}