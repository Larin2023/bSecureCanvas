import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Set;

public class Test1 extends BaseTest {

    @Test
    public void workFlow() throws InterruptedException {

        // Login to the application
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);

////
        Thread.sleep(3000);
        // Navigate to Fire Fighters Course page
        FireFightersCoursePage fireFightersCoursePage = mainPage.selectFireFightersCourse();

        Thread.sleep(3000);
        // Navigate to Proctoring for - 3 page
        BSecureCanvasProctoringFor3Page bSecureCanvasProctoringFor3PagePage = fireFightersCoursePage.selectProctoringFor3Link();

        Thread.sleep(8000);
        // Perform actions on Proctoring for - 3 page
        driver.switchTo().frame(driver.findElement(By.id("tool_content")));

        Thread.sleep(3000);
        SelectDateAndTimePage selectDateAndTimePage = bSecureCanvasProctoringFor3PagePage.selectRescheduleButton();

        selectDateAndTimePage.selectTime();

        Thread.sleep(3000);
        ProctoringFor3AuthenticationSystemCheckPage proctoringFor3AuthenticationSystemCheckPage = bSecureCanvasProctoringFor3PagePage.selectAuthenticationForProctoringButton();

        Thread.sleep(3000);
        proctoringFor3AuthenticationSystemCheckPage.selectTestSystemButton();

//        String mainWindowHandle = driver.getWindowHandle();
//        Set<String> windowHandles = driver.getWindowHandles();
//        for (String handle : windowHandles) {
//            if (!handle.equals(mainWindowHandle)) {
//                driver.switchTo().window(handle);
//                break;
//            }
        }
//        for (String windowHandle : driver.getWindowHandles()) {
//            driver.switchTo().window(windowHandle);
//        }
//
//        String popupPageSource = driver.getPageSource();
//        System.out.println(popupPageSource);

    }


//ChooseWhatToShareWithPage chooseWhatToShareWithPage =