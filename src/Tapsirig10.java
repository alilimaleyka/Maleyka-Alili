public class Tapsirig10 {
    public static void main(String[] args) {

        //int    meblег = 5000;
        Double    meblег = 5000.0; // Düzəltmək üçün 100.0 yox (double) istifadə etdim, çünki ən azı bir dəyər double olsa, nəticə də double kimi hesablanır.
        int    faiz   = 15;
        double faizMeblegi = meblег * faiz / 100;

        System.out.println("Faiz məbləği: " + faizMeblegi);
    }
}