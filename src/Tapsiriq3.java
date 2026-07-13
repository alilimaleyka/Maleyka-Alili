import java.util.Scanner;

public class Tapsiriq3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stok = 200;

        System.out.print("Əməliyyat sayını qeyd elə: ");
        int emeliyyat = sc.nextInt();

        while (emeliyyat != 0) {

            if (emeliyyat > 0) {
                System.out.println("Mal gəlib");
            } else {
                System.out.println("Mal satılıb"); }

            stok = stok + emeliyyat;

            System.out.println("Yeni stok: " + stok);

            System.out.print("Əməliyyat sayını qeyd elə: ");
            emeliyyat = sc.nextInt();
        }
        sc.close();
    }
}