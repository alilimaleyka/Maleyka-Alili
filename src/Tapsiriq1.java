public class Tapsiriq1 {

    //Telefon sinfi yarat. Batareya faizi kənardan birbaşa dəyişdirilə bilməsin —
    // dəyər yalnız nəzarətli yolla təyin olunsun
    // və yalnız 0–100 aralığı qəbul edilsin, kənar dəyərdə xəta mesajı çap olunsun. Faizi oxumaq da mümkün olsun.
    // Proqramda bir neçə fərqli dəyərlə (düzgün və yanlış) yoxla və son vəziyyəti çap et.

    private int batareyaFaizi;

    public void setBatareyaFaizi(int yeniFaiz) {

        if (yeniFaiz >= 0 && yeniFaiz <= 100) {
            batareyaFaizi = yeniFaiz;
        } else {
            System.out.println("Xəta: Batareya faizi 0-100 arasında olmalıdır.");
        }
    }
    public void batareyaFaiziniGoster() {
        System.out.println("Batareyanın son vəziyyəti: "
                + batareyaFaizi + "%");
    }
    public static void main(String[] args) {

        Tapsiriq1 telefon = new Tapsiriq1();

        telefon.setBatareyaFaizi(70);
        telefon.setBatareyaFaizi(120);
        telefon.setBatareyaFaizi(-10);
        telefon.setBatareyaFaizi(85);

        telefon.batareyaFaiziniGoster();
    }
}
