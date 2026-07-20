public class Tapsiriq3 {

    //Ata sinif Isci-də işçinin adı və özünü təqdim edən metod olsun. Menecer və Developer sinifləri ondan miras alsın
    // və hər biri özünə xas bir iş görən metod əlavə etsin. Proqramda hər iki varisdən obyekt yarat, miras alınmış
    // və öz metodlarını çağır.

    public static void main(String[] args) {

        Menecer menecer = new Menecer();

        menecer.ad = "Aysel";
        menecer.ozunuTeqdimEt();
        menecer.iclasKecir();

        Developer developer = new Developer();

        developer.ad = "Murad";
        developer.ozunuTeqdimEt();
        developer.kodYazir();
    }
}
