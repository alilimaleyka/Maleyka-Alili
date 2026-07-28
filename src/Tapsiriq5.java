import java.util.ArrayList;

public class Tapsiriq5 {
    public static void main(String[] args) {
        ArrayList<String> musteriler = new ArrayList<>();

        musteriler.add("Yunis");
        musteriler.add("Məleykə");
        musteriler.add("Fatimə");
        musteriler.add("Tamara");
        musteriler.add(0, "VİP Anar");

        System.out.println(
                "Məleykə növbədədir? " + musteriler.contains("Məleykə"));

        musteriler.set(2, "Məleykə");
        for (int i = 0; i < musteriler.size(); i++) {
            System.out.println(i + ": " + musteriler.get(i)); }
    }
}
