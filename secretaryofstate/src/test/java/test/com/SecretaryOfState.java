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
public class SecretaryOfState {

    private WebDriver driver;
    private String baseUrl;

    public SecretaryOfState() {
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

    @Test
    public void testSecretaryOfStateLicensePlateRenewal() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Data\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl + "chrome://newtab/");
        driver.get("https://www.google.com/search?q=secretary+of+state+illinois&oq=secretary+of+state+illinois&aqs=chrome."
                + "0.69i59j0i457i512j0i67j0i512l4j69i61.33899j0j7&sourceid=chrome&ie=UTF-8");
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/a/h3")).click();
        driver.get("https://www.ilsos.gov/");
        driver.findElement(By.linkText("License Plate Renewal")).click();
        driver.findElement(By.linkText("Renew")).click();
        driver.get("https://apps.ilsos.gov/LicenseRenewal/");
        Thread.sleep(5000);
        driver.close();
    }
}
