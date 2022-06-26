/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author m_gab
 */
public class SecretaryOfStateDriverLicenceRenewal {

    private WebDriver driver;
    private String baseUrl;

    public SecretaryOfStateDriverLicenceRenewal() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testSecretaryOfStateDriverLicenseRenewal() throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\Data\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.ilsos.gov/");
        driver.findElement(By.linkText("Driver's License/State ID")).click();
        driver.findElement(By.linkText("Driver's License/State ID Card Renewal")).click();
        driver.findElement(By.linkText("Driver's License or State ID Card Renewal")).click();
        driver.get("https://apps.ilsos.gov/renewaldlid/");
        Thread.sleep(5000);
        driver.close();
    }
}
