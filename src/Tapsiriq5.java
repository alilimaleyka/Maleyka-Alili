public class Tapsiriq5 {

    //Kalkulyator sinfində eyni adlı vurma metodunu üç fərqli formada yaz: iki tam ədəd, üç tam ədəd və iki kəsr ədəd üçün.
    // Proqramda hər üç variantı çağır və nəticələri çap et.
    public static void main(String[] args) {

        Kalkulyator kalkulyator = new Kalkulyator();
        kalkulyator.vur(4, 5);
        kalkulyator.vur(2, 3, 4);
        kalkulyator.vur(2.5, 4.0);
    }
}
