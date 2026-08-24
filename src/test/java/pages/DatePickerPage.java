package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePickerPage extends BasePage {

    public DatePickerPage(WebDriver driver) {
        super(driver);
    }

    private By datePickerMenyu = By.xpath("//*[contains(text(),'Date Picker')]");

    private By tarixInput      = By.id("datePicker");
    private By tarixDeyeri     = By.id("dateValue");

    private By tarixSaatInput  = By.id("dateTimePicker");
    private By tarixSaatDeyeri = By.id("dateTimeValue");


    public DatePickerPage bolmeniAc() {
        click(datePickerMenyu);
        waitForVisible(tarixInput);
        return this;
    }

    public DatePickerPage tarixSec(String isoTarix) {
        setValueByJS(tarixInput, isoTarix);
        return this;
    }

    public DatePickerPage tarixSaatSec(String isoTarixSaat) {
        setValueByJS(tarixSaatInput, isoTarixSaat);
        return this;
    }


    public String ekrandakiTarix()     { return getText(tarixDeyeri); }
    public String ekrandakiTarixSaat() { return getText(tarixSaatDeyeri); }

    public String inputdakiTarix()     { return getValue(tarixInput); }
    public String inputdakiTarixSaat() { return getValue(tarixSaatInput); }
}