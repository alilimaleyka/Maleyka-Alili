public class Tapsiriq2 {

    //Telebe sinfində tələbənin adı və imtahan balı gizli saxlanılsın. Bal yalnız 0–100 aralığında qəbul edilsin.
    // Balı oxuyan hissə balla yanaşı hərfi qiyməti də qaytarsın (90+ Əla, 70–89 Yaxşı, 50–69 Kafi, aşağı Qeyri-kafi).
    // Proqramda tələbə yarat və nəticəni "Ad: X, Bal: Y, Qiymət: Z" formatında çap et.

    private String telebeAdi;
    private int imtahanBali;

    public void setTelebeAdi(String yeniAd) {
        telebeAdi = yeniAd;
    }
    public void setImtahanBali(int yeniBal) {

        if (yeniBal >= 0 && yeniBal <= 100) {
            imtahanBali = yeniBal;
        } else {
            System.out.println("Xəta: İmtahan balı 0-100 arasında olmalıdır.");
        }
    }
    public void neticeniGoster() {

        String qiymet;

        if (imtahanBali >= 90) {
            qiymet = "Əla";
        } else if (imtahanBali >= 70) {
            qiymet = "Yaxşı";
        } else if (imtahanBali >= 50) {
            qiymet = "Kafi";
        } else {
            qiymet = "Qeyri-kafi";
        }

        System.out.println("Ad: " + telebeAdi
                + ", Bal: " + imtahanBali
                + ", Qiymət: " + qiymet);
    }

    public static void main(String[] args) {

        Tapsiriq2 telebe = new Tapsiriq2();

        telebe.setTelebeAdi("Məleykə");
        telebe.setImtahanBali(86);

        telebe.neticeniGoster();
    }
}
