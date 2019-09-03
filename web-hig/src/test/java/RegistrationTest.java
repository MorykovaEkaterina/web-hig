
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {
    @Test
    public void testLogin(){
        click(By.xpath("//a[@class='btn btn-sm btn-link text-white']"));
        fillLoginForm("mor", "91");
        click(By.xpath("//input[@id='login']"));


    }

}
