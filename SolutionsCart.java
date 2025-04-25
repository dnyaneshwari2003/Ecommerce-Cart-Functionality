import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SolutionsCart {
    public static void main(String[] args) throws InterruptedException {
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Load the URL
        String url = "https://www.solutionsplusoutlet.ca/collections/cleaning-chemicals----surface-disinfectant";
        driver.get(url);

        System.out.println("Page Title: " + driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click '+' twice (Quantity becomes 3)
        WebElement plus = wait.until(ExpectedConditions.elementToBeClickable(By.className("plus")));
        plus.click();
        Thread.sleep(1000);
        plus.click();
        Thread.sleep(1000);

        // Click '-' once (Quantity becomes 2)
        WebElement minus = wait.until(ExpectedConditions.elementToBeClickable(By.className("minus")));
        try {
            minus.click();
        } catch (Exception e) {
            System.out.println("Standard click failed, using JS click...");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", minus);
        }

        Thread.sleep(1000);

        // Click 'Add to Cart'
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.className("prod-cbtn")));
        btn.click();
        System.out.println("Added 2 items to cart!");

        // Wait to observe result
        Thread.sleep(10000);

        // Close the browser
        driver.quit();
    }
}
