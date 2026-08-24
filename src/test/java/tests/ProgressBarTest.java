package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProgressBarPage;

public class ProgressBarTest extends BaseTest {

    @Test(priority = 1, description = "Səhifə yüklənəndə proqres başlanğıc vəziyyətdə olmalıdır")
    public void baslangicVeziyyetTesti() {
        ProgressBarPage page = new ProgressBarPage(driver);
        page.bolmeniAc();

        Assert.assertEquals(page.deyeriOxu(), 0,
                "Səhifə yeni yükləndi, lakin proqres 0-dan fərqlidir!");
    }

    @Test(priority = 2, description = "Start düyməsindən sonra proqres artmalıdır")
    public void proqresinArtmasiTesti() {
        ProgressBarPage page = new ProgressBarPage(driver);
        page.bolmeniAc();

        int baslangic = page.deyeriOxu();

        page.basla()
                .deyerArtanaQederGozle(baslangic);

        int cari = page.deyeriOxu();

        Assert.assertTrue(cari > baslangic,
                "Proqres artmadı! Başlanğıc: " + baslangic + ", cari: " + cari);
    }

    @Test(priority = 3, description = "Stop düyməsindən sonra proqres dəyəri dəyişməməlidir")
    public void dayandirmaTesti() {
        ProgressBarPage page = new ProgressBarPage(driver);
        page.bolmeniAc();

        page.basla()
                .deyerArtanaQederGozle(0);

        page.dayandir();
        int dayandirmaAnindakiDeyer = page.deyeriOxu();

        Assert.assertTrue(page.deyerSabitQalirmi(2, dayandirmaAnindakiDeyer),
                "Stop basıldı, lakin proqres artmağa davam edir! Dəyər: " + dayandirmaAnindakiDeyer);
    }

    @Test(priority = 4, description = "Reset düyməsindən sonra proqres başlanğıc vəziyyətə qayıtmalıdır")
    public void sifirlamaTesti() {
        ProgressBarPage page = new ProgressBarPage(driver);
        page.bolmeniAc();

        page.basla()
                .deyerArtanaQederGozle(0);

        page.sifirla()
                .deyerBerabterOlanaQederGozle(0);

        Assert.assertEquals(page.deyeriOxu(), 0,
                "Reset basıldı, lakin proqres 0-a qayıtmadı!");
    }
}