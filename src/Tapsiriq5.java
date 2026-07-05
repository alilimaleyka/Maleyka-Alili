import java.util.Scanner;

public class Tapsiriq5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir int dəyəri qeyd edin: ");
        int BirİntEded = sc.nextInt();
        double DoubleDoubleEded = BirİntEded;

        System.out.print("Bir double dəyəri qeyd edin: ");
        double BirDoubleEded = sc.nextDouble();
        int İntEded = (int) BirDoubleEded;

        System.out.println("Widening nəticəsi: " +DoubleDoubleEded);
        System.out.println("Narrowing nəticəsi: " +İntEded); //Burda nəticə 5 çıxdı ama, yazdığım double dəyər 5.5 idi qalıq 0.5 kəsildi.

        sc.close();
    }
}
