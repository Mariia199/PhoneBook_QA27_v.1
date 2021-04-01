import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LogOut extends TestBase {

    @BeforeMethod
    public void precondition()
    {
        wd.findElement(By.linkText("LOGIN")).click();
        List<WebElement> inputs = wd.findElements(By.tagName("input"));
        fillByElement(inputs.get(0), "mon447233@mail.com");
        fillByElement(inputs.get(1), "Mon12$447233");
        pause(7000);

        List<WebElement>buttons = wd.findElements(By.tagName("button"));
        buttons.get(0).click();
        pause(1000);
    }
    @Test
    public void logOutTest()
    {
       WebElement btns =  wd.findElement(By.tagName("button"));
       btns.click();
       pause(1000);

        String text = wd.findElement(By.tagName("button")).getText();
        Assert.assertEquals(text, "Login");






    }
}
