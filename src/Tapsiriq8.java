import java.util.Scanner;

public class Tapsiriq8 {
    public static void main(String[] args) {

        Scanner eded = new Scanner(System.in);

        System.out.print("1-ci tərəfi daxil edin: ");
        double a = eded.nextDouble();
        System.out.print("2-ci tərəfi daxil edin: ");
        double b = eded.nextDouble();
        System.out.print("3-cü tərəfi daxil edin: ");
        double c = eded.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Bərabərtərəfli");
            } else if (a == b || a == c || b == c) {
                System.out.println("Bərabəryanlı");
            } else {
                System.out.println("Müxtəliftərəfli");
            }
        } else {
            System.out.println("Belə üçbucaq mövcud deyil");
        }
    }
}