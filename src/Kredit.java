public class Kredit extends Hesab {

    @Override
    public void faizHesabla() {
        double faiz = balans * 20 / 100;
        System.out.println("Kredit faizi: " + faiz + " AZN");
    }
}