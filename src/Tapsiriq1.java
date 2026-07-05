import java.util.Scanner;

public class Tapsiriq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci tam ədədi daxil edin: ");
        int a = sc.nextInt();
        System.out.print("İkinci tam ədədi daxil edin: ");
        int b = sc.nextInt();

        int toplama = a + b;
        int cixma = a - b;
        int vurma = a * b;
        int bolme = a / b;
        int qaliq = a % b;

        System.out.println("Toplama: "+toplama); //Toplama: 27 (True)
        System.out.println("Çıxma: "+cixma); //Çıxma: 17 (True)
        System.out.println("Vurma: "+vurma); //Vurma: 110 (True)
        System.out.println("Bölmə: "+bolme); //Bölmə: 4 (İnt/int nəticəsi də int olur, amma bu bölmədə ondalıq var.)
        System.out.println("Qalıq: "+qaliq); //Qalıq: 2 (True)

        sc.close();

    }
    }
