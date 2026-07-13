public class Tapsiriq5 {
    public static void main(String[] args) {

        double ilkinQiymet = 1000;
        double artmisQiymet = ilkinQiymet;
        int il = 0;

        while (artmisQiymet < ilkinQiymet * 2) {
            artmisQiymet = artmisQiymet + artmisQiymet * 8 / 100; il++;
            System.out.println("İl " + il + ": " + artmisQiymet + " AZN"); }
        System.out.println("Ümumi il sayı: " + il);
    }
}