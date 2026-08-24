package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProgressBarPage extends BasePage {

    public ProgressBarPage(WebDriver driver) {
        super(driver);
    }

    private By progressBarMenyu = By.xpath("//*[contains(text(),'Progress Bar')]");

    private By bar      = By.id("pgBar");
    private By startBtn = By.id("pgStart");
    private By stopBtn  = By.id("pgStop");
    private By resetBtn = By.id("pgReset");

    public ProgressBarPage bolmeniAc() {
        click(progressBarMenyu);
        waitForVisible(bar);
        return this;
    }

    public ProgressBarPage basla()    { click(startBtn); return this; }
    public ProgressBarPage dayandir() { click(stopBtn);  return this; }
    public ProgressBarPage sifirla()  { click(resetBtn); return this; }


    public int deyeriOxu() {
        return Integer.parseInt(getAttribute(bar, "aria-valuenow"));
    }

    public ProgressBarPage deyerArtanaQederGozle(int hedd) {
        wait.until(d -> deyeriOxu() > hedd);
        return this;
    }

    public ProgressBarPage deyerBerabterOlanaQederGozle(int gozlenilen) {
        wait.until(d -> deyeriOxu() == gozlenilen);
        return this;
    }

    public boolean deyerSabitQalirmi(int saniye, int gozlenilenDeyer) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(saniye))
                    .until(d -> deyeriOxu() != gozlenilenDeyer);
            return false;
        } catch (TimeoutException e) {
            return true;
        }
    }
}