import java.util.Scanner;

public class Tapsiriq1 {
    public static void main(String[] args) {

        // İstifadəçidən 1 tam ədəd alınır.
        // Scannerdən gələn ədədin cüt və ya tək olduğunu, həmçinin müsbət, mənfi və ya sıfır olduğu təyin edilir.

        Scanner eded = new Scanner(System.in);
        System.out.print("Tam ədəd daxil edin: ");
        int tamEded = eded.nextInt();

        if (tamEded % 2 == 0) {
        System.out.println("Cüt ədəddir");
        } else {
            System.out.println("Tək ədəddir");
        }
        if (tamEded > 0) {
            System.out.println("Müsbət ədəddir");
        } else if (tamEded < 0) {
            System.out.println("Mənfi ədəddir");
        } else {
            System.out.println("Ədəd sıfırdır");
        }
    }
}
