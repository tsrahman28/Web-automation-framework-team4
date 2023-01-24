package testFreeCRM;
import base.CommonAPI;
import com.FreeCRM.pages.HomePage;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FetchLeftMenuTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(FetchLeftMenuTest.class.getName());

    testFreeCRM.LoginTest logintest = new testFreeCRM.LoginTest();
    HomePage homepage = new HomePage(getDriver());

    @Test
    public void FetchingLeftMenuTest(){
        LoginPage loginPage = new LoginPage(getDriver());
        //String email = ConnectDB.getTableColumnData("select * from cred","password").get(0);
        loginPage.typeEmailAddress("tsrahman28@gmail.com");
        loginPage.typePassword("Testaccount1@");
        loginPage.clickOnLoginButton();
        List<WebElement> elements = driver.findElements(By.xpath("//span[@class='item-text']"));
        System.out.print("Elements size:" + elements.size());
        for (WebElement listofElements : elements) {
            System.out.println("Paragraph text:" + listofElements.getText());
        }

    }
}
