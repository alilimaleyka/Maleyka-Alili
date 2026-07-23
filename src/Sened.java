public abstract class Sened {

    //abstract · super()
    //general
    //Sened adlı abstract class-ında baslik xüsusiyyəti və onu təyin edən konstruktor olsun,
    // həmçinin bir abstract metod — capEt(). PDFSened və WordSened varisləri həm ata konstruktorunu
    // super ilə çağırsın, həm də capEt()-i tamamlasın. Hər iki varisdən obyekt yaradıб çap et —
    // abstract class-ın konstruktorunun necə işlədiyini izlə.

    String baslik;

    public Sened(String baslik) {
        this.baslik = baslik;

        System.out.println("Sənəd constructor-u işlədi."); }
    public abstract void capEt();
}
