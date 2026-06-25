public class Tapsirig11 {
    public static void main(String[] args) {

        String parol = "Abb@2024";

        boolean uzunUygun = parol.length() > 8;
        //Uzunluğu 8-dən çoxdur?
        System.out.println("Uzunluğu 8-dən çoxdur?: " + uzunUygun);

        boolean xarakterVar = parol.contains("@");
        //"@" simvolu var mı? (xarakterVar)
        System.out.println("@ simvolu var mı?: " + xarakterVar);

        boolean abbIleBaslayir = parol.toUpperCase().startsWith("ABB");
        //Böyük hərfə çevirdikdə "ABB" ilə başlayırmı? (abbIleBaslayir)
        System.out.println("ABB ilə başlayır?: " + abbIleBaslayir);

        boolean reqemVar = parol.contains("2024");
        //Rəqəm var mı — "2024" hissəsi mövcuddur? (reqemVar)
        System.out.println("2024 hissəsi mövcuddur?: " + reqemVar);

        boolean gucluParol = uzunUygun && xarakterVar && abbIleBaslayir && reqemVar;
        //Parol güclüdür mi? (yuxarıdakı 4 şərt hamısı true) (gucluParol)
        System.out.println("Parol güclüdür mi?: " + gucluParol);
    }
}