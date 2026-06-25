public class Tapsirig13 {
    public static void main(String[] args) {

        String metn = "  Java proqramlaşdırma dili çox güclüdür!  ";

        int evvelUzunluq = metn.length();
        int sonraUzunluq = metn.trim().length();
        int ferq = evvelUzunluq - sonraUzunluq;

        System.out.println("Trim-dən əvvəl uzunluq: " + evvelUzunluq);
        System.out.println("Trim-dən sonra uzunluq: " + sonraUzunluq);
        System.out.println("Fərq: " + ferq);

        boolean javaVar = metn.contains("Java");
        boolean boyukJavaVar = metn.toUpperCase().contains("JAVA");

        System.out.println("\"Java\" sözü var: " + javaVar);
        System.out.println("Böyük hərflə yazanda \"JAVA\" var: " + boyukJavaVar);

        String evezOlunmusMetn = metn.replace("proqramlaşdırma", "programming");
        System.out.println("Əvəz olunmuş mətn: " + evezOlunmusMetn);

        String ilkDordHerf = metn.trim().substring(0, 4);
        System.out.println("İlk 4 hərf: " + ilkDordHerf);

        boolean nidaVar = metn.contains("!");
        System.out.println("\"!\" işarəsi var: " + nidaVar);

        String kicikVeTrim = metn.trim().toLowerCase();
        System.out.println("Kiçik hərflə və trim edilmiş: " + kicikVeTrim);
    }
}