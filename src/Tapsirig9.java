public class Tapsirig9 {
    public static void main(String[] args) {

        String kod = "  abb-2024  ";

        //System.out.println(kod.length());                    // ? — gözlənilən: 8 - Cavab: 12 olmalıdır, çünki başda və sonra olan məsafələrdə diqqətə alınmalıdır.
        //System.out.println(kod.contains("ABB"));              // ? — gözlənilən: true - Cavab: false çünki ABB böyüklə yazılıb axtarışa abb olsaydı, true olardı.
        //System.out.println(kod.trim() == "abb-2024");         // ? — gözlənilən: true - Cavab: false, çünki String dəyəri "==" bununla yox, "equals" ilə müqayisə edilməlidir.
        //System.out.println(kod.toUpperCase().contains("ABB")); // ? — gözlənilən: true - Cavab: true

        //Düz versiyaları aşağıdaki kimidir:
        System.out.println(kod.trim().length());
        System.out.println(kod.contains("abb"));
        System.out.println(kod.trim().equals("abb-2024"));
        System.out.println(kod.toUpperCase().contains("ABB"));
    }
}