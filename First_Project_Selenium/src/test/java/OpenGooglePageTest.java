import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenGooglePageTest {
    ChromeDriver driver ;
@BeforeMethod
    public void setUp(){
    driver = new ChromeDriver();

}@Test
    public void testOpeningGooglePage(){
//driver.get("https://www.google.com/");
//driver.navigate; the same open the page
 driver.navigate().to("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Webdriver");

    }
    @Test
    public void testOpeningTrello(){
    driver.get("https://trello.com/");
    driver.findElementByLinkText("Log in.").click();
        //By.xpath("\\*[@href='/login']")).click();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
    Thread.sleep(2000);

    driver.quit();
    }
}
