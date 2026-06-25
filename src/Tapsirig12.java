public class Tapsirig12 {
    public static void main(String[] args) {

        String tamAd = "nigar əliyeva";

        int bosluqIndeksi = tamAd.indexOf(" ");

        String ad = tamAd.substring(0, bosluqIndeksi);
        String soyad = tamAd.substring(bosluqIndeksi + 1);

        String formatliAd = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();
        String formatliSoyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase();

        String formatliTamAd = formatliAd + " " + formatliSoyad;

        String bashHerfler = ad.substring(0, 1).toUpperCase() + "." +
                soyad.substring(0, 1).toUpperCase() + ".";

        String boyukHerfle = tamAd.toUpperCase();

        System.out.print("Tam ad (formatlanmış): " + formatliTamAd);
        System.out.print(" Yalnız ad: " + formatliAd);
        System.out.print(" Yalnız soyad: " + formatliSoyad);
        System.out.print(" Baş hərflər: " + bashHerfler);
        System.out.print(" Böyük hərflə: " + boyukHerfle);
    }
}