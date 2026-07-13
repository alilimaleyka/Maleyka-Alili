import java.util.Scanner;

public class Tapsiriq2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double umumiSatis = 0;

        for (int gun = 1; gun <= 3; gun++) {
            System.out.print(gun + "-ci günün satışı: ");
            double satis = sc.nextDouble();
            umumiSatis = umumiSatis + satis;
        }

        double ortaSatis = umumiSatis / 3.0;
        System.out.println("Ümumi satış: " + umumiSatis + " AZN");
        System.out.println("Orta günlük satış: " + ortaSatis + " AZN");

        if (ortaSatis > 500) {
            System.out.println("Həftə uğurludur");
        } else {
            System.out.println("Satışı artırmaq lazımdır");
        }

        sc.close();
    }
}