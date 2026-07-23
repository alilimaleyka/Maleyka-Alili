public class FaylMenecer implements Yuklene, Endirile {

    @Override
    public void yukle() {
        System.out.println("Fayl sistemə yükləndi."); }

    @Override
    public void endir() {
        System.out.println("Fayl sistemdən endirildi.");
    }
}