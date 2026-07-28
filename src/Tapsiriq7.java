import java.util.HashMap;
import java.util.Scanner;

public class Tapsiriq7 {
    public static void main(String[] args) {

        HashMap<String, String> musteriler = new HashMap<>();

        musteriler.put("M001", "Məleykə");
        musteriler.put("M002", "Yunis");
        musteriler.put("M003", "Anar");
        musteriler.put("M004", "Tamara");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Müştəri kodunu daxil edin: ");
        String kod = scanner.nextLine();

        if (musteriler.containsKey(kod)) {
            System.out.println("Müştəri adı: " + musteriler.get(kod));
        } else {
            System.out.println("Belə müştəri tapılmadı");
        }
        scanner.close();
    }
}