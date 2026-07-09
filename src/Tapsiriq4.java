import java.util.Scanner;

public class Tapsiriq4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int enCoxQol = 0;
        int enYaxsiOyuncu = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "-ci oyunçunun qol sayını daxil et: ");
            int qol = sc.nextInt();

            if (qol > enCoxQol) {
                enCoxQol = qol;
                enYaxsiOyuncu = i;
            }
        }

        System.out.println("Ən çox qol vuran oyunçu: " + enYaxsiOyuncu + "-ci oyunçu");
        System.out.println("Qol sayı: " + enCoxQol);

        sc.close();
    }
}