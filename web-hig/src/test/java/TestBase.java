import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeClass
    public  void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.get("https://trello.com/");
    }

    protected void fillLoginForm(String email, String password) {
        type(By.xpath("//input[@id='user']"),email);
        type(By.xpath("//input[@id='password']"), password);
    }

    private void type(By locator, String text) {
        if(text!=null) {
            wd.findElement(locator).click();
            wd.findElement(locator).clear();
            wd.findElement(locator).sendKeys(text);
        }
    }
    public void click(By locator) {
        wd.findElement(locator).click();
    }

    @AfterClass
    public void tearDown(){
        wd.quit();
    }


}
