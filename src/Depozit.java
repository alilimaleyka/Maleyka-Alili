public class Depozit extends Hesab {

    @Override
    public void faizHesabla() {
        double faiz = balans * 14 / 100;
        System.out.println("Depozit faizi: " + faiz + " AZN");
    }
}
