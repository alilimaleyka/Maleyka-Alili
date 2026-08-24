package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DatePickerPage;

public class DatePickerTest extends BaseTest {

    @Test(priority = 1, description = "Tarix sahəsinə dəyər daxil edilir və ekranda düzgün əks olunduğu yoxlanılır")
    public void tarixSecimiTesti() {
        String gozlenilenTarix = "2026-12-25";

        DatePickerPage page = new DatePickerPage(driver);
        page.bolmeniAc()
                .tarixSec(gozlenilenTarix);

        Assert.assertEquals(page.ekrandakiTarix(), gozlenilenTarix,
                "Ekranda göstərilən tarix daxil edilən tarixlə uyğun gəlmir!");
    }

    @Test(priority = 2, description = "Tarix + saat sahəsinə dəyər daxil edilir və ekranda düzgün əks olunduğu yoxlanılır")
    public void tarixSaatSecimiTesti() {
        String gozlenilenDeyer = "2026-12-25T14:30";

        DatePickerPage page = new DatePickerPage(driver);
        page.bolmeniAc()
                .tarixSaatSec(gozlenilenDeyer);

        Assert.assertEquals(page.ekrandakiTarixSaat(), gozlenilenDeyer,
                "Ekranda göstərilən tarix-saat daxil edilən dəyərlə uyğun gəlmir!");
    }
}