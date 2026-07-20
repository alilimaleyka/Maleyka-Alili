public class Tapsiriq6 {

    //Ata sinif Bildiris-də mesaj göndərən metod olsun. EmailBildiris, SmsBildiris və PushBildiris varisləri həmin
    // metodu öz kanalına uyğun yenidən yazsın. Proqramda üç bildirişi ata tipli massivdə saxla və dövrə ilə
    // hamısını göndər.
    public static void main(String[] args) {

        Bildiris[] bildirisler = {
                new EmailBildiris(),
                new SmsBildiris(),
                new PushBildiris() };

        for (Bildiris bildiris : bildirisler) {
            bildiris.mesajGonder();
        }
    }
}
