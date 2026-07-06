import java.util.Scanner;

public class Tapsiriq12 {
    public static void main(String[] args) {

        // Yaşa görə bilet qiyməti müəyyən edilib çap edilir.

        Scanner eded = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int yas = eded.nextInt();

        if (yas < 0) {
            System.out.println("Yanlış yaş");
        } else if (yas <= 5) {
            System.out.println("Pulsuz");
        } else if (yas <= 17) {
            System.out.println("5 AZN");
        } else if (yas <= 64) {
            System.out.println("10 AZN");
        } else {
            System.out.println("3 AZN");
        }
    }
}