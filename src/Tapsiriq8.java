import java.util.Scanner;

public class Tapsiriq8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int yas = sc.nextInt();
        int biletQiymeti = 0;

        if (yas < 0) {
            System.out.println("Yaş mənfi ola bilməz!");
            sc.close();
            return;
        } else if (yas <= 6) {
            biletQiymeti = 0;
        } else if (yas <= 17) {
            biletQiymeti = 2;
        } else if (yas <= 60) {
            biletQiymeti = 5;
        } else {
            biletQiymeti = 3;
        }

        System.out.println("Bir biletin qiyməti: " + biletQiymeti + " AZN");
        System.out.print("Neçə bilet almaq istəyirsiniz: ");
        int biletSayi = sc.nextInt();

        if (biletSayi < 0) {
            System.out.println("Bilet sayı mənfi ola bilməz!");
            sc.close();
            return;
        }

        int umumiMebleg = biletQiymeti * biletSayi;
        System.out.println("Ümumi məbləğ: " + umumiMebleg + " AZN");

        sc.close();
    }
}