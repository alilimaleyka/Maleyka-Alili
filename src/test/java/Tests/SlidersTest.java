package Tests;

import Base.BaseTest;
import Pages.SlidersPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SlidersTest extends BaseTest {
    // Test 1
    @Test(description = "Default deyerler: temperatur 50°C, ses 75%")
    public void verifyDefaultValues() {

        SlidersPage page = new SlidersPage(driver);
        page.open();

        Assert.assertEquals(page.getTemperatureLabel(), "50°C",
                "Temperature label-i 50°C olmali idi!");

        Assert.assertEquals(page.getVolumeLabel(), "75%",
                "Volume label-i 75% olmali idi!");
    }
    // Test 2
    @Test(description = "Temperature slider 25°C-ye cekilir")
    public void verifyTemperatureChange() {

        SlidersPage page = new SlidersPage(driver);
        page.open();

        page.setTemperature(25);

        Assert.assertEquals(page.getTemperatureLabel(), "25°C",
                "Temperature label-i 25°C olmali idi!");
    }
    // Test 3
    @Test(description = "Volume slider 40%-e cekilir")
    public void verifyVolumeChange() {

        SlidersPage page = new SlidersPage(driver);
        page.open();

        page.setVolume(40);

        Assert.assertEquals(page.getVolumeLabel(), "40%",
                "Volume label-i 40% olmali idi!");
    }
     // Test 4
    @Test(description = "Temperature serhedleri: 0°C ve 100°C")
    public void verifyTemperatureBoundaries() {

        SlidersPage page = new SlidersPage(driver);
        page.open();

        // Minimum
        page.setTemperature(0);
        int min = page.getTemperatureValue();

        Assert.assertEquals(page.getTemperatureLabel(), "0°C",
                "Minimum-da label 0°C olmali idi!");
        Assert.assertTrue(min >= 0,
                "Temperatur 0-dan asagi dusdu: " + min);

        // Maksimum
        page.setTemperature(100);
        int max = page.getTemperatureValue();

        Assert.assertEquals(page.getTemperatureLabel(), "100°C",
                "Maksimum-da label 100°C olmali idi!");
        Assert.assertTrue(max <= 100,
                "Temperatur 100-den yuxari cixdi: " + max);
    }

    // Test 5
    @Test(description = "Volume serhedleri: 0% ve 100%")
    public void verifyVolumeBoundaries() {

        SlidersPage page = new SlidersPage(driver);
        page.open();

        // Minimum
        page.setVolume(0);
        int min = page.getVolumeValue();

        Assert.assertEquals(page.getVolumeLabel(), "0%",
                "Minimum-da label 0% olmali idi!");
        Assert.assertTrue(min >= 0,
                "Ses 0-dan asagi dusdu: " + min);

        // Maksimum
        page.setVolume(100);
        int max = page.getVolumeValue();

        Assert.assertEquals(page.getVolumeLabel(), "100%",
                "Maksimum-da label 100% olmali idi!");
        Assert.assertTrue(max <= 100,
                "Ses 100-den yuxari cixdi: " + max);
    }
}