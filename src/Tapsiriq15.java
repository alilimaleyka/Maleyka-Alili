import java.util.Scanner;

public class Tapsiriq15 {
    public static void main(String[] args) {

        // Parolun uzunluğuna (lenght ilə) görə gücü yoxlanılır.

        Scanner metn = new Scanner(System.in);

        System.out.print("Parolu daxil edin: ");
        String parol = metn.nextLine();

        int uzunluq = parol.length();

        if (uzunluq == 0) {
            System.out.println("Parol boş ola bilməz");
        } else if (uzunluq < 6) {
            System.out.println("Zəif");
        } else if (uzunluq <= 9) {
            System.out.println("Orta");
        } else {
            System.out.println("Güclü");
        }
    }
}