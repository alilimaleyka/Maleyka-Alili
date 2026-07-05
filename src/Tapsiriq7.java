import java.util.Scanner;

public class Tapsiriq7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir double dəyəri daxil edin: ");
        double deyer = sc.nextDouble();

        int castingNetice = (int) deyer;
        long roundNetice = Math.round(deyer);

        System.out.println("Casting nəticəsi: " + castingNetice); //Burda double ədədin ondalıq hissəsini silir yazır.
        System.out.println("Yuvarlaqlaşdırma nəticəsi: " + roundNetice); //Burda isə double dəyəri yuvarlaqlaşdırır.
        //Ama bu nəticələr həmişə eyni ola bilməz. Baxır double dəyərini biz neçə yazırıq. Yuvarlaşdırmada ondalıq 5-dən yuxarı olarsa bu iki dəyər fərqli olur.

        sc.close();
    }
}
