public class Tapsiriq2 {

    public static void main(String[] args) {

        Bildiris bildiris = new Bildiris();
        bildiris.gonder();

        System.out.println("-----");

        EmailBildiris emailBildiris = new EmailBildiris();
        emailBildiris.gonder();

        System.out.println("-----");

        TeciliEmailBildiris teciliEmailBildiris =
                new TeciliEmailBildiris();

        teciliEmailBildiris.gonder();
    }
}