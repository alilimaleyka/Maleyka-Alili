import java.util.Scanner;

public class Tapsiriq6 {
    public static void main(String[] args) {

        // Switch ilə sadə kalkulyator əməliyyatları yerinə yetirilir.

        Scanner eded = new Scanner(System.in);

        System.out.print("1-ci ədədi daxil edin: ");
        double birinciEded = eded.nextDouble();
        System.out.print("2-ci ədədi daxil edin: ");
        double ikinciEded = eded.nextDouble();
        System.out.print("Əməliyyat işarəsini daxil edin (+, -, *, /): ");
        String emeliyyat = eded.next();

        switch (emeliyyat) {
            case "+":
                System.out.println("Nəticə: " + (birinciEded + ikinciEded));
                break;

            case "-":
                System.out.println("Nəticə: " + (birinciEded - ikinciEded));
                break;

            case "*":
                System.out.println("Nəticə: " + (birinciEded * ikinciEded));
                break;

            case "/":
                if (ikinciEded == 0) {
                    System.out.println("0-a bölmək olmaz!");
                } else {
                    System.out.println("Nəticə: " + (birinciEded / ikinciEded));
                }
                break;

            default:
                System.out.println("Naməlum əməliyyat işarəsi");
        }
    }
}