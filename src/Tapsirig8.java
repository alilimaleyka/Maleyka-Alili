public class Tapsirig8 {
    public static void main(String[] args) {

        int yas = 25;
        double gelir = 1200.0;
        boolean tarix = true;

        // Kredit şərti: yaş 21-65, gəlir 800-dən çox, tarix true olmalı

        boolean yasUygun = yas >= 21 && yas <= 65;
        // Əvvəlki: yas > 21 && yas < 65, belə olanda 21 yaşlı müştəri uyğun sayılmır, şərtə zidd gəlir.
        // Şərtdə 21 yaş daxil olduğu üçün >= istifadə etməliyik.

        boolean gelirUygun = gelir > 800;
        // Bu sətir düzdür, dəyişiklik etmədim.

        boolean uygun = yasUygun && gelirUygun && tarix;
        // Kredit üçün bütün şərtlər eyni vaxtda true olmalıdır, amma || bu olanda 1 şərt true olsa ümumi cavab true çıxır.


        System.out.println("Yaş uyğun:   " + yasUygun);
        System.out.println("Gəlir uyğun: " + gelirUygun);
        System.out.println("Kredit:      " + uygun);
    }
}
