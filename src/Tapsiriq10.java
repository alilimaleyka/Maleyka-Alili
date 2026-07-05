import java.util.Scanner;

public class Tapsiriq10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ad-Soyad daxil edin: ");
        String adSoyad = sc.nextLine().trim();

        System.out.print("Yaşınızı daxil edin: ");
        int yas = sc.nextInt();

        sc.nextLine();

        System.out.print("İllik gəlirinizi daxil edin: ");
        String illikGelirMetn = sc.nextLine().trim();

        double illikGelir = Double.parseDouble(illikGelirMetn);

        boolean adSoyaddaBosluqVar = adSoyad.contains(" ");
        boolean adSoyadUzunluguOk = adSoyad.length() >= 5;
        boolean adSoyadOk = adSoyaddaBosluqVar && adSoyadUzunluguOk;

        boolean yasOk = yas >= 18 && yas <= 70;

        boolean gelirOk = illikGelir >= 3000;

        boolean sonQerar = adSoyadOk && yasOk && gelirOk;

        System.out.println("Sığorta Müraciəti Hesabatı");
        System.out.println("Ad-Soyad: " + adSoyad.toUpperCase());
        System.out.println("Ad-Soyad şərti: " + adSoyadOk);
        System.out.println("Yaş şərti: " + yasOk);
        System.out.println("Gəlir şərti: " + gelirOk);
        System.out.printf("İllik gəlir: %.2f AZN%n", illikGelir);
        System.out.printf("Son qərar: %s%n", sonQerar);

        sc.close();
    }
}