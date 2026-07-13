import java.util.Scanner;

public class Tapsiriq9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1) Metr → Fut");
        System.out.println("2) Kiloqram → Funt");
        System.out.println("3) Selsi → Fahrenheit");
        System.out.println("0) Çıxış");
        System.out.print("Seçiminizi daxil edin: ");

        int secim = sc.nextInt();

        while (secim != 0) {
            if (secim == 1) {
                System.out.print("Metr dəyərini daxil edin: ");
                double metr = sc.nextDouble();
                double netice = metr * 3.28084;
                System.out.println("Nəticə: " + netice);
            } else if (secim == 2) {
                System.out.print("Kiloqram dəyərini daxil edin: ");
                double kiloqram = sc.nextDouble();
                double netice = kiloqram * 2.20462;
                System.out.println("Nəticə: " + netice);
            } else if (secim == 3) {
                System.out.print("Selsi dəyərini daxil edin: ");
                double selsi = sc.nextDouble();
                double netice = selsi * 9.0 / 5 + 32;
                System.out.println("Nəticə: " + netice);
            } else {
                System.out.println("Yanlış seçim etdiniz!");
            }

            System.out.println();
            System.out.println("1) Metr → Fut");
            System.out.println("2) Kiloqram → Funt");
            System.out.println("3) Selsi → Fahrenheit");
            System.out.println("0) Çıxış");
            System.out.print("Seçiminizi daxil edin: ");

            secim = sc.nextInt();
        }
        System.out.println("Çıxış edildi");

        sc.close();
    }
}