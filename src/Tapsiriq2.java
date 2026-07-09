import java.util.Scanner;

public class Tapsiriq2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cem = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "-ci tələbənin balını daxil et: ");
            int bal = sc.nextInt();

            cem = cem + bal;
        }

        //Orta bal 70-dən yuxarıdırsa "Sinif uğurludur", aşağıdırsa "Əlavə işə ehtiyac var" çap et.

        double ortaBal = cem / 10.0;
        System.out.println("Cəm: " + cem);
        System.out.println("Orta bal: " + ortaBal);

        if (ortaBal > 70) {
            System.out.println("Sinif uğurludur");
        } else {
            System.out.println("Əlavə işə ehtiyac var");
        }

        sc.close();
    }
}