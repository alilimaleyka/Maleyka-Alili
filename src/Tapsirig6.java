public class Tapsirig6 {
    public static void main(String[] args) {

        final double PI = 3.14159;
        final int MAX_DENEME = 3;
        final String BANK_KODU = "ABB01";

        System.out.println("PI ədədi: " + PI);
        System.out.println("Maksimum deneme sayı: " + MAX_DENEME);
        System.out.println("Bank kodu: " + BANK_KODU);

        // PI = 5;
        // System.out.println("PI ədədi: " + PI);
        // Xəta mesajı: cannot assign a value to final variable PI

        // MAX_DENEME = 5;
        // System.out.println("Maksimum deneme sayı: " + MAX_DENEME);
        // Xəta mesajı: cannot assign a value to final variable MAX_DENEME

        // BANK_KODU = "Kapital11";
        // System.out.println("Bank kodu: " + BANK_KODU);
        // Xəta mesajı: cannot assign a value to final variable BANK_KODU
    }
}
