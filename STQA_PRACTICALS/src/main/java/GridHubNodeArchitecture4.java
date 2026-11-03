import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URI;

public class GridHubNodeArchitecture4 extends RuntimeException {
    public static void main (String[] args) throws Exception {
        WebDriver driver = new RemoteWebDriver(URI.create("http://localhost:4444").toURL(),new FirefoxOptions());
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium Grid");
        driver.findElement((By.name("q"))).submit();

        System.out.println("Browser Title : " + driver.getTitle());
        driver.quit();
    }
}
