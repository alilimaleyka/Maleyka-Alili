package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SlidersPage extends BasePage {

    private By slidersMenu = By.xpath("//button[contains(., 'Sliders')]");
    private By tempSlider = By.id("tempSlider");
    private By volSlider = By.id("volSlider");
    private By tempLabel = By.id("tempVal");
    private By volLabel = By.id("volVal");

    public SlidersPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://anarabbas.com/labs/auto-lab.html");
        click(slidersMenu);
    }

    public String getTemperatureLabel() {
        return waitForVisible(tempLabel).getText();
    }

    public String getVolumeLabel() {
        return waitForVisible(volLabel).getText();
    }

    public int getTemperatureValue() {
        return Integer.parseInt(waitForVisible(tempSlider).getAttribute("value"));
    }

    public int getVolumeValue() {
        return Integer.parseInt(waitForVisible(volSlider).getAttribute("value"));
    }

    public void setTemperature(int value) {
        setSliderValue(tempSlider, value);
    }

    public void setVolume(int value) {
        setSliderValue(volSlider, value);
    }

    private void setSliderValue(By sliderLocator, int targetValue) {
        WebElement slider = waitForVisible(sliderLocator);
        int current = Integer.parseInt(slider.getAttribute("value"));

        while (current != targetValue) {
            if (current < targetValue) {
                slider.sendKeys(Keys.ARROW_RIGHT);
            } else {
                slider.sendKeys(Keys.ARROW_LEFT);
            }
            current = Integer.parseInt(slider.getAttribute("value"));
        }
    }
}