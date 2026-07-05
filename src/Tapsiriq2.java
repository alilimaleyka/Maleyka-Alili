import java.util.Scanner;

public class Tapsiriq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kredit məbləğini qeyd edin: ");
        double a = sc.nextDouble();
        System.out.print("İllik faiz dərəcəsini müəyyən edin: ");
        double b = sc.nextDouble();
        System.out.print("Kreditin müddətini(ay) qeyd edin: ");
        int c = sc.nextInt();

        double UmumiFaiz = a * (b/100);
        double UmumiOdenis = a + UmumiFaiz;
        double AylıqOdenis = UmumiOdenis / c;

        System.out.println("Ümumi faiz məbləği: " + UmumiFaiz + "AZN");
        System.out.println("Ümumi ödəniş: "+ UmumiOdenis + "AZN");
        System.out.println("Aylıq ödəniş: "+ AylıqOdenis + "AZN");

        sc.close();

    }
}
