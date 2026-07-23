public class Bildiris {

//super.metod() · multilevel
//general
//Bir bildiriş sistemi qur. Bildiriş ata class-ında gonder() metodu olsun (ümumi bir mesaj çap etsin).
// EmailBildiris class-ı Bildiriş-dən miras alıб gonder()-i override etsin — amma öz işini görməzdən əvvəl
// ata versiyasını super.gonder() ilə çağırsın, sonra öz email-ə aid əlavəsini etsin. Daha sonra
// TeciliEmailBildiris class-ını EmailBildiris-dən miras aldır (çoxsəviyyəli) və eyni məntiqlə bir addım da genişləndir.
// Hər üç səviyyədən obyekt yaradıб nəticəni müşahidə et.

    public void gonder() {
        System.out.println("Ümumi bildiriş göndərilir.");
    }
}
