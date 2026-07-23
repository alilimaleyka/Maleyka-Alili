public class Isci {

    //HR — İşçi və Menecer
    //inheritance · super()
    //general
    //Bir şirkətin HR sistemini modelləşdir. İşçi adlı ata class yarat — hər işçinin ad-ı var və bu, konstruktor
    // vasitəsilə təyin olunur. Menecer class-ı İşçi-dən miras alsın və əlavə olaraq komandaSayi xüsusiyyətinə
    // malik olsun. Menecerin konstruktoru həm ad, həm komanda sayını qəbul etsin və ata hissəni super vasitəsilə
    // qursun. Bir Menecer obyekti yaradıb məlumatlarını ekrana çıxar.

    String ad;
    public Isci(String ad) {
        this.ad = ad;
    }
}
