public class Hesab {

    String hesabSahibi;
    double balans;
    void medaxilEt(double mebleg) {
        balans = balans + mebleg;

        System.out.println(mebleg + " AZN balansa əlavə edildi.");
    }
}