public class EmanetHesabi extends Hesab {

    void faizTetbiqEt(double faiz) {
        double faizMeblegi = balans * faiz / 100;
        balans = balans + faizMeblegi;
        System.out.println(faizMeblegi
                + " AZN illik faiz balansa əlavə edildi.");
    }
}