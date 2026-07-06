import java.util.Scanner;

public class Tapsiriq13 {
    public static void main(String[] args) {

        // bmi = ceki / (boy * boy) düsturla hesablanır və nəticəyə görə kateqoriya göstərilir.

        Scanner eded = new Scanner(System.in);

        System.out.print("Çəkinizi daxil edin (kq): ");
        double ceki = eded.nextDouble();
        System.out.print("Boyunuzu daxil edin (metr): ");
        double boy = eded.nextDouble();
        double bmi = ceki / (boy * boy);

        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Arıq");
        } else if (bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi <= 29.9) {
            System.out.println("Artıq çəkili");
        } else {
            System.out.println("Piylənmə");
        }
    }
}