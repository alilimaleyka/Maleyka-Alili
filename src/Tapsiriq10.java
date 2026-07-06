import java.util.Scanner;

public class Tapsiriq10 {
    public static void main(String[] args) {

        // Switch ilə seçimə uyğun mesaj çap edilir.

        Scanner eded = new Scanner(System.in);

        System.out.println("1 - Balans yoxla");
        System.out.println("2 - Pul yatır");
        System.out.println("3 - Pul çıxar");
        System.out.println("4 - Çıxış");

        System.out.print("Seçiminizi daxil edin: ");
        int secim = eded.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Balansınız: 1376 AZN");
                break;

            case 2:
                System.out.println("Pul yatırma əməliyyatı seçildi");
                break;

            case 3:
                System.out.println("Pul çıxarma əməliyyatı seçildi");
                break;

            case 4:
                System.out.println("Çıxış edildi");
                break;

            default:
                System.out.println("Yanlış seçim");
        }
    }
}