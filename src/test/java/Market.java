import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Market extends HelperBase {
    public Market(WebDriver driver) {
        super(driver);
    }

    public void goTo(String category) {
        driver.findElement(By.linkText("Маркет")).click();
        driver.findElement(By.linkText("Компьютерная техника")).click();
        driver.findElement(By.linkText(category)).click();
    }

    public void priceFrom(String price) {
        driver.findElement(By.name("Цена от")).sendKeys(price);
    }

    public void priceTo(String price) {
        driver.findElement(By.name("Цена до")).sendKeys(price);
    }

    public void chooseMaker(String maker) {
        WebElement element = driver.findElement(By.xpath("//input[@name='Производитель " + maker + "']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public int sizeElements() {
        List<WebElement> elements = driver.findElements(By.className("n-snippet-card2__title"));
        return elements.size();
    }

    public String firstElement() {
        List<WebElement> elements = driver.findElements(By.className("n-snippet-card2__title"));
        String name = elements.get(0).getText();
        return name;
    }

    public void search(String name) {
        driver.findElement(By.id("header-search")).sendKeys(name);
    }

    public void showAllMakers() {
        driver.findElement(By.linkText("Показать всё")).click();
    }

    public void waiting() throws InterruptedException {
        Thread.sleep(3000);
    }

}
