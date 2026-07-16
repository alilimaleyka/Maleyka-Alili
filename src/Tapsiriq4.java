import java.util.Scanner;

public class Tapsiriq4 {
    public static void main(String[] args) {

        //Scanner ilə istifadəçidən bir-bir ədədlər al. İstifadəçi 0 daxil edənə qədər ədədləri cəmlə (0 özü cəmə daxil deyil).
        // Sonda cəmi Cəm: X formatında çap et. do-while dövrəsi istifadə olunmalıdır.

        Scanner sc = new Scanner(System.in);

        int eded;
        int cem = 0;
        do {
            System.out.print("Ədəd daxil edin: ");
            eded = sc.nextInt();
            if (eded != 0) {
                cem = cem + eded;
            }

        } while (eded != 0);
        System.out.println("Cəm: " + cem);

        sc.close();
    }
}
