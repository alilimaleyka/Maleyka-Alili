public class Tapsiriq9 {
    public static void main(String[] args) {

        //8 xanalı boş int massivi yarat. Onu adi for ilə 10, 20, 30 … 80 dəyərləri ilə doldur.
        // Sonra for-each ilə bütün elementləri bir sətirdə, aralarında boşluq olmaqla çap et.

        int[] ededler = new int[8];
        for (int i = 0; i < ededler.length; i++){
            ededler [i] = (i+1) * 10;
        }
        for (int eded : ededler) {
            System.out.print(eded + " ");
        }
    }
}
