public class Tapsiriq6 {

    public static void main(String[] args) {

        PDFSened pdfSened = new PDFSened("Sənədlər");
        pdfSened.capEt();

        System.out.println();

        WordSened wordSened = new WordSened("Test planı");
        wordSened.capEt();
    }
}