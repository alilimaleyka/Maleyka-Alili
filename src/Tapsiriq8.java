import java.util.Scanner;

public class Tapsiriq8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Yaşı daxil et: ");
        int yas = sc.nextInt();
        int qiymet;

        //7-yə qədər pulsuz, 8-17 arası 3 AZN, 18-64 arası 7 AZN, 65+ 4 AZN.

        if (yas < 0) {
            System.out.println("Yaş mənfi ola bilməz.");
        } else {
            if (yas <= 7) {
                qiymet = 0;
            } else if (yas <= 17) {
                qiymet = 3;
            } else if (yas <= 64) {
                qiymet = 7;
            } else {
                qiymet = 4;
            }

            System.out.print("Neçə bilet alınacaq? ");
            int biletSayi = sc.nextInt();
            int umumiMebleg = qiymet * biletSayi;

            System.out.println("Bir biletin qiyməti: " + qiymet + " azn");
            System.out.println("Bilet sayı: " + biletSayi);
            System.out.println("Ümumi məbləğ: " + umumiMebleg + " azn");
        }

        sc.close();
    }
}