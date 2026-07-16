public class Tapsiriq10 {
    public static void main(String[] args) {

        //int[] ballar = {45, 78, 92, 30, 65, 88}; massivində ən kiçik balı və onun indeksini tap, çap et.
        // Düşün: indeks lazımdırsa, hansı dövrəni seçməlisən?

        int[] ballar = {45, 78, 92, 30, 65, 88};
        int enKicikBal = ballar[0];
        int indeks = 0;

        for (int i = 0; i < ballar.length; i++) {
            if (ballar[i] < enKicikBal) {
                enKicikBal = ballar[i];
                indeks = i;
            }
        }
        System.out.println("Ən kiçik bal: " + enKicikBal);
        System.out.println("İndeksi: " + indeks);
    }
}
