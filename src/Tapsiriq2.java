import java.util.Scanner;

public class Tapsiriq2 {
    public static void main(String[] args) {

        // İstifadəçidən 3 tam ədəd alınır.
        // Bu ədədlər arasında ən böyük və ən kiçik olan tapılıb göstərilir.

        Scanner eded = new Scanner(System.in);

        System.out.print("1-ci tam ədədi daxil edin: ");
        int a = eded.nextInt();
        System.out.print("2-ci tam ədədi daxil edin: ");
        int b = eded.nextInt();
        System.out.print("3-cü tam ədədi daxil edin: ");
        int c = eded.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Ən böyük: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Ən böyük: " + b);
        } else {
            System.out.println("Ən böyük: " + c);
        }

        if (a <= b && a <= c) {
            System.out.println("Ən kiçik: " + a);
        } else if (b <= a && b <= c) {
            System.out.println("Ən kiçik: " + b);
        } else {
            System.out.println("Ən kiçik: " + c);
        }
    }
}