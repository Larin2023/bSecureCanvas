

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test1 extends BaseTest {

@Test
public void workFlow() throws InterruptedException {
// Login to the application
    loginPage.open();
    MainPage mainPage = loginPage.loginToApp(username, password);


    Thread.sleep(5000);
    // Navigate to Fire Fighters Course page
    FireFightersCoursePage fireFightersCoursePage = mainPage.selectFireFightersCourse();

    Thread.sleep(5000);
    // Navigate to Proctoring for - 3 page
    bSecureCanvasProctoringFor3Page bSecureCanvasProctoringFor3PageObject = fireFightersCoursePage.selectProctoringFor3Link();

    // Perform actions on Proctoring for - 3 page
    driver.switchTo().frame(driver.findElement(By.id("tool_content")));
    bSecureCanvasProctoringFor3PageObject.selectRescheduleButton();
    }
}