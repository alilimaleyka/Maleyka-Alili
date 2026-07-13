import java.util.Scanner;

public class Tapsiriq6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Uçuş kodunun ilk 2 hərfini qeyd edin: ");
        String ucusKodu = sc.next();

        if (ucusKodu.equalsIgnoreCase("AZ")) {
            System.out.println("Aviaşirkətiniz: Azerbaijan Airlines");

        } else if (ucusKodu.equalsIgnoreCase("TK")) {
            System.out.println("Aviaşirkətiniz: Turkish Airlines");

        } else if (ucusKodu.equalsIgnoreCase("QR")) {
            System.out.println("Aviaşirkətiniz: Qatar Airways");

        } else {
            System.out.println("Aviaşirkətiniz: Naməlum aviaşirkət");
        }
        sc.close();
    }
}