import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FireFightersCoursePage extends BasePage {
    public FireFightersCoursePage(WebDriver driver) {
        super(driver);
    }

    private WebElement getProctoringFor3Button() {
        return driver.findElement(By.xpath("//a[normalize-space()='Proctoring for - 3']"));
    }

    public BSecureCanvasProctoringFor3Page selectProctoringFor3Link() {
        getProctoringFor3Button().click();
        return new BSecureCanvasProctoringFor3Page(driver);
    }

//    public AssignmentsPage selectAssignmentsButton() {
//        getAssignmentsButton().click();
//        return new AssignmentsPage(driver);
//    }

//    @FindBy(xpath="//a[@class='assignments active']")
//    @CacheLookup
//    WebElement BSecureCanvasbutton;
//
//    public void selectAssignmentsButton()
//    {
//        BSecureCanvasbutton.click();
//    }

}