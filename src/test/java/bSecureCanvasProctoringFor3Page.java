import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class bSecureCanvasProctoringFor3Page extends BasePage {
    public bSecureCanvasProctoringFor3Page(WebDriver driver) {
        super(driver);
    }



    private WebElement getRescheduleButton() {
        return driver.findElement(By.xpath("//p[@class='font-semibold']"));
    }
    public SelectDateAndTimePage selectRescheduleButton() {
        getRescheduleButton().click();
        return new SelectDateAndTimePage(driver);
    }


}