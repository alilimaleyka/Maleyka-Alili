import java.util.Scanner;

public class Tapsiriq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("3 rəqəmli tam ədəd daxil edin: ");
        int sayi = sc.nextInt();

        int Yuzler = sayi / 100;
        int Onlar = (sayi % 100) / 10;
        int Birlər = sayi % 10;
        int reqemlerinCemi = Yuzler + Onlar + Birlər;

        System.out.println("Yüzlər rəqəmi: " +Yuzler);
        System.out.println("Onlar rəqəmi: " +Onlar);
        System.out.println("Birlər rəqəmi: " +Birlər);
        System.out.println("Rəqəmlərin cəmi: " +reqemlerinCemi);

        sc.close();
    }
}