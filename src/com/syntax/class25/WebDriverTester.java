package com.syntax.class25;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] a = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver driver : a) {
            driver.closeBrowser();
            driver.openBrowser();
            driver.maximizeWindow();
            driver.findElement();
        }
    }
}
