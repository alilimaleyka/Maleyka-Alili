import java.util.ArrayList;

public class Tapsiriq6 {
    public static void main(String[] args) {
        ArrayList<Integer> emeliyyatlar = new ArrayList<>();

        emeliyyatlar.add(150);
        emeliyyatlar.add(300);
        emeliyyatlar.add(500);
        emeliyyatlar.add(200);
        emeliyyatlar.add(350);

        int cem = 0;

        for (Integer meblegh : emeliyyatlar) {
            cem += meblegh; }

        System.out.println("Ümumi məbləğ: " + cem);
        emeliyyatlar.clear();
        System.out.println("Siyahı boşdur? " + emeliyyatlar.isEmpty());
    }
}