import java.util.Scanner;

public class Tapsiriq1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int umumiXerc = 1240;

        try {
            System.out.print("Əməliyyat sayını daxil edin: ");
            int emeliyyatSayi = scanner.nextInt();
            int ortaMebleg = umumiXerc / emeliyyatSayi;
            System.out.println("Orta əməliyyat məbləği: " + ortaMebleg);

        } catch (ArithmeticException e) {
            System.out.println("Əməliyyat sayı 0 ola bilməz.");

        } catch (Exception e) {
            System.out.println("Xəta baş verdi.");

        } finally {
            System.out.println("Hesabat tamamlandı");
        }

        scanner.close();
    }
}