public class WordSened extends Sened {

    public WordSened(String baslik) {
        super(baslik); }

    @Override
    public void capEt() {
        System.out.println(baslik + " adlı Word sənədi çap edilir.");
    }
}