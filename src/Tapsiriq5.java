public class Tapsiriq5 {
    public static void main(String[] args) {

       // Hesab hesab = new Hesab();
       // hesab.balansGoster();
       // hesab.faizHesabla();
     // Xəta verir (java: Hesab is abstract; cannot be instantiated)

    Depozit depozit = new Depozit();

        depozit.balansGoster();
        depozit.faizHesabla();

        System.out.println();

    Kredit kredit = new Kredit();

        kredit.balansGoster();
        kredit.faizHesabla();
}
}