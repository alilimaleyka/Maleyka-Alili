public class Tapsiriq4 {

    //Ata sinif Hesab-da hesab sahibinin adı, balans və balansı artıran metod olsun.
    // EmanetHesabi varisi ondan miras alsın və özünə illik faiz hesablayıb balansa əlavə edən metod yazsın.
    // Proqramda əmanət hesabı yarat, mədaxil et, faizi tətbiq et və son balansı çap et.
    public static void main(String[] args) {

        EmanetHesabi emanetHesabi = new EmanetHesabi();

        emanetHesabi.hesabSahibi = "Məleykə";
        emanetHesabi.balans = 1000;
        emanetHesabi.medaxilEt(1000);
        emanetHesabi.faizTetbiqEt(10);

        System.out.println("Hesab sahibi: "
                + emanetHesabi.hesabSahibi);

        System.out.println("Son balans: "
                + emanetHesabi.balans + " AZN");
    }
}
