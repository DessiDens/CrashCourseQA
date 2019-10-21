import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by student on 10/17/2019.
 */
public class FirstTest {
    @Test
    public void FirstTests(){
        System.setProperty("webdriver.chrome.driver","\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("softserve it academy");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        String nameOfFirstLink = driver.FindElement(By.className("LC201b")).getText();
        Assert.assertEquals(nameOfFirstLink,"SoftServe:Home");

        driver.close();
    }
}
