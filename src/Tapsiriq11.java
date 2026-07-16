public class Tapsiriq11 {
    public static void main(String[] args) {

        //int[] orijinal = {5, 10, 15, 20}; massivinin əsl kopyasını adi for ilə yarat (int[] b = a; yazmaq olmaz!).
        // Sonra kopyanın 0-cı elementini 99 et və hər iki massivi çap et. Orijinal massiv dəyişməməlidir.

        int[] orijinal = {5, 10, 15, 20};
        int[] kopya = new int[orijinal.length];
        for (int i = 0; i < orijinal.length; i++) {
            kopya[i] = orijinal[i];
        }
        kopya[0] = 99;
        System.out.print("Orijinal massiv: ");
        for (int eded : orijinal) {
            System.out.print(eded + " ");
        }

        System.out.println();

        System.out.print("Kopya massiv: ");
        for (int eded : kopya) {
            System.out.print(eded + " ");
        }
    }
}
