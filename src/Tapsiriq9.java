import java.util.Scanner;

public class Tapsiriq9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Email daxil edin: ");
        String email = sc.nextLine();

        boolean atVarMi = email.contains("@");
        boolean noqteVarMi = email.contains(".");
        boolean ikiSimvolvarMi = email.indexOf("@") >= 2;

        System.out.println("@ var mı: " + atVarMi);
        System.out.println(". var mı: " + noqteVarMi);
        System.out.println("@-dən əvvəl ən azı 2 simvol var mı: " + ikiSimvolvarMi);

        sc.close();
    }
}