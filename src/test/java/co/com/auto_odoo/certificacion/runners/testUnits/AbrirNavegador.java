package co.com.auto_odoo.certificacion.runners.testUnits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AbrirNavegador  {

    public static void main(String[] args) {
        String rutaDriver = "C:/Users/AndresCaraballo/Documents/Drivers/117.0.5938.92/chromedriver-win64/chromedriver-win64/chromedriver.exe";
        String url = "https://www.utest.com";
        ChromeOptions co = new ChromeOptions();
        WebDriver driver = new ChromeDriver(co);
        System.setProperty("webdriver.chrome.driver", rutaDriver);
        driver.get(url);
        driver.close();
    }

}
