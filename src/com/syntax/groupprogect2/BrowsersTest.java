package com.syntax.groupprogect2;

public class BrowsersTest implements RemoteWebDriver {
    // parent class for all browsers classes
    public static void main(String[] args) {
        BrowsersTest[] browsersTests = {new ChromeDriver(), new FirfoxDriver(), new SafariDriver()};
        for (BrowsersTest a : browsersTests) {
            a.open();
            a.close();
            a.getScreenshot();
            a.getTitle();
            a.navigate();
        }
    }

    //overridden methods from RemoteWebDriver interface
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}

interface WebDriver {
    void open();

    void close();

    String getTitle();
}

interface TakesSceenshot {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesSceenshot {
    void navigate();
}

// Browser classes with unique implementation of RemoteWebDriver interface
class ChromeDriver extends BrowsersTest implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("opening Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("closing Chrome browser");
    }

    @Override
    public String getTitle() {
        return "Chrome";
    }

    @Override
    public void getScreenshot() {
        System.out.println("getting screenshots in Chrome");
    }

    @Override
    public void navigate() {
        System.out.println("navigating through Chrome browser");
    }
}

class FirfoxDriver extends BrowsersTest implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("opening Firefox browser");
    }

    @Override
    public void close() {
        System.out.println("closing Firefox browser");
    }

    @Override
    public String getTitle() {
        return "Firefox";
    }

    @Override
    public void getScreenshot() {
        System.out.println("getting screenshots in Firefox");
    }

    @Override
    public void navigate() {
        System.out.println("navigating through Firefox browser");
    }
}


class SafariDriver extends BrowsersTest implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("opening Safari browser");
    }

    @Override
    public void close() {
        System.out.println("closing Safari browser");
    }

    @Override
    public String getTitle() {
        return "Safari";
    }

    @Override
    public void getScreenshot() {
        System.out.println("getting screenshots in Safari");
    }

    @Override
    public void navigate() {
        System.out.println("navigating through Safari browser");
    }
}
