import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProctoringFor3AuthenticationSystemCheckPage extends BasePage {
    public ProctoringFor3AuthenticationSystemCheckPage(WebDriver driver) {
        super(driver);
    }


    private WebElement getTestSystem() {
        return driver.findElement(By.xpath("//p[normalize-space()='Test System']"));
    }


        public CanvasExamdOrgWantsToPage selectTestSystemButton() {
        getTestSystem().click();
        return new CanvasExamdOrgWantsToPage(driver);
    }


//    public ChooseWhatToShareWithPage selectTestSystemButton() {
//        getTestSystem().click();
//        return new ChooseWhatToShareWithPage(driver);
//    }
}
