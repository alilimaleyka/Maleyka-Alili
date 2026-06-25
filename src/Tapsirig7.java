public class Tapsirig7 {
    public static void main(String[] args) {

        double temp = 36.8;
        boolean Temperatur = temp > 36 && temp < 37.5;
        //"Temperatur 36-dan çox, 37.5-dən azdır"
        System.out.println("Temperatur: " + Temperatur);

        int surет = 95, yanacaq = 0;
        boolean Sürət = (temp > 0 && temp < 120) || yanacaq > 0;
        //"Sürət 0-dan çox, 120-dən az VƏ YA yanacaq 0-dan çoxdur"
        System.out.println("Sürət: " + Sürət);

        boolean aktiv = false;
        double balans = -50.0;
        boolean Hesab = !aktiv || balans < 0;
        //"Hesab aktiv deyil VƏ ya balans mənfidir"
        System.out.println("Hesab: " + Hesab);

        String ad = "Anar";
        int yas = 22;
        boolean Ad = ad.length() > 0 && yas > 18;
        //"Ad boş deyil (uzunluğu 0-dan çoxdur) VƏ yaş 18-dən böyükdür"
        System.out.println("Ad: " + ad);
    }
}