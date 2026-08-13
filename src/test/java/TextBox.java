import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TextBox {
    public static void main (String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://anarabbas.com/labs/auto-lab";
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement fullName = driver.findElement(By.id("fullName"));
        fullName.clear();
        fullName.sendKeys("Maleyka Alili");
        WebElement email = driver.findElement(By.id("userEmail"));
        email.clear();
        email.sendKeys("alilimaleyka@gmail.com");
        WebElement password = driver.findElement(By.id("passField"));
        password.clear();
        password.sendKeys("Meleyke55555");

        boolean allCorrect =
                fullName.getAttribute("value").equals("Maleyka Alili") &&
                        email.getAttribute("value").equals("alilimaleyka@gmail.com") &&
                        password.getAttribute("value").equals("Meleyke55555");

        if (allCorrect) {
            System.out.println("TEST UĞURLUDUR: Bütün sahələr düzgün dolduruldu");
        } else {
            System.out.println("TEST UĞURSUZDUR: Sahələrdən biri düzgün dolmadı");
        }

        driver.quit();

    }
}

