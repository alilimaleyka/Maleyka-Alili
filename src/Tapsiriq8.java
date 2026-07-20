public class Tapsiriq8 {

    //Bankomat sinfində balans gizli saxlanılsın. İstifadəçinin görəcəyi yeganə metod pul çəkmək olsun — məbləği o qəbul
    // etsin, yoxlama isə arxada gizli metodda getsin: balans kifayət etmirsə imtina mesajı, edirsə çəkilən məbləğ və
    // qalıq çap olunsun. Proqramda bir uğursuz və bir uğurlu çəkim et.

    public static void main(String[] args) {

        Bankomat bankomat = new Bankomat();
        bankomat.pulCek(700);
        bankomat.pulCek(200);
    }
}
