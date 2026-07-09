import java.util.Scanner;

public class Tapsiriq6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Mobil nömrənizi qeyd edin: ");
        String nomre = sc.next();

        //İstifadəçidən mobil nömrə formatında ədəd (məs. kod hissəsi 050, 051, 055, 070, 077, 099-dan biri olmalıdır) daxil almağı simulyasiya et: kodu daxil et,
        //uyğun operatoru (Bakcell, Azercell, Nar) çap et, uyğun deyilsə "Naməlum operator" yaz.

        String qiymet;

        if (nomre.equals("050") || nomre.equals("051")) {
            System.out.println("Operator: Azercell");
        } else if (nomre.equals("055") || nomre.equals("099")) {
            System.out.println("Operator: Bakcell");
        } else if (nomre.equals("070") || nomre.equals("077")) {
            System.out.println("Operator: Nar");
        } else {
            System.out.println("Naməlum operator");
        }
        sc.close();
    }
}
