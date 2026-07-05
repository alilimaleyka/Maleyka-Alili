import java.util.Scanner;

public class Tapsiriq6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir ədədi String kimi qeyd edin: ");
        String ededMetn = sc.next();

        int intEdedmetn = Integer.parseInt(ededMetn);
        int a = intEdedmetn + 15;

        String b = String.valueOf(a);
        int Uzunluq = b.length();

        System.out.println("Daxil edilən String: " +ededMetn);
        System.out.println("İnt dəyərinə dəyişdirilmiş String: " +intEdedmetn);
        System.out.println("Riyazi əməliyyat nəticəsi 1: " +a);
        System.out.println("Riyazi əməliyyat nəticəsini String dəyərə çeviririk: " +b);
        System.out.println("Uzunluq: " +Uzunluq);

        sc.close();
    }
}
