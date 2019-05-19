import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;
    private Market market;

    public void init() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://yandex.ru");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        market = new Market(driver);
    }

    public void stop() {
        driver.quit();
    }

    public Market market() {
        return market;
    }
}
