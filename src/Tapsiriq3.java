import java.util.Scanner;

public class Tapsiriq3 {
    public static void main(String[] args) {

        //Scanner ilə istifadəçidən ədəd al. Ədəd müsbət (0-dan böyük) olana qədər Yenidən daxil edin: yazıb təkrar soruş. Müsbət ədəd daxil edildikdə Qəbul edildi: X çap et.
        // do-while istifadə et — ədəd ən azı bir dəfə soruşulmalıdır.

        Scanner sc = new Scanner(System.in);
        int eded;
        String mesaj = "Ədəd daxil edin: ";
        do {
            System.out.print(mesaj);
            eded = sc.nextInt();
            mesaj = "Yenidən daxil edin: ";
        } while (eded <= 0);
        System.out.println("Qəbul edildi: " + eded);

        sc.close();
    }
}