import java.util.Scanner;

public class Tapsiriq3 {
    public static void main(String[] args) {

        // Scannerdə stifadəçidən 0-100 aralığında imtahan balı alınır.
        // Bala görə qiymət avtomatik müəyyən edilir. Əlavə əgər 0-100 aralığında olmayaq baı daxil edilsə xəbərdarlıq gəlir.

        Scanner eded = new Scanner(System.in);

        System.out.print("İmtahan balınızı daxil edin: ");
        int bal = eded.nextInt();

        if (bal > 100 || bal < 0) {
            System.out.println("Yanlış bal qeyd edirsiniz!");
        } else if (bal >= 90) {
            System.out.println("Əla (5)");
        } else if (bal >= 80) {
            System.out.println("Çox yaxşı (4)");
        } else if (bal >= 70) {
            System.out.println("Yaxşı (3)");
        } else if (bal >= 60) {
            System.out.println("Kafi (2)");
        } else {
            System.out.println("Qeyri-kafi (1)");
        }
    }
}