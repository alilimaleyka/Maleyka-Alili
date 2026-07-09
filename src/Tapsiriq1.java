import java.util.Scanner;

public class Tapsiriq1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Balı daxil et: ");
        int bal = sc.nextInt();

        //Balı hərfi qiymətə çevir (90+ Əla, 70-89 Yaxşı, 50-69 Kafi, aşağı Qeyri-kafi)
        //nəticəni "Bal: X → Qiymət: Y" formatında çap et.

        String qiymet;

        if ( bal < 0 || bal > 100 ) {
            System.out.println("Daxil edilən ballar 0 və 100 bal arasında olmalıdır"); //Bu hissəini scannerdə 105 bal yazandan sonra gördüm səhv geridönüş edir sonra yazdım.
        } else {
            if (bal >= 90) {
                qiymet = "Əla";
            } else if (bal >= 70) {
                qiymet = "Yaxşı";
            } else if (bal >=50) {
                qiymet = "Kafi";
            } else {
            } qiymet = "Qeyri-kafi";

            System.out.println("Bal: " + bal + " bal" + " Qiymət: " + qiymet);

            sc.close();
        }
    }

}
