package assignment_com_bng_calculator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleCalculatorTest extends BaseTest {
    @Test(priority=1)
    public void additionTest() throws InterruptedException {
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("_0p_2")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("plus")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("btn_2")).click();
        driver.findElement(By.id("_0p_1")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("equal")).click();
        Thread.sleep(1000);

        String actualResult = driver.findElement(By.id("formula")).getText();
        Assert.assertEquals(actualResult, "120");
    }

    @Test(priority=2)
    public void subtractionTest() throws InterruptedException {
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("_0p_2")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("minus")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("btn_2")).click();
        driver.findElement(By.id("_0p_1")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("equal")).click();
        Thread.sleep(1000);

        String actualResult = driver.findElement(By.id("formula")).getText();
        Assert.assertEquals(actualResult, "80");
    }

    @Test(priority=3)
    public void multiplicationTest() throws InterruptedException {
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("_0p_2")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("multi")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("btn_2")).click();
        driver.findElement(By.id("_0p_1")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("equal")).click();
        Thread.sleep(1000);

        String actualResult = driver.findElement(By.id("formula")).getText().replaceAll(",", "");
        Assert.assertEquals(actualResult, "2000");
    }

    @Test(priority=4)
    public void divisionTest() throws InterruptedException {
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("_0p_2")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("divi")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("btn_2")).click();
        driver.findElement(By.id("_0p_1")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("equal")).click();
        Thread.sleep(1000);

        String actualResult = driver.findElement(By.id("formula")).getText();
        Assert.assertEquals(actualResult, "5");
    }
}
