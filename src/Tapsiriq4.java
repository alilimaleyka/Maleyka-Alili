public class Tapsiriq4 {

    public static void nagdCixar(double meblegh)
            throws LimitKecildiException {

        double limit = 2000;
        if (meblegh > limit) {
            throw new LimitKecildiException(
                    "Gündəlik 2000 AZN limiti keçildi" );
        } System.out.println("Nağd çıxarıldı: " + meblegh + " AZN"); }

    public static void main(String[] args) {
        try {
            nagdCixar(1500);
            nagdCixar(2500);
        } catch (LimitKecildiException e) {
            System.out.println(e.getMessage());
        }
    }
}