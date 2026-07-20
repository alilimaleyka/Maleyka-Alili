public class Bankomat {

    private double balans = 500;

    public void pulCek(double mebleg) {
        balansYoxla(mebleg);
    }

    private void balansYoxla(double mebleg) {

        if (mebleg > balans) {
            System.out.println("Əməliyyat uğursuzdur. Balans kifayət etmir.");
        } else {
            balans = balans - mebleg;

            System.out.println("Çəkilən məbləğ: " + mebleg + " AZN");
            System.out.println("Qalıq balans: " + balans + " AZN");
        }
    }
}