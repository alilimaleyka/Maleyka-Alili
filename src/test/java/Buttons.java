import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class Buttons {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://anarabbas.com/labs/auto-lab";
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement buttons = driver.findElement(By.xpath("//*[@id=\"pg-nav\"]/button[3]"));
        buttons.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");

        WebElement primaryClick = driver.findElement(By.id("clickBtn"));
        primaryClick.click();

        WebElement message = driver.findElement(By.id("btnNote"));
        String messageText = message.getText();
        if (messageText.equals("✓ 1 dəfə kliklendi")) {
            System.out.println("TEST UĞURLUDUR: " + messageText);
        } else {
            System.out.println("TEST UĞURSUZDUR, gələn mesaj: " + messageText);
        }

        Actions actions = new Actions(driver);
        WebElement doubleClick = driver.findElement(By.id("dblBtn"));
        actions.doubleClick(doubleClick).perform();
        WebElement doubleMessage = driver.findElement(By.id("btnNote"));
        String doubleMessagetext = doubleMessage.getText();
        if (doubleMessagetext.equals("✓ Double click qeydə alındı!")) {
            System.out.println("TEST UĞURLUDUR: " + doubleMessagetext);
        } else {
            System.out.println("TEST UĞURSUZDUR, gələn mesaj: " + doubleMessagetext);
        }

        WebElement rightClick = driver.findElement(By.id("rcBtn"));
        actions.contextClick(rightClick).perform();
        WebElement rightMessage = driver.findElement(By.id("btnNote"));
        String rightMessagetext = rightMessage.getText();
        if (rightMessagetext.equals("✓ Right click qeydə alındı!")) {
            System.out.println("TEST UĞURLUDUR: " + rightMessagetext);
        } else {
            System.out.println("TEST UĞURSUZDUR, gələn mesaj: " + rightMessagetext);
        }

        WebElement disabled = driver.findElement(By.xpath("//button[text()='Disabled']"));
        boolean isEnabled = disabled.isEnabled();
        if (!isEnabled) {
            System.out.println("TEST UĞURLUDUR: Düymə doğrudan da deaktivdir");
        } else {
            System.out.println("TEST UĞURSUZDUR: Düymə aktiv görünür");
        }

        driver.quit();
    }
}
