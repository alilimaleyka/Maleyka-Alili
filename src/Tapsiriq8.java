public class Tapsiriq8 {
    public static void main(String[] args) {

        //int[] ballar = {67, 91, 54, 88, 73}; massivində ən böyük balı for-each ilə tap və çap et.
        // Başlanğıc dəyər kimi 0 yox, massivin ilk elementini götür — dərsdə niyəsini danışdıq.

        int[] ballar = {67, 91, 54, 88, 73};
        int enBoyukBal = ballar[0];
        for (int bal : ballar) {
            if (bal > enBoyukBal) {
                enBoyukBal = bal;
            }
        }
        System.out.println("Ən böyük bal: " + enBoyukBal);
    }
}