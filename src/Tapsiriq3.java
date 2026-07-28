public class Tapsiriq3 {
    public static void kocurmeEt(double meblegh) {

        if (meblegh <= 0) {
            throw new IllegalArgumentException(
                    "Məbləğ sıfır və ya mənfi ola bilməz" );
        } System.out.println("Köçürüldü: " + meblegh); }

    public static void main(String[] args) {
        try {
            kocurmeEt(500);
            kocurmeEt(-100);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}