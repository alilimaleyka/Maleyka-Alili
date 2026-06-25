public class Bonus {
    public static void main(String[] args) {

        final int MIN_YAS = 18;
        final int MIN_PAROL_UZUNLUGU = 8;
        final double MIN_GELIR = 500.0;

        String ad = "məleykə";
        int yas = 23;
        double gelir = 1360.50;
        String parol = "Maleyka2024";
        String email = "alilimaleyka@gmail.com";

        // Ad boş deyil (uzunluğu>0)
        boolean adBosDeyil = ad.length() > 0;
        System.out.println("Ad boş deyil: " + adBosDeyil);

        // Yaş minimum yaşdan böyük və ya bərabərdir
        boolean yasUygundur = yas >= MIN_YAS;
        System.out.println("Yaş uyğundur: " + yasUygundur);

        // Gəlir minimum gəlirdən çoxdur
        boolean gelirUygundur = gelir > MIN_GELIR;
        System.out.println("Gəlir uyğundur: " + gelirUygundur);

        // Parol minimum uzunluğu ödəyir
        boolean parolUygundur = parol.length() >= MIN_PAROL_UZUNLUGU;
        System.out.println("Parol uyğundur: " + parolUygundur);

        // Email daxilində @ işarəsi var
        boolean emailUygundur = email.contains("@");
        System.out.println("Email uyğundur: " + emailUygundur);

        // Qeydiyyat uğurludur? (bütün yoxlamalar true olmalı)
        boolean qeydiyyatUgurludur = adBosDeyil && yasUygundur && gelirUygundur && parolUygundur && emailUygundur;
        System.out.println("Qeydiyyat uğurludur: " + qeydiyyatUgurludur);

        // Adın baş hərfini böyük göstəririk
        String formatliAd = ad.substring(0, 1).toUpperCase() + ad.substring(1);
        System.out.println("İstifadəçi adı: " + formatliAd);

        // final dəyişənlər dəyişdirilə bilməz.
        //MIN_YAS = 22;
        // Xəta: Cannot assign a value to final variable 'MIN_YAS'

        //MIN_PAROL_UZUNLUGU = 12;
        // Xəta: Cannot assign a value to final variable 'MIN_PAROL_UZUNLUGU'

        // MIN_GELIR = 700.0;
        // Xəta: Cannot assign a value to final variable 'MIN_GELIR'
    }
}