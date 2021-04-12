import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Start_Css_Locator extends TestBase{


    @Test
    public void testCss()
    {
        //by tagName
        wd.findElement(By.tagName("h1"));
        wd.findElement(By.cssSelector("h1"));

        wd.findElement(By.cssSelector("[href = '/login']")).click();
        //by id
        wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root"));
        //by class
        wd.findElement(By.className("container"));
        wd.findElement(By.cssSelector(".container"));
        wd.findElement(By.cssSelector("div#root.container"));

        wd.findElement(By.cssSelector("[placeholder = 'Email']"));

    }





}
