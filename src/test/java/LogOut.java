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
        if(isElement(By.cssSelector("[href='/login']"))){
            logIn("mon447233@mail.com", "Mon12$447233");
        }

    }
    @Test
    public void LogOutTest2()
    {
        wd.findElement(By.cssSelector("button")).click();

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
