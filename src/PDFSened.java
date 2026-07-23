public class PDFSened extends Sened {

    public PDFSened(String baslik) {
        super(baslik); }

    @Override
    public void capEt() {
        System.out.println(baslik + " adlı PDF sənədi çap edilir.");
    }
}