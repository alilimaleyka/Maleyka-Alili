public abstract class Hesab {

    //abstract
    //general
    //Hesab adlı abstract class yarat. İçində bir adi metod olsun — balansGoster() (tam gövdəli) —
    // və bir abstract metod — faizHesabla() (gövdəsiz). Depozit və Kredit varisləri faizHesabla()-nı
    // öz qaydasında tamamlasın. Hər iki varisdən obyekt yaradıб metodları çağır. Qeyd: Hesab
    // class-ının özündən birbaşa obyekt yaratmağa çalışsan nə baş verdiyini yoxla.

    double balans = 1370;

    public void balansGoster() {
        System.out.println("Balans: " + balans + " AZN");
    }

    public abstract void faizHesabla();
}
