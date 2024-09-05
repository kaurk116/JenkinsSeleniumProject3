package com.automation;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test
public class Google {
    public class google {
        WebDriver driver = new EdgeDriver();

        @BeforeTest
        public void openbrowser() {
            EdgeOptions option = new EdgeOptions();
            option.addArguments("--guest");
            option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        }

       @Test
        public void testsearch() {
            driver.get("https://www.google.com");
        /*WebElement searchbox = driver.findElement(By.xpath("//textarea[@title=\"Search\"]"));
        searchbox.sendKeys("how learn selenium");
        //driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(1000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Google Search")));
        //driver.manage().timeouts().pageLoadTimeout(3000,TimeUnit.SECONDS);
        driver.findElement(By.linkText("Google Search")).click();
*/
            driver.quit();
        }
    }
}

