import java.util.Scanner;

public class Tapsiriq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci tam ədəd daxil edin: ");
        int a = sc.nextInt();
        System.out.print("İkinci tam ədəd daxil edin: ");
        int b = sc.nextInt();

        System.out.println("Əvvəl a: " +a);
        System.out.println("Əvvəl b: " +b);

        a = a + b;
        System.out.println("1-ci addımdan sonra a: " +a);
        System.out.println("1-ci addımdan sonra b: " +b); //Burda b əvvəlki qiymətində qalır.

        b = a - b;
        System.out.println("2-ci addımdan sonra b: " +b);
        System.out.println("2-ci addımdan sonra a: " +a); //Burda a 1-ci addımda olan dəyərdə qalır.

        a = a - b;
        System.out.println("3-cü addımdan sonra a: " + a);
        System.out.println("3-cü addımdan sonra b: " + b);

        sc.close();
    }
}
